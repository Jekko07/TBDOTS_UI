/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdots_ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jekko
 */
public class FrameDoctorAdd extends javax.swing.JFrame {

    /**
     * Creates new form FrmDoctorAdd
     */
    public FrameDoctorAdd() {
        initComponents();
        setCenterFrame();
        changeIcon();
        this.setResizable(false);
    }
    
    public void setCenterFrame(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public void changeIcon(){
        ImageIcon icon = new ImageIcon("src/TBDOTS_UI/ddhlogo1.jpg");
        this.setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMiddlename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        btnFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        txtUpdateDoctorID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAddDoc = new javax.swing.JButton();
        btnResetDoc = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 690, 50));

        jPanel5.setBackground(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Add Doctor Info");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Return_50px.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Cancel_52px_2.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 204, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("FIRSTNAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));
        getContentPane().add(txtMiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 204, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("MIDDLENAME:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 204, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("LASTNAME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CONTACT NO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));
        getContentPane().add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 204, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("SPECIALIZATION");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        txtSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializationActionPerformed(evt);
            }
        });
        getContentPane().add(txtSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 204, 30));

        buttonGroup1.add(btnFemale);
        btnFemale.setText("Female");
        getContentPane().add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("SEX");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, 20));

        buttonGroup1.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));
        getContentPane().add(txtUpdateDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 100, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("DOCTOR NO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        btnAddDoc.setBackground(new java.awt.Color(255, 255, 0));
        btnAddDoc.setText("REGISTER");
        btnAddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 130, 50));

        btnResetDoc.setBackground(new java.awt.Color(255, 102, 102));
        btnResetDoc.setText("RESET");
        btnResetDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 90, 50));

        jPanel6.setBackground(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 690, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        FrameDoctor F1 = new FrameDoctor();
        F1.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializationActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnAddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDocActionPerformed
        if(SQLite.openDB()){

            String firstname = this.txtFirstname.getText();
            String middlename = this.txtMiddlename.getText();
            String lastname = this.txtLastname.getText();
            String sex;
            String contactno = this.txtContactNo.getText();
            String specialization = this.txtSpecialization.getText();

            //            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            //            String dateoftreat = dateFormat1.format(jDateOfTreatment.getDate());

            if(btnMale.isSelected()){
                sex = "M";
            }else{
                sex = "F";
            }

            String values = "'" + firstname +"'"+","+"'"+ middlename +"'"+","+"'"+ lastname +"'"+","+"'"+ sex+"'"+","+"'"+contactno+"'"+","+"'"+specialization+"'";

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Save Changes?", "Please Confirm Action", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION) {
                System.out.println("Yes");
            } else if(dialogResult == JOptionPane.NO_OPTION){
                System.out.println("NO");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Error!!");
            }

            if(SQLite.createDoctor("Doctor", values)){
                javax.swing.JOptionPane.showMessageDialog(null, "New Doctor has been registered!");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Doctor Already Registered!");
            }
            SQLite.closeDB();
        }

    }//GEN-LAST:event_btnAddDocActionPerformed

    private void btnResetDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDocActionPerformed
        this.txtUpdateDoctorID.setText("");
        this.txtLastname.setText("");
        this.txtFirstname.setText("");
        this.txtMiddlename.setText("");
        btnMale.setSelected(true);
        this.txtContactNo.setText("");
        this.txtSpecialization.setText("");
    }//GEN-LAST:event_btnResetDocActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameDoctorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDoctorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDoctorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDoctorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDoctorAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDoc;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnResetDoc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblBack;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtMiddlename;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtUpdateDoctorID;
    // End of variables declaration//GEN-END:variables
}
