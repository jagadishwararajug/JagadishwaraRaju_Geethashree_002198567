/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.Profile;

/**
 *
 * @author geeth
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Profile profile;
    public ViewJPanel(Profile profile) {
        initComponents();
        this.profile = profile;
        
        displayProfile();
        
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
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeoData = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblTelNum = new javax.swing.JLabel();
        lblFaxNum = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        lblMedRecNum = new javax.swing.JLabel();
        lblHlthPlnBenNum = new javax.swing.JLabel();
        lblBnkAccNum = new javax.swing.JLabel();
        lblCrtLicNum = new javax.swing.JLabel();
        lblVclIdSlNumIncLicPl = new javax.swing.JLabel();
        lblDevIdSlNum = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblIpAdd = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblUniqueId = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtGeoData = new javax.swing.JLabel();
        txtDob = new javax.swing.JLabel();
        txtTelNum = new javax.swing.JLabel();
        txtFaxNum = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JLabel();
        txtSsn = new javax.swing.JLabel();
        txtMedRecNum = new javax.swing.JLabel();
        txtHlthPlnBenNum = new javax.swing.JLabel();
        txtBnkAccNum = new javax.swing.JLabel();
        txtCrtLicNum = new javax.swing.JLabel();
        txtVclIdSlNumIncLicPl = new javax.swing.JLabel();
        txtDevIdSlNum = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JLabel();
        txtIpAdd = new javax.swing.JLabel();
        txtUniqueId = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Profile");

        lblName.setText("Name:");

        lblGeoData.setText("Geographical Data:");

        lblDob.setText("Date Of Birth:");

        lblTelNum.setText("Telephone Number:");

        lblFaxNum.setText("FAX Number:");

        lblEmailId.setText("Email Address:");

        lblSsn.setText("SSN:");

        lblMedRecNum.setText("Medical Record Number:");

        lblHlthPlnBenNum.setText("Health Plan Beneficiary Number:");

        lblBnkAccNum.setText("Bank Account Number:");

        lblCrtLicNum.setText("Certificate/License Number:");

        lblVclIdSlNumIncLicPl.setText("Vehicle Identifiers & Serial Number: ");

        lblDevIdSlNum.setText("Device Identifiers & Serial Number:");

        lblLinkedin.setText("Linkedin:");

        lblIpAdd.setText("Internet Protocol Address:");

        lblPhoto.setText("Photo/Image:");

        lblUniqueId.setText("Unique ID:");

        txtName.setText("jLabel2");

        txtGeoData.setText("jLabel2");

        txtDob.setText("jLabel2");

        txtTelNum.setText("jLabel2");

        txtFaxNum.setText("jLabel2");

        txtEmailId.setText("jLabel2");

        txtSsn.setText("jLabel2");

        txtMedRecNum.setText("jLabel2");

        txtHlthPlnBenNum.setText("jLabel2");

        txtBnkAccNum.setText("jLabel2");

        txtCrtLicNum.setText("jLabel2");

        txtVclIdSlNumIncLicPl.setText("jLabel2");

        txtDevIdSlNum.setText("jLabel2");

        txtLinkedin.setText("jLabel2");

        txtIpAdd.setText("jLabel2");

        txtUniqueId.setText("jLabel2");
        txtUniqueId.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVclIdSlNumIncLicPl)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelNum)
                            .addComponent(lblPhoto)
                            .addComponent(lblUniqueId)
                            .addComponent(lblFaxNum)
                            .addComponent(lblEmailId)
                            .addComponent(lblSsn)
                            .addComponent(lblMedRecNum)
                            .addComponent(lblHlthPlnBenNum)
                            .addComponent(lblBnkAccNum)
                            .addComponent(lblCrtLicNum)
                            .addComponent(lblDevIdSlNum)
                            .addComponent(lblLinkedin)
                            .addComponent(lblIpAdd)
                            .addComponent(lblDob)
                            .addComponent(lblGeoData)
                            .addComponent(lblName))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUniqueId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtGeoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFaxNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMedRecNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHlthPlnBenNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBnkAccNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCrtLicNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVclIdSlNumIncLicPl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDevIdSlNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtLinkedin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtIpAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(imageLabel)))))
                .addGap(103, 305, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeoData)
                    .addComponent(lblGeoData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDob)
                    .addComponent(lblDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelNum)
                    .addComponent(lblTelNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFaxNum)
                    .addComponent(txtFaxNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailId)
                    .addComponent(lblEmailId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSsn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedRecNum)
                    .addComponent(txtMedRecNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHlthPlnBenNum)
                    .addComponent(lblHlthPlnBenNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBnkAccNum)
                    .addComponent(lblBnkAccNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCrtLicNum)
                    .addComponent(lblCrtLicNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVclIdSlNumIncLicPl)
                    .addComponent(txtVclIdSlNumIncLicPl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDevIdSlNum)
                    .addComponent(txtDevIdSlNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLinkedin)
                    .addComponent(lblLinkedin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIpAdd)
                    .addComponent(lblIpAdd))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueId)
                    .addComponent(txtUniqueId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(imageLabel))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle)
                    .addContainerGap(379, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBnkAccNum;
    private javax.swing.JLabel lblCrtLicNum;
    private javax.swing.JLabel lblDevIdSlNum;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblFaxNum;
    private javax.swing.JLabel lblGeoData;
    private javax.swing.JLabel lblHlthPlnBenNum;
    private javax.swing.JLabel lblIpAdd;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMedRecNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblTelNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUniqueId;
    private javax.swing.JLabel lblVclIdSlNumIncLicPl;
    private javax.swing.JLabel txtBnkAccNum;
    private javax.swing.JLabel txtCrtLicNum;
    private javax.swing.JLabel txtDevIdSlNum;
    private javax.swing.JLabel txtDob;
    private javax.swing.JLabel txtEmailId;
    private javax.swing.JLabel txtFaxNum;
    private javax.swing.JLabel txtGeoData;
    private javax.swing.JLabel txtHlthPlnBenNum;
    private javax.swing.JLabel txtIpAdd;
    private javax.swing.JLabel txtLinkedin;
    private javax.swing.JLabel txtMedRecNum;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtSsn;
    private javax.swing.JLabel txtTelNum;
    private javax.swing.JLabel txtUniqueId;
    private javax.swing.JLabel txtVclIdSlNumIncLicPl;
    // End of variables declaration//GEN-END:variables

    private void displayProfile() {
        txtName.setText(profile.getName());
        txtGeoData.setText(profile.getGeoData());
        txtDob.setText(profile.getDob());
        
        txtTelNum.setText(profile.getTelNum());
       
        txtFaxNum.setText(profile.getFaxNum());
        txtEmailId.setText(profile.getEmailId());
        txtSsn.setText(profile.getSsn());
        txtMedRecNum.setText(profile.getMedRecNum());
        txtHlthPlnBenNum.setText(profile.getHlthPlnBenNum());
        txtBnkAccNum.setText(profile.getBnkAccNum());
        
        txtCrtLicNum.setText(profile.getCrtLicNum());
        txtVclIdSlNumIncLicPl.setText(profile.getVclIdSlNumIncLicPl());
        txtDevIdSlNum.setText(profile.getDevIdSlNum());
        txtLinkedin.setText(profile.getLinkedin());
        txtIpAdd.setText(profile.getIpAdd());
        txtUniqueId.setText(profile.getUniqueId());
        
        imageLabel.setIcon(new ImageIcon(new ImageIcon(
                profile.getImage().toString()).getImage(
                ).getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
    }
}