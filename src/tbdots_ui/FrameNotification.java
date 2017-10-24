/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdots_ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jekko
 */
public class FrameNotification extends javax.swing.JFrame {

    /**
     * Creates new form FrameNotification
     */
    public FrameNotification() {
        initComponents();
        setCenterFrame();
        showTable();
//        readNotifications();
        changeIcon();
        this.setResizable(false);
    }
        
    public void showTable(){
        if(SQLite.openDB()){
            String[][] data = SQLite.read("Notification");
            String[] column = {"ID", "FIRSTNAME", "MIDDLENAME", "LASTNAME", "CONTACT NO", "NEXTVISIT"};
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(data, column);
            this.tblNotification.setModel(model);
            
            tblNotification.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblNotification.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblNotification.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblNotification.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblNotification.getColumnModel().getColumn(4).setPreferredWidth(20);
            tblNotification.getColumnModel().getColumn(5).setPreferredWidth(30);
////            tblDoctor.getColumnModel().getColumn(5).setPreferredWidth(40);
            tblNotification.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            SQLite.closeDB();
        }
    }   
    
//    public void readNotifications(){
//        try{
//            SQLite.conn = getConnection(SQLite.url);
//            SQLite.stmt = SQLite.conn.createStatement();
//            String query = "SELECT * FROM Notification ORDER BY nextVisit DESC";
//            ResultSet rs = SQLite.stmt.executeQuery(query);
//            tblNotification.setModel(DbUtils.resultSetToTableModel(rs));
//            
//            SQLite.conn.close();
//        }catch(Exception e){
//            
//        }
//    }

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

        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        pnlDoctors = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlTreatment = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlNotification = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        pnlPatient = new javax.swing.JPanel();
        lblPatients = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        lblPatients2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNotification = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        jLabel15.setText("NOTIFICATION ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jPanel10.setBackground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 790, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Cancel_40px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/ddhlogo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 232, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(151, 151, 151)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 790, -1));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 790, 60));

        sidepanel.setBackground(new java.awt.Color(54, 33, 89));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDoctors.setBackground(new java.awt.Color(54, 33, 89));
        pnlDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDoctorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDoctorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDoctorsMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doctors");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Doctor_Male_40px.png"))); // NOI18N

        javax.swing.GroupLayout pnlDoctorsLayout = new javax.swing.GroupLayout(pnlDoctors);
        pnlDoctors.setLayout(pnlDoctorsLayout);
        pnlDoctorsLayout.setHorizontalGroup(
            pnlDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoctorsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        pnlDoctorsLayout.setVerticalGroup(
            pnlDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoctorsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        sidepanel.add(pnlDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 340, -1));

        pnlTreatment.setBackground(new java.awt.Color(54, 33, 89));
        pnlTreatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTreatmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlTreatmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTreatmentMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Treatment");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Hospital_40px.png"))); // NOI18N

        javax.swing.GroupLayout pnlTreatmentLayout = new javax.swing.GroupLayout(pnlTreatment);
        pnlTreatment.setLayout(pnlTreatmentLayout);
        pnlTreatmentLayout.setHorizontalGroup(
            pnlTreatmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTreatmentLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        pnlTreatmentLayout.setVerticalGroup(
            pnlTreatmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTreatmentLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlTreatmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23))
        );

        sidepanel.add(pnlTreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 340, -1));

        pnlNotification.setBackground(new java.awt.Color(54, 33, 89));
        pnlNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNotificationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNotificationMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Notification");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Add_Reminder_40px.png"))); // NOI18N

        javax.swing.GroupLayout pnlNotificationLayout = new javax.swing.GroupLayout(pnlNotification);
        pnlNotification.setLayout(pnlNotificationLayout);
        pnlNotificationLayout.setHorizontalGroup(
            pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotificationLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        pnlNotificationLayout.setVerticalGroup(
            pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificationLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        sidepanel.add(pnlNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 340, 80));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Navigation");
        sidepanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TBDOTS Patient Monitoring System");
        sidepanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 10));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 280, 10));

        pnlPatient.setBackground(new java.awt.Color(54, 33, 89));
        pnlPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPatientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPatientMouseExited(evt);
            }
        });

        lblPatients.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPatients.setForeground(new java.awt.Color(255, 255, 255));
        lblPatients.setText("Patients");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Add_User_Male_40px.png"))); // NOI18N

        javax.swing.GroupLayout pnlPatientLayout = new javax.swing.GroupLayout(pnlPatient);
        pnlPatient.setLayout(pnlPatientLayout);
        pnlPatientLayout.setHorizontalGroup(
            pnlPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addComponent(lblPatients)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        pnlPatientLayout.setVerticalGroup(
            pnlPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        sidepanel.add(pnlPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        pnlHome.setBackground(new java.awt.Color(54, 33, 89));
        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHomeMouseExited(evt);
            }
        });

        lblPatients2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPatients2.setForeground(new java.awt.Color(255, 255, 255));
        lblPatients2.setText("Home");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Home_50px_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel20)
                .addGap(34, 34, 34)
                .addComponent(lblPatients2)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblPatients2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        sidepanel.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 340, -1));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        tblNotification.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Notif_ID", "Firstname", "Middlename", "LastName", "Contact  No", "Next Visit"
            }
        ));
        jScrollPane1.setViewportView(tblNotification);
        if (tblNotification.getColumnModel().getColumnCount() > 0) {
            tblNotification.getColumnModel().getColumn(0).setResizable(false);
            tblNotification.getColumnModel().getColumn(1).setResizable(false);
            tblNotification.getColumnModel().getColumn(2).setResizable(false);
            tblNotification.getColumnModel().getColumn(3).setResizable(false);
            tblNotification.getColumnModel().getColumn(4).setResizable(false);
            tblNotification.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 730, 270));

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrint.setText("Print ");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pnlDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoctorsMouseClicked
        FrameDoctor F2 = new FrameDoctor();
        F2.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlDoctorsMouseClicked

    private void pnlDoctorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoctorsMouseEntered
        System.out.println("change color");
        pnlDoctors.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_pnlDoctorsMouseEntered

    private void pnlTreatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTreatmentMouseClicked
        FrameTreatment F1 = new FrameTreatment();
        F1.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlTreatmentMouseClicked

    private void pnlTreatmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTreatmentMouseEntered
        System.out.println("change color");
        pnlTreatment.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_pnlTreatmentMouseEntered

    private void pnlNotificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNotificationMouseClicked
        
    }//GEN-LAST:event_pnlNotificationMouseClicked

    private void pnlNotificationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNotificationMouseEntered
       
    }//GEN-LAST:event_pnlNotificationMouseEntered

    private void pnlPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPatientMouseClicked
        FramePatient F3 = new FramePatient();
        F3.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlPatientMouseClicked

    private void pnlPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPatientMouseEntered
        System.out.println("change color");
        pnlPatient.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_pnlPatientMouseEntered

    private void pnlPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPatientMouseExited
        System.out.println("change color");
        pnlHome.setBackground(Color.decode("#362159"));
        pnlPatient.setBackground(Color.decode("#362159"));
        pnlDoctors.setBackground(Color.decode("#362159"));
        pnlTreatment.setBackground(Color.decode("#362159"));
        pnlNotification.setBackground(Color.decode("#362159"));
    }//GEN-LAST:event_pnlPatientMouseExited

    private void pnlHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseClicked
        FrameHome F4 = new FrameHome();
        F4.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlHomeMouseClicked

    private void pnlHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseExited
        System.out.println("change color");
        pnlHome.setBackground(Color.decode("#362159"));
        pnlPatient.setBackground(Color.decode("#362159"));
        pnlDoctors.setBackground(Color.decode("#362159"));
        pnlTreatment.setBackground(Color.decode("#362159"));
        pnlNotification.setBackground(Color.decode("#362159"));
    }//GEN-LAST:event_pnlHomeMouseExited

    private void pnlHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseEntered
        System.out.println("change color");
        pnlHome.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_pnlHomeMouseEntered

    private void pnlDoctorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoctorsMouseExited
        System.out.println("change color");
        pnlHome.setBackground(Color.decode("#362159"));
        pnlPatient.setBackground(Color.decode("#362159"));
        pnlDoctors.setBackground(Color.decode("#362159"));
        pnlTreatment.setBackground(Color.decode("#362159"));
        pnlNotification.setBackground(Color.decode("#362159"));
    }//GEN-LAST:event_pnlDoctorsMouseExited

    private void pnlTreatmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTreatmentMouseExited
        System.out.println("change color");
        pnlHome.setBackground(Color.decode("#362159"));
        pnlPatient.setBackground(Color.decode("#362159"));
        pnlDoctors.setBackground(Color.decode("#362159"));
        pnlTreatment.setBackground(Color.decode("#362159"));
        pnlNotification.setBackground(Color.decode("#362159"));
    }//GEN-LAST:event_pnlTreatmentMouseExited

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try{
            if(SQLite.openDB()){
                String reportName = ("src\\tbdots_ui\\TreatmentReport.jrxml");
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
            java.util.logging.Logger.getLogger(FrameNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNotification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPatients;
    private javax.swing.JLabel lblPatients2;
    private javax.swing.JPanel pnlDoctors;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlNotification;
    private javax.swing.JPanel pnlPatient;
    private javax.swing.JPanel pnlTreatment;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tblNotification;
    // End of variables declaration//GEN-END:variables
}
