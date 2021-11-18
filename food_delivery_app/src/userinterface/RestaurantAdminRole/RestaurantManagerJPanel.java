

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class RestaurantManagerJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private Restaurant rest;
    
    public RestaurantManagerJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.container = userProcessContainer;
        this.account = account;
        this.system = system;
        rest = system.getRestaurantDirectory().findRestaurantManagedBy(account.getEmployee());
        restNameText.setText(rest.getName());
        
        //valueLabel.setText();
    }
    
    private void nextScreen() {
       CardLayout cl = (CardLayout) container.getLayout();
       cl.next(container); 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageRestInfoButton = new javax.swing.JButton();
        manageMenuButton = new javax.swing.JButton();
        manageOrdersButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        restNameText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageRestInfoButton.setBackground(new java.awt.Color(0, 0, 51));
        manageRestInfoButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageRestInfoButton.setForeground(new java.awt.Color(255, 255, 204));
        manageRestInfoButton.setText("Manage Restaurant Info");
        manageRestInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRestInfoButtonActionPerformed(evt);
            }
        });
        add(manageRestInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, -1));

        manageMenuButton.setBackground(new java.awt.Color(0, 0, 51));
        manageMenuButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageMenuButton.setForeground(new java.awt.Color(255, 255, 204));
        manageMenuButton.setText("Manage menu");
        manageMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuButtonActionPerformed(evt);
            }
        });
        add(manageMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, -1));

        manageOrdersButton.setBackground(new java.awt.Color(0, 0, 51));
        manageOrdersButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageOrdersButton.setForeground(new java.awt.Color(255, 255, 204));
        manageOrdersButton.setText("Manage Orders");
        manageOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersButtonActionPerformed(evt);
            }
        });
        add(manageOrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));
        add(restNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageRestInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRestInfoButtonActionPerformed
        // TODO add your handling code here:
       ManageRestaurantInfo manageRest = new ManageRestaurantInfo(container, rest);
       container.add("ManageRestaurantInfo", manageRest);
       nextScreen();
    }//GEN-LAST:event_manageRestInfoButtonActionPerformed

    private void manageMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuButtonActionPerformed
       ManageMenu manageMenu = new ManageMenu(container, rest);
       container.add("ManageMenu", manageMenu);
       nextScreen();
    }//GEN-LAST:event_manageMenuButtonActionPerformed

    private void manageOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersButtonActionPerformed
       AcceptRejectOrders screen = new AcceptRejectOrders(container, system, account);
       container.add("AcceptRejectOrders", screen);
       nextScreen();
    }//GEN-LAST:event_manageOrdersButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageMenuButton;
    private javax.swing.JButton manageOrdersButton;
    private javax.swing.JButton manageRestInfoButton;
    private javax.swing.JLabel restNameText;
    // End of variables declaration//GEN-END:variables
    
}
