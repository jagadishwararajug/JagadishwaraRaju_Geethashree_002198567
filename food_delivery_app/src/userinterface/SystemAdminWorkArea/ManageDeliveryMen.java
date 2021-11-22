/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Role.DeliveryManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageDeliveryMen extends javax.swing.JPanel {

    private final EcoSystem system;
    private final JPanel container;

    
    public ManageDeliveryMen(JPanel container, EcoSystem system) {
        initComponents();
        this.system = system;
        this.container = container;
        
        dmTable.setShowHorizontalLines(true);
        dmTable.setShowVerticalLines(true);
        populateTableWithDeliveryMen();
        
        
    }
    
    public void populateTableWithDeliveryMen() {
        DefaultTableModel model = (DefaultTableModel) dmTable.getModel();
        model.setRowCount(0);
        for (DeliveryMan dm : system.getDeliveryManDirectory().getDeliveryManList()) {
            Object[] row = new Object[6];
            row[0] = dm;
            row[1] = dm.getAddress();
            row[2] = dm.getPhoneNumber();
            row[3] = dm.getDriversLicense();
            row[4] = dm.getVehicleNumber();
            row[5] = dm.getUserAccount().getUsername();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dmTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        licenseText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        vehicleText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        dmTable.setBackground(new java.awt.Color(255, 255, 204));
        dmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Phone", "License", "Vehicle Number", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dmTable);

        jLabel1.setText("Name : ");

        jLabel3.setText("Phone Number :");

        jLabel4.setText("Address : ");

        jLabel5.setText("Username : ");

        jLabel6.setText("Password: ");

        addButton.setBackground(new java.awt.Color(0, 0, 51));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 204));
        addButton.setText("Add Delivery Man");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 0, 51));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 204));
        updateButton.setText("Update Selected Delivery Man");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 0, 51));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 204));
        deleteButton.setText("Delete Selected Delivery Man");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Drivers License: ");

        licenseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseTextActionPerformed(evt);
            }
        });

        jLabel7.setText("Vehicle Number:");

        backButton.setBackground(new java.awt.Color(0, 0, 51));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 204));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel8.setText("Manage Delivery Men");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addContainerGap(136, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneText)
                                    .addComponent(addressText)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameText)
                                    .addComponent(passwordText)
                                    .addComponent(licenseText)
                                    .addComponent(vehicleText))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(licenseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vehicleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private DeliveryMan parseDeliveryMan() {
        DeliveryMan man = new DeliveryMan();
        UserAccount ua = new UserAccount();
        
        
        if (man.setName(nameText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Name is not in a valid format");
            return null;
        }
        
        if (man.setPhoneNumber(phoneText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Phone is not in a valid format");
            return null;
        }
        
        if (man.setAddress(addressText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Address is not in a valid format");
            return null;
        }
        
        if (ua.setUsername(usernameText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Username is not in a valid format.");
            return null;
        }
        
        if (ua.setPassword(passwordText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Password is not in a valid format.");
            return null;
        }
        
        if(man.setDriversLicense(licenseText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "License is not in a valid format.");
            return null;
        }
        
        if(man.setVehicleNumber(vehicleText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Vehicle Number is not in a valid format.");
            return null;
        }
        
        ua.setRole(new DeliveryManRole());
        ua.setEmployee(man);
        man.setUserAccount(ua);
        
        return man;
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = dmTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be updated.");
            return;
        }
        
        DeliveryMan man = parseDeliveryMan();
        if (man == null)
            return;

        DeliveryMan oldMan = system.getDeliveryManDirectory().getDeliveryManList().get(selectedRow);        
        // update user account
        int uaIdx = system.getUserAccountDirectory().getUserAccountList().indexOf(oldMan.getUserAccount());
        if (system.getUserAccountDirectory().updateUserAccount(uaIdx, man.getUserAccount()) == false) {
            JOptionPane.showMessageDialog(this, "Username already exists.");
            return;
        }
        // update delivery man
        system.getDeliveryManDirectory().updateDeliveryMan(selectedRow, man);
        
        JOptionPane.showMessageDialog(this, "Delivery Man updated successfully.");
        populateTableWithDeliveryMen();
        clearFields();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        DeliveryMan man = parseDeliveryMan();
        if (man == null)
            return;
        
        if (system.getUserAccountDirectory().addUserAccount(man.getUserAccount()) == false) {
            JOptionPane.showMessageDialog(this, "Username already exists.");
            return;
        }
        system.getDeliveryManDirectory().addDeliveryMan(man);
        
        JOptionPane.showMessageDialog(this, "Delivery Man added successfully.");
        populateTableWithDeliveryMen();
        clearFields();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = dmTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted.");
            return;
        }
        DeliveryMan man = system.getDeliveryManDirectory().getDeliveryManList().get(selectedRow);        
        
        //remove user account
        system.getUserAccountDirectory().removeUserAccount(man.getUserAccount());
        // remove delivery man
        system.getDeliveryManDirectory().removeDeliveryMan(man);
        JOptionPane.showMessageDialog(this, "Delivery Man deleted successfully.");
        populateTableWithDeliveryMen();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void licenseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable dmTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField licenseText;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameText;
    private javax.swing.JTextField vehicleText;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        nameText.setText("");
        phoneText.setText("");
        addressText.setText("");
        usernameText.setText("");
        passwordText.setText("");
        licenseText.setText("");
        vehicleText.setText("");
    }
}
