/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwanza.tukule.management.system;

import java.awt.Toolkit;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariwa
 */
public class ResetPassword extends javax.swing.JFrame {
ResultSet rs = null;
PreparedStatement pst = null;
public String user;
public Icon icon = new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/kwanza tukule icon.png"));
    /**
     * Creates new form ResetPassword
     */
    public ResetPassword() {
        initComponents();
        setIcon();
        ImageIcon img = new ImageIcon("/kwanza/tukule/management/system/images/kwanza tukule icon.png");
        this.setIconImage(img.getImage());
    }
    public ResetPassword(String username)
    {
        this.user = username;
        initComponents();
        setIcon();
        ImageIcon img = new ImageIcon("/kwanza/tukule/management/system/images/kwanza tukule icon.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        ResetPasswordTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        RegistrationIcon = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        RegistrationImage = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        newPasswordText = new javax.swing.JPasswordField();
        confirmPasswordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kwanza Tukule | Reset Password");

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResetPasswordTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        ResetPasswordTitle.setText("RESET PASSWORD");
        backgroundPanel.add(ResetPasswordTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        jPanel4.setOpaque(false);

        RegistrationIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/kwanza tukule logo.png"))); // NOI18N

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/avatar2.png"))); // NOI18N

        welcomeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(102, 102, 102));
        welcomeLabel.setText("Welcome");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(welcomeLabel)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(RegistrationIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(avatar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(RegistrationIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 670));

        RegistrationImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/registrationImage4.jpg"))); // NOI18N
        backgroundPanel.add(RegistrationImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 670));

        newPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        newPasswordLabel.setText("New Password:");
        backgroundPanel.add(newPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        confirmPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password:");
        backgroundPanel.add(confirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        resetButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 110, 40));

        newPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordTextActionPerformed(evt);
            }
        });
        backgroundPanel.add(newPasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 166, 560, 30));

        confirmPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTextActionPerformed(evt);
            }
        });
        backgroundPanel.add(confirmPasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 306, 530, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        if(newPasswordText.getText().equals(confirmPasswordText.getText()))
        {
            Connection connect = databaseConnection.connection();
            try{
                String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
                String storePass = passwordUtils.generateSecurePassword(new String(newPasswordText.getPassword()),salt);
                String updateQuery = "UPDATE users SET password=? WHERE email=?";
                pst = connect.prepareStatement(updateQuery);
                pst.setString(1, storePass);
                pst.setString(2, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Your Password Reset is complete.","Complete",JOptionPane.INFORMATION_MESSAGE,icon);
                Login lg = new Login();
                this.setVisible(false);
                lg.setVisible(true);
            }catch( Exception ex){
                JOptionPane.showMessageDialog(null,ex,"Oops!Something went wrong!",JOptionPane.INFORMATION_MESSAGE,icon);
            }
            finally{
            if(connect!=null){
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Your Passwords do not match.","Error",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void newPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordTextActionPerformed
        if(newPasswordText.getText().equals(confirmPasswordText.getText()))
        {
            Connection connect = databaseConnection.connection();
            try{
                String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
                String storePass = passwordUtils.generateSecurePassword(new String(newPasswordText.getPassword()),salt);
                String updateQuery = "UPDATE users SET password=? WHERE email=?";
                pst = connect.prepareStatement(updateQuery);
                pst.setString(1, storePass);
                pst.setString(2, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Your Password Reset is complete.","Complete",JOptionPane.INFORMATION_MESSAGE,icon);
                Login lg = new Login();
                this.setVisible(false);
                lg.setVisible(true);
            }catch( Exception ex){
                JOptionPane.showMessageDialog(null,ex,"Oops!Something went wrong!",JOptionPane.INFORMATION_MESSAGE,icon);
            }
            finally{
            if(connect!=null){
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Your Passwords do not match.","Error",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    }//GEN-LAST:event_newPasswordTextActionPerformed

    private void confirmPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordTextActionPerformed
        if(newPasswordText.getText().equals(confirmPasswordText.getText()))
        {
            Connection connect = databaseConnection.connection();
            try{
                String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
                String storePass = passwordUtils.generateSecurePassword(new String(newPasswordText.getPassword()),salt);
                String updateQuery = "UPDATE users SET password=? WHERE email=?";
                pst = connect.prepareStatement(updateQuery);
                pst.setString(1, storePass);
                pst.setString(2, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Your Password Reset is complete.","Complete",JOptionPane.INFORMATION_MESSAGE,icon);
                Login lg = new Login();
                this.setVisible(false);
                lg.setVisible(true);
            }catch( Exception ex){
                JOptionPane.showMessageDialog(null,ex,"Oops!Something went wrong!",JOptionPane.INFORMATION_MESSAGE,icon);
            }
            finally{
            if(connect!=null){
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Your Passwords do not match.","Error",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    }//GEN-LAST:event_confirmPasswordTextActionPerformed

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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegistrationIcon;
    private javax.swing.JLabel RegistrationImage;
    private javax.swing.JLabel ResetPasswordTitle;
    private javax.swing.JLabel avatar;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordText;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/kwanza/tukule/management/system/images/kwanza tukule icon.png")));
    }
}
