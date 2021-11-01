/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignment4.ui;

import assignment4.model.City;
import assignment4.model.Community;
import assignment4.model.Encounter;
import assignment4.model.HealthSystem;
import assignment4.model.House;
import assignment4.model.Patient;
import assignment4.model.PatientDirectory;
import assignment4.model.Person;
import assignment4.model.VitalSigns;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;


public class StatisticsPanel extends javax.swing.JPanel {

    private HealthSystem system;
    private ArrayList<String> commNames;
    private ArrayList<Community> comms;
    private Community selectedCommunity;
    
    public boolean isBloodPressureNormal(int age, float dbp, float sbp) {
        if (age < 0 || age > 150 || dbp < 0 || sbp < 0) {
            return false; //invalid input
        }
        if (age < 1) {
            if ((50 <= dbp) && (dbp <= 75) && (75 <= sbp) && (sbp <= 110))
                return true;
        } else if (age >=1 && age <= 5) {
            if ((55 <= dbp) && (dbp <= 79) && (80 <= sbp) && (sbp <= 110))
                return true;
        } else if (age >=6 && age <= 13) {
            if ((60 <= dbp) && (dbp <= 80) && (90 <= sbp) && (sbp <= 115))
                return true;
        } else if (age >=14 && age <= 19) {
            if ((73 <= dbp) && (dbp <= 81) && (105 <= sbp) && (sbp <= 120))
                return true;
        } else if (age >=20 && age <= 24) {
            if ((75 <= dbp) && (dbp <= 83) && (108 <= sbp) && (sbp <= 132))
                return true;
        } else if (age >=25 && age <= 29) {
            if ((76 <= dbp) && (dbp <= 84) && (109 <= sbp) && (sbp <= 133))
                return true;
        } else if (age >=30 && age <= 34) {
            if ((77 <= dbp) && (dbp <= 85) && (110 <= sbp) && (sbp <= 134))
                return true;
        } else if (age >=35 && age <= 39) {
            if ((78 <= dbp) && (dbp <= 86) && (111 <= sbp) && (sbp <= 135))
                return true;
        } else if (age >=40 && age <= 44) {
            if ((79 <= dbp) && (dbp <= 87) && (112 <= sbp) && (sbp <= 137))
                return true;
        } else if (age >=45 && age <= 49) {
            if ((80 <= dbp) && (dbp <= 88) && (115 <= sbp) && (sbp <= 139))
                return true;
        } else if (age >=50 && age <= 54) {
            if ((81 <= dbp) && (dbp <= 89) && (116 <= sbp) && (sbp <= 142))
                return true;
        } else if (age >=55 && age <= 59) {
            if ((82 <= dbp) && (dbp <= 90) && (118 <= sbp) && (sbp <= 144))
                return true;
        } else if (age >=60) {
            if ((83 <= dbp) && (dbp <= 91) && (121 <= sbp) && (sbp <= 147))
                return true;
        }
        return false;
    }

//    public boolean isPersonsBloodPressureNormal(Person person) {
//        int age = person.getAge();
//        ArrayList<Encounter> encounterList = person.getPatient().getEncounterHistory().getEncounterList();
//        if (encounterList.size() == 0)
//            return true; // if there are no encounters, we assume that the persons blood pressure is normal
//
//        Encounter latestEncounter = encounterList.get(encounterList.size() - 1);
//        VitalSigns vitals = latestEncounter.getVitalSigns();
//
//        return isBloodPressureNormal(age, vitals.getDbp(), vitals.getSbp());
//    }
    
    public boolean isPersonsBloodPressureNormal(Patient patient) {
        Person person = patient.getPerson();
        int age = person.getAge();
        ArrayList<Encounter> encounterList = patient.getEncounterHistory().getEncounterList();
        if (encounterList.size() == 0)
            return true; // if there are no encounters, we assume that the persons blood pressure is normal

        Encounter latestEncounter = encounterList.get(encounterList.size() - 1);
        VitalSigns vitals = latestEncounter.getVitalSigns();

        return isBloodPressureNormal(age, vitals.getDbp(), vitals.getSbp());
    }

    private ArrayList<AbnormalEncounter> getHighFeverInCommunity(PatientDirectory patientDir, Community community) {
        ArrayList<AbnormalEncounter> abnormals = new ArrayList<>();
        for(Patient patient: patientDir.getPatients()) {
            if (patient.getPerson().getHouse().getCommunity().equals(community))
                if (isHighFever(patient)) {
                    AbnormalEncounter ab = new AbnormalEncounter();
                    ArrayList<Encounter> encounterList = patient.getEncounterHistory().getEncounterList();
                    ab.encounter = encounterList.get(encounterList.size() - 1);
                    ab.patient = patient;
                    abnormals.add(ab);
                }
        }
        return abnormals;
    }

    private boolean isHighFever(Patient patient) {
        ArrayList<Encounter> encList = patient.getEncounterHistory().getEncounterList();
        if (encList.size() == 0)
            return false; // we assume that a patient doesn't have fever if they have no encounters
        
        Encounter enc = encList.get(encList.size() - 1);
        if(enc.getVitalSigns().getTemperature() > 101.1f) 
            return true;
        return false;
    }
    
    class AbnormalEncounter {
        Encounter encounter;
        Patient patient;
    }
    
    public ArrayList<AbnormalEncounter> getAbnormalBPInCommunity(PatientDirectory patientDir, Community community) {
        ArrayList<AbnormalEncounter> abnormals = new ArrayList<>();
        for(Patient patient: patientDir.getPatients()) {
            if (patient.getPerson().getHouse().getCommunity().equals(community))
                if (isPersonsBloodPressureNormal(patient) == false) {
                    AbnormalEncounter ab = new AbnormalEncounter();
                    ArrayList<Encounter> encounterList = patient.getEncounterHistory().getEncounterList();
                    ab.encounter = encounterList.get(encounterList.size() - 1);
                    ab.patient = patient;
                    abnormals.add(ab);
                }
        }
        return abnormals;
    }

//    public int getNumAbnormalBPInCommunity(Community community) {
//        int count = 0;
//        for(House house: community.getHouseList()) {
//            for (Person person: house.getResidents()) {
//                if (isPersonsBloodPressureNormal(person) == false)
//                    count++;
//            }
//        }
//        return count;
//    }

    /**
     * Creates new form StatisticsPanel
     */
    public StatisticsPanel(HealthSystem system) {
        initComponents();
        this.system = system;
        
        communityCBox.removeAllItems();
        
        commNames = new ArrayList<>();
        comms = new ArrayList<>();
        for (City c: system.getCityList()){
            for (Community com : c.getCommunities()) {
                String curCom = com.toString();
                if(commNames.contains(curCom) == false){
                    commNames.add(curCom);
                    comms.add(com);
                }
            }
        }
        
        for(String com : commNames)
            communityCBox.addItem(com);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        communityCBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        abnormalBPText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        encounterTable = new javax.swing.JTable();
        bpButton = new javax.swing.JButton();
        feverButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        feverText = new javax.swing.JLabel();

        communityCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityCBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Number  of patients with abnormal blood pressure = ");

        encounterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient", "Doctor", "BP", "Heart Rate", "Temperature", "SPO2", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(encounterTable);

        bpButton.setText("Show patients with abnormal blood pressure");
        bpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpButtonActionPerformed(evt);
            }
        });

        feverButton.setText("Show patients with high fever (above 101.1 F)");
        feverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feverButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Number  of patients with high fever = ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(communityCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bpButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abnormalBPText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(feverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feverText)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(communityCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpButton)
                    .addComponent(jLabel1)
                    .addComponent(abnormalBPText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feverButton)
                    .addComponent(jLabel3)
                    .addComponent(feverText))
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void communityCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityCBoxActionPerformed
        // TODO add your handling code here:
        int curIndex = communityCBox.getSelectedIndex();
        selectedCommunity = comms.get(curIndex);
        abnormalBPText.setText("");
        feverText.setText("");
        DefaultTableModel model = (DefaultTableModel) encounterTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_communityCBoxActionPerformed

    private void bpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<AbnormalEncounter> abList = getAbnormalBPInCommunity(system.getPatientDirectory(), selectedCommunity);
        
        abnormalBPText.setText(abList.size() + "");
        displayEncounters(abList);
    }//GEN-LAST:event_bpButtonActionPerformed

    private void feverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feverButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<AbnormalEncounter> abList = getHighFeverInCommunity(system.getPatientDirectory(), selectedCommunity);
        
        feverText.setText(abList.size() + "");
        displayEncounters(abList);
    }//GEN-LAST:event_feverButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abnormalBPText;
    private javax.swing.JButton bpButton;
    private javax.swing.JComboBox<String> communityCBox;
    private javax.swing.JTable encounterTable;
    private javax.swing.JButton feverButton;
    private javax.swing.JLabel feverText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void displayEncounters(ArrayList<AbnormalEncounter> abEncs) {
        DefaultTableModel model = (DefaultTableModel) encounterTable.getModel();
        model.setRowCount(0);
        for (AbnormalEncounter ab : abEncs) {
            Object[] row = new Object[7];
            row[0] = ab.patient.getPerson().getName();
            Encounter e = ab.encounter;
            row[1] = e.getDoctor();
            VitalSigns vt = e.getVitalSigns();
            row[2] = ((int)vt.getDbp()) + "/" + ((int)vt.getSbp());
            row[3] = vt.getHeartRate();
            row[4] = vt.getTemperature();
            row[5] = vt.getSpo2();
            row[6] = ab.patient.getPerson().getAge();
            model.addRow(row);
        }
    }
}
