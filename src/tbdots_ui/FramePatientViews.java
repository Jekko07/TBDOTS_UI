/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdots_ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.InputStream;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jekko
 */
public class FramePatientViews extends javax.swing.JFrame {
    java.sql.Connection conn  = null;
    java.sql.Statement stmt = null;
//    static String url = "jdbc:sqlite:C:\\Users\\Jekko\\Documents\\NetBeansProjects\\TBDOTS_UI\\src\\tbdots_ui\\db.sqlite";
//    
    static File temp = new File("db.sqlite");
    static String url = "jdbc:sqlite:"+temp.getAbsolutePath().replace("\\", "\\\\");
    /**
     * Creates new form FramePatientViews
     */
    public FramePatientViews() {
        initComponents();
        setCenterFrame();
        showTable();
        changeIcon();
        this.setResizable(false);
    }
    
    public void showTable(){
        if(SQLite.openDB()){
            String[][] data = SQLite.read("Patient");
            String[] column = {"ID", "FIRSTNAME", "MIDDLENAME", "LASTNAME", "BIRTHDATE", "AGE", "SEX", "OCCUPATION", "CIVIL STATUS", "CONTACTPERSON", "CONTACTNO", "ADDRESS"};
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(data, column);
            this.tblPatient.setModel(model);
            
            tblPatient.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblPatient.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblPatient.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblPatient.getColumnModel().getColumn(5).setPreferredWidth(1);
            tblPatient.getColumnModel().getColumn(6).setPreferredWidth(8);
            tblPatient.getColumnModel().getColumn(10).setPreferredWidth(40);
            tblPatient.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            SQLite.closeDB();
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("View List of Patient");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel4.setBackground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 1360, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/ddhlogo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 370, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Return_50px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Cancel_52px_2.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 60, -1, -1));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "Firstname", "Middlename", "Lastname", "Birthdate", "Age", "Sex", "Occupation", "Civil Status", "Contact Person", "Contact No", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);
        if (tblPatient.getColumnModel().getColumnCount() > 0) {
            tblPatient.getColumnModel().getColumn(0).setResizable(false);
            tblPatient.getColumnModel().getColumn(1).setResizable(false);
            tblPatient.getColumnModel().getColumn(2).setResizable(false);
            tblPatient.getColumnModel().getColumn(3).setResizable(false);
            tblPatient.getColumnModel().getColumn(4).setResizable(false);
            tblPatient.getColumnModel().getColumn(5).setResizable(false);
            tblPatient.getColumnModel().getColumn(6).setResizable(false);
            tblPatient.getColumnModel().getColumn(7).setResizable(false);
            tblPatient.getColumnModel().getColumn(8).setResizable(false);
            tblPatient.getColumnModel().getColumn(9).setResizable(false);
            tblPatient.getColumnModel().getColumn(10).setResizable(false);
            tblPatient.getColumnModel().getColumn(11).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1320, 300));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Search Patient");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, 30));

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1360, 50));

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrint.setText("Print All Patients");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 190, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
       try{
            conn = getConnection(url);
            stmt = conn.createStatement();

            
            String searched = txtSearch.getText();
            if(txtSearch.equals("")){
                this.showTable();
            }else{       
                
                String query = "SELECT * FROM Patient  WHERE PatientID LIKE'%"
                        + searched + "%'" + " OR firstname LIKE'" + searched + "%'"
                        + " OR lastname LIKE'%" + searched + "%'"
                        + " OR middlename LIKE'%" + searched + "%'"
                        + " or Birthdate like '%" + searched + "%'" 
                        + " OR Age LIKE'" + searched + "%'"
                        + " OR Sex LIKE'" + searched + "%'"
                        + " OR Occupation LIKE'" + searched + "%'"
                        + " OR civilStatus LIKE'" + searched + "%'"
                        + " OR contactPerson LIKE'" + searched + "%'"
                        + " OR contactNo LIKE'" + searched + "%'"
                        + " OR address LIKE'" + searched + "%'";
                
                ResultSet rs = stmt.executeQuery(query);
                this.tblPatient.setModel(DbUtils.resultSetToTableModel(rs)); 
            }
        
        }catch(Exception e){
           
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        FramePatient F1 = new FramePatient();
        F1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try{
            if(SQLite.openDB()){
                String reportName = ("src\\tbdots_ui\\PatientReport.jrxml");
                Helper.Report.viewReport(reportName);
                SQLite.closeDB();
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(FramePatientViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePatientViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePatientViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePatientViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePatientViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}