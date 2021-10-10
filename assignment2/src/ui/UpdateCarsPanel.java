package ui;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarType;
import model.Driver;
import model.MaintenanceCertificate;
import model.Uber;

public class UpdateCarsPanel extends javax.swing.JPanel {

    private Uber uber;
    private int currentCarIndex;

    /**
     * Creates new form DisplayCarsPanel
     */
    public UpdateCarsPanel(Uber uber) {
        initComponents();
        this.currentCarIndex = -1;
        this.uber = uber;
        populateTable(this.uber);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        carTypeButtonGroup = new javax.swing.ButtonGroup();
        availableButtonGroup = new javax.swing.ButtonGroup();
        genderButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        carsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        manufactureYearText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        driverNameText = new javax.swing.JTextField();
        numSeatsText = new javax.swing.JTextField();
        validTillText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        serialNumText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        modelNumberText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        cityText = new javax.swing.JTextField();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        passengerRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        commercialRadioButton = new javax.swing.JRadioButton();
        rentalRadioButton = new javax.swing.JRadioButton();
        ageText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        manufacturerText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        certNumText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        validFromText = new javax.swing.JTextField();
        viewButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Manufacturer", "Model Number", "Seats", "Driver", "Availability", "Car Type", "Manufacture Year", "Serial Number", "Maintenance Certificate", "Certificate Expiration", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carsTable);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Cars");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Driver Name");

        jLabel10.setText("Number of Seats");

        jLabel16.setText("Cert Valid Till");

        driverNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverNameTextActionPerformed(evt);
            }
        });

        validTillText.setToolTipText("yyyy-MM-dd HH:mm:ss");

        jLabel11.setText("Serial Number");

        jLabel12.setText("Model Number");

        jLabel6.setText("Driver Gender");

        jLabel13.setText("City");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        genderButtonGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");

        carTypeButtonGroup.add(passengerRadioButton);
        passengerRadioButton.setText("Passenger");
        passengerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerRadioButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Driver Age");

        carTypeButtonGroup.add(commercialRadioButton);
        commercialRadioButton.setText("Commercial");
        commercialRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commercialRadioButtonActionPerformed(evt);
            }
        });

        carTypeButtonGroup.add(rentalRadioButton);
        rentalRadioButton.setText("Rental");

        jLabel8.setText("Manufacturer");

        jLabel4.setText("Available");

        jLabel3.setText("Car Type");

        jLabel14.setText("Maintenance Cert Num");

        jLabel15.setText("Cert Valid From");

        availableButtonGroup.add(yesRadioButton);
        yesRadioButton.setText("Yes");

        availableButtonGroup.add(noRadioButton);
        noRadioButton.setText("No");

        jLabel9.setText("Manufacture Year");

        validFromText.setToolTipText("yyyy-MM-dd HH:mm:ss");

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addGap(50, 50, 50)
                                        .addComponent(femaleRadioButton)
                                        .addGap(48, 48, 48)
                                        .addComponent(otherRadioButton))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yesRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(noRadioButton))
                                    .addComponent(driverNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passengerRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(commercialRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rentalRadioButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(manufacturerText)
                                    .addComponent(manufactureYearText)
                                    .addComponent(numSeatsText)
                                    .addComponent(serialNumText)
                                    .addComponent(modelNumberText)
                                    .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(certNumText)
                                    .addComponent(validFromText)
                                    .addComponent(validTillText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(viewButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passengerRadioButton)
                    .addComponent(commercialRadioButton)
                    .addComponent(rentalRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yesRadioButton)
                    .addComponent(noRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(driverNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton)
                    .addComponent(otherRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(manufacturerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(manufactureYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(numSeatsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(serialNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(modelNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(certNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(validFromText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(validTillText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = carsTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted.");
            return;
        }
        
        Car car = (Car) carsTable.getValueAt(selectedRow, 0);
        if(uber.deleteCar(car))
            JOptionPane.showMessageDialog(this, "Selected car was deleted.");
        else
            return;
        
        populateTable(this.uber);
        this.currentCarIndex = -1; // removal of elements from the list may 
                            // cause this index to no longer be valid
                            // user needs to select the entry again and update it
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void driverNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverNameTextActionPerformed

    private void passengerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengerRadioButtonActionPerformed

    private void commercialRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commercialRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commercialRadioButtonActionPerformed

    private boolean showMessageIfNotSet(boolean isSet, String fieldName) {
        if (isSet == false) 
            JOptionPane.showMessageDialog(this, fieldName + " is not valid.");
        return isSet;
    }
    
    private String getSelectedGender() {
        if(maleRadioButton.isSelected())
            return "Male";
        else if (femaleRadioButton.isSelected())
            return "Female";
        else if (otherRadioButton.isSelected())
            return "Other";
        else
            return "";
    }
    
    private CarType getCarType() {
        if(passengerRadioButton.isSelected()) {
            return CarType.PASSENGER;
        } else if (rentalRadioButton.isSelected()) 
            return CarType.RENTAL;
        else if (commercialRadioButton.isSelected())
            return CarType.COMMERCIAL;
        else
            return null;
    }
    
    private Boolean getAvailability() {
        if (yesRadioButton.isSelected())
            return true;
        else if (noRadioButton.isSelected())
            return false;
        else
            return null;
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (currentCarIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select and view a row before updating the row");
            return;
        }
        Car car = new Car();
        Driver driver = new Driver();
        MaintenanceCertificate cert = new MaintenanceCertificate();
        
        if (showMessageIfNotSet(car.setCarType(getCarType()), "Car Type") == false)
            return;
        
        Boolean isAvailable = getAvailability();
        if (isAvailable == null) {
            JOptionPane.showMessageDialog(this, "Please mention the car availablity.");
            return;
        }
        car.setIsAvailable(isAvailable);
        
        if (showMessageIfNotSet(driver.setName(driverNameText.getText()), "Driver Name") == false)
            return;
 
        if (showMessageIfNotSet(driver.setGender(getSelectedGender()), "Gender") == false)
            return;
        
        if (showMessageIfNotSet(driver.setAge(ageText.getText()), "Age") == false)
            return;
        
        if (showMessageIfNotSet(car.setManufacturer(manufacturerText.getText()), "Manufacturer") == false)
            return;
        
        if (showMessageIfNotSet(car.setManufactureYear(manufactureYearText.getText()), "Manufacture Year") == false)
            return;
        
        if (showMessageIfNotSet(car.setNumSeats(numSeatsText.getText()), "Number of seats") == false)
            return;
        
        if (showMessageIfNotSet(car.setSerialNumber(serialNumText.getText()), "Serial Number") == false)
            return;
        
        if (showMessageIfNotSet(car.setModelNumber(modelNumberText.getText()), "Model Number") == false)
            return;
        
        if (showMessageIfNotSet(car.setCity(cityText.getText()), "City") == false)
            return;
        
        if (showMessageIfNotSet(cert.setCertificate(certNumText.getText()), "Maintenance Certificate Number") == false)
            return;
        
        if (showMessageIfNotSet(cert.setValidFromStr(validFromText.getText()), "Maintenance Certificate Valid From") == false){
            JOptionPane.showMessageDialog(this, "Certificate validity time format - yyyy-MM-dd HH:mm:ss");
            return;
        }
        
        if (showMessageIfNotSet(cert.setValidTillStr(validTillText.getText()), "Maintenance Certificate Valid Till") == false){
            JOptionPane.showMessageDialog(this, "Certificate validity time format - yyyy-MM-dd HH:mm:ss");
            return;
        }
        
        car.setDriver(driver);
        car.setMaintenanceCertificate(cert);
        
        uber.updateCar(this.currentCarIndex, car);
        
        JOptionPane.showMessageDialog(this, "Car Information updated");
        populateTable(this.uber);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = carsTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed.");
            return;
        }
        
        Car car = (Car) carsTable.getValueAt(selectedRow, 0);
        this.currentCarIndex = uber.findIndexWithSerialNumber(car.getSerialNumber());
        populateCarDetails(car);
    }//GEN-LAST:event_viewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.ButtonGroup availableButtonGroup;
    private javax.swing.ButtonGroup carTypeButtonGroup;
    private javax.swing.JTable carsTable;
    private javax.swing.JTextField certNumText;
    private javax.swing.JTextField cityText;
    private javax.swing.JRadioButton commercialRadioButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField driverNameText;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField manufactureYearText;
    private javax.swing.JTextField manufacturerText;
    private javax.swing.JTextField modelNumberText;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JTextField numSeatsText;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JRadioButton passengerRadioButton;
    private javax.swing.JRadioButton rentalRadioButton;
    private javax.swing.JTextField serialNumText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField validFromText;
    private javax.swing.JTextField validTillText;
    private javax.swing.JButton viewButton;
    private javax.swing.JRadioButton yesRadioButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable(Uber uber) {
        DefaultTableModel model = (DefaultTableModel) carsTable.getModel();
        model.setRowCount(0);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");  
        for (Car c: uber.getAllCars()) {
            Object[] row = new Object[11];
            row[0] = c;
            row[1] = c.getModelNumber();
            row[2] = c.getNumSeats();
            row[3] = c.getDriver().getName();
            row[4] = c.isIsAvailable();
            row[5] = c.getCarType();
            row[6] = c.getManufactureYear();
            row[7] = c.getSerialNumber();
            row[8] = c.getMaintenanceCertificate().getCertificate();
            row[9] = formatter.format(c.getMaintenanceCertificate().getValidTill());
            row[10] = c.getCity();
            model.addRow(row);
        }
    }

    private void populateCarDetails(Car car) {
        setCarType(car.getCarType());
        setAvailability(car.isIsAvailable());
        driverNameText.setText(car.getDriver().getName());
        setGender(car.getDriver().getGender());
        ageText.setText(car.getDriver().getAge() + "");
        manufacturerText.setText(car.getManufacturer());
        manufactureYearText.setText(car.getManufactureYear() + "");
        numSeatsText.setText(car.getNumSeats() + "");
        serialNumText.setText(car.getSerialNumber());
        modelNumberText.setText(car.getModelNumber());
        cityText.setText(car.getCity());
        MaintenanceCertificate cert = car.getMaintenanceCertificate();
        certNumText.setText(cert.getCertificate());
        validFromText.setText(cert.getDateFormat().format(cert.getValidFrom()));
        validTillText.setText(cert.getDateFormat().format(cert.getValidTill()));
    }

    private void setCarType(CarType carType) {
        if(carType == CarType.COMMERCIAL)
            commercialRadioButton.setSelected(true);
        else if (carType == CarType.PASSENGER)
            passengerRadioButton.setSelected(true);
        else if (carType == CarType.RENTAL)
            rentalRadioButton.setSelected(true);
    }

    private void setAvailability(boolean isAvailable) {
        if (isAvailable)
            yesRadioButton.setSelected(true);
        else
            noRadioButton.setSelected(true);
    }

    private void setGender(String gender) {
        if (gender.toLowerCase().equals("male"))
            maleRadioButton.setSelected(true);
        else if (gender.toLowerCase().equals("female"))
            femaleRadioButton.setSelected(true);
        else if (gender.toLowerCase().equals("other"))
            otherRadioButton.setSelected(true);
    }
}