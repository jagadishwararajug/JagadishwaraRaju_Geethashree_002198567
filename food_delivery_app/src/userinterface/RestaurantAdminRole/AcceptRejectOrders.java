/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class AcceptRejectOrders extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private ArrayList<WorkRequest> reqList;

    /**
     * Creates new form AcceptRejectOrders
     */
    public AcceptRejectOrders(JPanel container, EcoSystem system, UserAccount account) {
        initComponents();
        this.container = container;
        this.system = system;
        this.account = account;
        this.reqList = new ArrayList();
        
        
        for (WorkRequest wq: account.getWorkQueue().getWorkRequestList()) {
            if (wq.getStatus().equals("Order Placed")) {
                reqList.add(wq);
            }
        }
        showNewOrders();
    }

    private void showNewOrders() {
        ordersCBox.removeAllItems();
        int j = 1;
        for(int i=0; i < reqList.size(); i++) {
            WorkRequest wq = reqList.get(i);
            if (wq.getStatus().equals("Order Placed")) {
                ordersCBox.addItem("Order No. " + j + ". From : " + wq.getSender().getUsername());
                j++;
            }
        }
        
        orderDetailsText.setText("");
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
        backButton = new javax.swing.JButton();
        ordersCBox = new javax.swing.JComboBox<>();
        orderDetailsText = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        rejectButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Accept or Reject Orders");

        backButton.setBackground(new java.awt.Color(0, 0, 51));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 204));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ordersCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersCBoxActionPerformed(evt);
            }
        });

        acceptButton.setBackground(new java.awt.Color(0, 0, 51));
        acceptButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acceptButton.setForeground(new java.awt.Color(255, 255, 204));
        acceptButton.setText("Accept");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        rejectButton.setBackground(new java.awt.Color(0, 0, 51));
        rejectButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rejectButton.setForeground(new java.awt.Color(255, 255, 204));
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(orderDetailsText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ordersCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addGap(28, 28, 28)
                .addComponent(ordersCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderDetailsText)
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(rejectButton))
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void ordersCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersCBoxActionPerformed
        int idx = ordersCBox.getSelectedIndex();
        if (idx < 0) 
            return;

        WorkRequest req = this.reqList.get(idx);
        orderDetailsText.setText(req.getMessage());
    }//GEN-LAST:event_ordersCBoxActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        // TODO add your handling code here:
        int idx = ordersCBox.getSelectedIndex();
        if (idx < 0){
            JOptionPane.showMessageDialog(this, "Please select an order to accept.");
            return;
        }
        reqList.get(idx).setStatus("Accepted");
        reqList.remove(idx);
        JOptionPane.showMessageDialog(this, "Order Accepted.");
        showNewOrders();
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        int idx = ordersCBox.getSelectedIndex();
        if (idx < 0){
            JOptionPane.showMessageDialog(this, "Please select an order to reject.");
            return;
        }
        reqList.get(idx).setStatus("Rejected");
        reqList.remove(idx);
        JOptionPane.showMessageDialog(this, "Order rejected.");
        showNewOrders();
    }//GEN-LAST:event_rejectButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel orderDetailsText;
    private javax.swing.JComboBox<String> ordersCBox;
    private javax.swing.JButton rejectButton;
    // End of variables declaration//GEN-END:variables
}
