/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.RestaurantManagerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageRestaurant extends javax.swing.JPanel {

    private final EcoSystem system;
    private final JPanel container;

    
    public ManageRestaurant(JPanel container, EcoSystem system) {
        initComponents();
        this.system = system;
        this.container = container;
        
        restTable.setShowHorizontalLines(true);
        restTable.setShowVerticalLines(true);
        populateTableWithRestaurants();
        
        
    }
    
    public void populateTableWithRestaurants() {
        DefaultTableModel model = (DefaultTableModel) restTable.getModel();
        model.setRowCount(0);
        for (Restaurant r: system.getRestaurantDirectory().getRestaurantList()) {
            Object[] row = new Object[6];
            row[0] = r;
            row[1] = r.getAddress();
            row[2] = r.getPhoneNumber();
            row[3] = r.getManager().getName();
            row[4] = r.getManager().getUserAccount().getUsername();
            row[5] = r.getManager().getPhoneNumber();
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
        restTable = new javax.swing.JTable();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        managerNameText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        managerPhoneText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        managerAddressText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        restTable.setBackground(new java.awt.Color(255, 255, 204));
        restTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Phone", "Manager Name", "Manager Username", "Manager Phone"
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
        jScrollPane1.setViewportView(restTable);

        jLabel1.setText("Name : ");

        jLabel3.setText("Phone Number :");

        jLabel4.setText("Address : ");

        jLabel5.setText("Username : ");

        jLabel6.setText("Password: ");

        addButton.setBackground(new java.awt.Color(0, 0, 51));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 204));
        addButton.setText("Add Restaurant");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 0, 51));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 204));
        updateButton.setText("Update Selected Restaurant");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 0, 51));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 204));
        deleteButton.setText("Delete Selected Restaurant");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel8.setText("Manager Details");

        jLabel2.setText("Name: ");

        managerNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerNameTextActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Number: ");

        jLabel9.setText("Address:");

        backButton.setBackground(new java.awt.Color(0, 0, 51));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 204));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel10.setText("Manage Restaurant");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(phoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(addressText)
                                        .addComponent(usernameText)
                                        .addComponent(passwordText)
                                        .addComponent(managerNameText)
                                        .addComponent(managerPhoneText)
                                        .addComponent(managerAddressText))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)))
                        .addContainerGap(210, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
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
                .addComponent(jLabel8)
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
                    .addComponent(managerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(managerPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(managerAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private Restaurant parseRestaurant() {
        Restaurant res = new Restaurant();
        Employee manager = new Employee();
        UserAccount ua = new UserAccount();
        
        
        if (res.setName(nameText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Name is not in a valid format");
            return null;
        }
        
        if (res.setPhoneNumber(phoneText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Phone is not in a valid format");
            return null;
        }
        
        if (res.setAddress(addressText.getText()) == false) {
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
        
        if (manager.setName(managerNameText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Manager name is not in a valid format");
            return null;
        }
        
        if (manager.setPhoneNumber(managerPhoneText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Manager phone is not in a valid format");
            return null;
        }
        
        if (manager.setAddress(managerAddressText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Manager address is not in a valid format");
            return null;
        }
        ua.setRole(new RestaurantManagerRole());
        ua.setEmployee(manager);
        manager.setUserAccount(ua);
        res.setManager(manager);
        
        return res;
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = restTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be updated.");
            return;
        }
        
        Restaurant rest = parseRestaurant();
        if (rest == null)
            return;

        Restaurant oldRest = system.getRestaurantDirectory().getRestaurantList().get(selectedRow);
        // update user account
        ArrayList<UserAccount> uaList = system.getUserAccountDirectory().getUserAccountList();
        int uaIdx = uaList.indexOf(oldRest.getManager().getUserAccount());
        if (system.getUserAccountDirectory().updateUserAccount(uaIdx, rest.getManager().getUserAccount()) == false) {
            JOptionPane.showMessageDialog(this, "Username already exists.");
            return;
        }
        // update manager
        int mIdx = system.getEmployeeDirectory().getEmployeeList().indexOf(oldRest.getManager());
        system.getEmployeeDirectory().updateEmployee(mIdx, rest.getManager());
        
        // update restaurant
        system.getRestaurantDirectory().updateRestaurant(selectedRow, rest);
        
        JOptionPane.showMessageDialog(this, "Restaurant updated successfully.");
        populateTableWithRestaurants();
        clearFields();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Restaurant rest = parseRestaurant();
        if (rest == null)
            return;
        
        if (system.getUserAccountDirectory().addUserAccount(rest.getManager().getUserAccount()) == false) {
            JOptionPane.showMessageDialog(this, "Username already exists.");
            return;
        }
        system.getEmployeeDirectory().addEmployee(rest.getManager());
        system.getRestaurantDirectory().addRestaurant(rest);
        
        JOptionPane.showMessageDialog(this, "Restaurant added successfully.");
        populateTableWithRestaurants();
        clearFields();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = restTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted.");
            return;
        }
        Restaurant rest = system.getRestaurantDirectory().getRestaurantList().get(selectedRow);
        
        //remove user account
        system.getUserAccountDirectory().removeUserAccount(rest.getManager().getUserAccount());
        // remove manager 
        system.getEmployeeDirectory().removeEmployee(rest.getManager());
        // remove restaurant
        system.getRestaurantDirectory().removeRestaurant(rest);
        JOptionPane.showMessageDialog(this, "Restaurant deleted successfully.");
        populateTableWithRestaurants();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void managerNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerNameTextActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField managerAddressText;
    private javax.swing.JTextField managerNameText;
    private javax.swing.JTextField managerPhoneText;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTable restTable;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        nameText.setText("");
        phoneText.setText("");
        addressText.setText("");
        usernameText.setText("");
        passwordText.setText("");
        managerNameText.setText("");
        managerPhoneText.setText("");
        managerAddressText.setText("");
    }
}
