/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rachel
 */
public class MenuPage extends javax.swing.JFrame {

    /**
     * Creates new form MenuPage
     */
    public MenuPage() {
        initComponents();
    }
    
    
    int IID;
    String uctype;   
    int ID;
    String username;
    String userType;
    
    public MenuPage(int ID, String username, String userType) {
        initComponents();
        
        this.username = username;
        userNameLabel.setText(username);
        
        this.userType = userType;
        userTypeLabel.setText(userType);
        
        this.ID = ID;  
        IID = ID;
        
        uctype = userTypeLabel.getText();
        
        if(uctype.equals("Doctor"))
        {
            PatientButton.setVisible(false);
            CreateChannelButton.setVisible(false);
            CreateItemButton.setVisible(false);
            CreateUserButton.setVisible(false);
            PatientButton.setVisible(false);
            ReportButton.setVisible(false);
        }
        else if(uctype.equals("Receptionist"))
        {
            
            DoctorButton.setVisible(false);
            ViewPrescrptionButton.setVisible(false);
            ReportButton.setVisible(false);
            
        }
        else if(uctype.equals("Pharmacist"))
        {
            PatientButton.setVisible(false);
            CreateChannelButton.setVisible(false);
            DoctorButton.setVisible(false);
            CreateUserButton.setVisible(false);
            ReportButton.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        PatientButton = new javax.swing.JButton();
        DoctorButton = new javax.swing.JButton();
        CreateChannelButton = new javax.swing.JButton();
        ViewChannelButton = new javax.swing.JButton();
        ViewPrescrptionButton = new javax.swing.JButton();
        CreateItemButton = new javax.swing.JButton();
        CreateUserButton = new javax.swing.JButton();
        ViewDoctorButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        ReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        PatientButton.setText("Patient");
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });

        DoctorButton.setText("Doctor");
        DoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorButtonActionPerformed(evt);
            }
        });

        CreateChannelButton.setText("Create Channel");
        CreateChannelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateChannelButtonActionPerformed(evt);
            }
        });

        ViewChannelButton.setText("View Channel");
        ViewChannelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewChannelButtonActionPerformed(evt);
            }
        });

        ViewPrescrptionButton.setText("View Prescription");
        ViewPrescrptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPrescrptionButtonActionPerformed(evt);
            }
        });

        CreateItemButton.setText("Create Item");
        CreateItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateItemButtonActionPerformed(evt);
            }
        });

        CreateUserButton.setText("Create User");
        CreateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserButtonActionPerformed(evt);
            }
        });

        ViewDoctorButton.setText("View Doctor");
        ViewDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorButtonActionPerformed(evt);
            }
        });

        LogOutButton.setBackground(new java.awt.Color(255, 51, 51));
        LogOutButton.setText("LogOut");
        LogOutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewChannelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateChannelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewPrescrptionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewDoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(PatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateChannelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewChannelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewPrescrptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Namocatcat Hospital");

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("User Type:");

        userNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userNameLabel.setText("jLabel5");

        userTypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userTypeLabel.setText("jLabel6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel)
                    .addComponent(userTypeLabel))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameLabel))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userTypeLabel))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        ReportButton.setText("Sales Report");
        ReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)
                        .addGap(205, 205, 205)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(73, 73, 73)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(ReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorButtonActionPerformed
        // TODO add your handling code here:
        
       if(uctype.equals("Doctor"))
       {
           new Doctor(IID, uctype).setVisible(true);
       }
        
        
    }//GEN-LAST:event_DoctorButtonActionPerformed

    private void CreateChannelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateChannelButtonActionPerformed
        // TODO add your handling code here:
        
        Channel obj = new Channel();
        obj.setVisible(true);
        
    }//GEN-LAST:event_CreateChannelButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        
        Login obj = new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void CreateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserButtonActionPerformed
        // TODO add your handling code here:
        
        UserCreate obj =new UserCreate();
        obj.setVisible(true);

    }//GEN-LAST:event_CreateUserButtonActionPerformed

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonActionPerformed
        // TODO add your handling code here:
        
        PatientForm obj = new PatientForm();
        obj.setVisible(true);
        
    }//GEN-LAST:event_PatientButtonActionPerformed

    private void ViewChannelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewChannelButtonActionPerformed
        // TODO add your handling code here:
        
        new ViewChannel(IID).setVisible(true);
        
    }//GEN-LAST:event_ViewChannelButtonActionPerformed

    private void CreateItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateItemButtonActionPerformed
        // TODO add your handling code here:
        
        Item obj = new Item();
        obj.setVisible(true);
        
    }//GEN-LAST:event_CreateItemButtonActionPerformed

    private void ReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportButtonActionPerformed
        // TODO add your handling code here:
        
        Report obj = new Report();
        obj.setVisible(true);
        
    }//GEN-LAST:event_ReportButtonActionPerformed

    private void ViewDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDoctorButtonActionPerformed
        // TODO add your handling code here:
        
        ViewDoctor obj = new ViewDoctor();
        obj.setVisible(true);
        
    }//GEN-LAST:event_ViewDoctorButtonActionPerformed

    private void ViewPrescrptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPrescrptionButtonActionPerformed
        // TODO add your handling code here:
        
        ViewPrescription obj = new ViewPrescription();
        obj.setVisible(true);
        
    }//GEN-LAST:event_ViewPrescrptionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateChannelButton;
    private javax.swing.JButton CreateItemButton;
    private javax.swing.JButton CreateUserButton;
    private javax.swing.JButton DoctorButton;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton PatientButton;
    private javax.swing.JButton ReportButton;
    private javax.swing.JButton ViewChannelButton;
    private javax.swing.JButton ViewDoctorButton;
    private javax.swing.JButton ViewPrescrptionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
