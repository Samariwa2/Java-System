/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwanza.tukule.management.system;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class Login extends javax.swing.JFrame {
   ResultSet rs = null;
    PreparedStatement pst = null;
    public String userName;
    public String password;
    Icon icon = new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/kwanza tukule icon.png"));
    /**
     * Creates new form Login
     */
    public Login() {
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
        LoginTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        RegistrationIcon = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        RegistrationImage = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        forgotLink = new javax.swing.JLabel();
        signUpLink = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kwanza Tukule | Login");

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        LoginTitle.setText("LOGIN");
        backgroundPanel.add(LoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

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

        usernameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        usernameLabel.setText("Username:");
        backgroundPanel.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 100, -1));

        passwordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        passwordLabel.setText("Password:");
        backgroundPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 150, -1));

        loginButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 120, 40));

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        backgroundPanel.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 146, 470, 30));

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        backgroundPanel.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 480, 30));

        forgotLink.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        forgotLink.setForeground(new java.awt.Color(51, 153, 255));
        forgotLink.setText("Forgot Password?");
        forgotLink.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                forgotLinkMouseMoved(evt);
            }
        });
        forgotLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgotLinkMousePressed(evt);
            }
        });
        backgroundPanel.add(forgotLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, -1, -1));

        signUpLink.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        signUpLink.setForeground(new java.awt.Color(51, 153, 255));
        signUpLink.setText("Sign Up");
        signUpLink.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                signUpLinkMouseMoved(evt);
            }
        });
        signUpLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpLinkMousePressed(evt);
            }
        });
        backgroundPanel.add(signUpLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 70, 30));

        versionLabel.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        versionLabel.setText("Version 1.5");
        backgroundPanel.add(versionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        String query = "select * from users where username=? and password=?";
        Connection connect = databaseConnection.connection();
        try {
            pst = connect.prepareStatement(query);
            userName = usernameText.getText();
            String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
            password = passwordUtils.generateSecurePassword(new String(passwordText.getPassword()),salt);
            pst.setString(1, userName);
            pst.setString(2, password);
            rs=pst.executeQuery();
            if(rs.next()){
                Dashboard db = new Dashboard(userName);
                this.setVisible(false);
                db.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password.","Access Denied",JOptionPane.INFORMATION_MESSAGE,icon);
                passwordText.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        String query = "select * from users where username=? and password=?";
        Connection connect = databaseConnection.connection();
        try {
            pst = connect.prepareStatement(query);
            userName = usernameText.getText();
            String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
            password = passwordUtils.generateSecurePassword(new String(passwordText.getPassword()),salt);
            pst.setString(1, userName);
            pst.setString(2, password);
            rs=pst.executeQuery();
            if(rs.next()){
                Dashboard db = new Dashboard(userName);
                this.setVisible(false);
                db.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password.","Access Denied",JOptionPane.INFORMATION_MESSAGE,icon);
                passwordText.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_passwordTextActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String query = "select * from users where username=? and password=?";
        Connection connect = databaseConnection.connection();
        try {
            pst = connect.prepareStatement(query);
            userName = usernameText.getText();
            String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
            password = passwordUtils.generateSecurePassword(new String(passwordText.getPassword()),salt);
            pst.setString(1, userName);
            pst.setString(2, password);
            rs=pst.executeQuery();
            if(rs.next()){
                Dashboard db = new Dashboard(userName);  
                this.setVisible(false);
                db.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password.","Access Denied",JOptionPane.INFORMATION_MESSAGE,icon);
                passwordText.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_loginButtonActionPerformed

    private void forgotLinkMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLinkMouseMoved

    }//GEN-LAST:event_forgotLinkMouseMoved

    private void forgotLinkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLinkMousePressed
        ForgotPassword fp = new ForgotPassword();
        this.setVisible(false);
        fp.setVisible(true);
    }//GEN-LAST:event_forgotLinkMousePressed

    private void signUpLinkMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLinkMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpLinkMouseMoved

    private void signUpLinkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLinkMousePressed
        Registration rg = new Registration();
        this.setVisible(false);
        rg.setVisible(true);
    }//GEN-LAST:event_signUpLinkMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JLabel RegistrationIcon;
    private javax.swing.JLabel RegistrationImage;
    private javax.swing.JLabel avatar;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel forgotLink;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel signUpLink;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/kwanza/tukule/management/system/images/kwanza tukule icon.png")));
    }
}
