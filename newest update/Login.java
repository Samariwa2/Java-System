/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwanza.tukule.management.system;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author Mariwa
 */
public class Login extends javax.swing.JFrame {
   Connection con = null;
   ResultSet rs = null;
    PreparedStatement pst = null;
    public String userName;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        forgotLink = new javax.swing.JLabel();
        signUpLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kwanza Tukule | Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(737, 470));
        getContentPane().setLayout(null);

        loginLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        loginLabel.setText("LOGIN");
        getContentPane().add(loginLabel);
        loginLabel.setBounds(318, 90, 78, 30);

        usernameLabel.setText("Username:");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(131, 174, 66, 16);

        passwordLabel.setText("Password:");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(134, 252, 63, 16);

        loginButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(306, 321, 131, 38);

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        getContentPane().add(usernameText);
        usernameText.setBounds(203, 169, 379, 26);

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        getContentPane().add(passwordText);
        passwordText.setBounds(203, 247, 379, 26);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(203, 402, 0, 0);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(737, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/kwanza tukule black.png"))); // NOI18N

        versionLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        versionLabel.setText("Version 1.0");

        forgotLink.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
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

        signUpLink.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(forgotLink))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(signUpLink)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(versionLabel)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(signUpLink)
                .addGap(18, 18, 18)
                .addComponent(forgotLink)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(versionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String query = "select * from users where username=? and password=?";
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kwanza Tukule?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","samokoth.1999");
                pst = con.prepareStatement(query);
                userName = usernameText.getText();
                pst.setString(1, userName);
                pst.setString(2, passwordText.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    Icon icon = new javax.swing.ImageIcon(getClass().getResource("kwanza tukule icon.png"));
                JOptionPane.showMessageDialog(this, "Login Successful.","Access Granted",JOptionPane.INFORMATION_MESSAGE,icon);
                Dashboard db = new Dashboard(userName);
                this.setVisible(false);
                db.setVisible(true);
                }
                else{
                    Icon icon = new javax.swing.ImageIcon(getClass().getResource("kwanza tukule icon.png"));
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password.","Access Denied",JOptionPane.INFORMATION_MESSAGE,icon);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        String query = "select * from users where username=? and password=?";
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kwanza Tukule?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","samokoth.1999");
                pst = con.prepareStatement(query);
                userName = usernameText.getText();
                pst.setString(1, userName);
                pst.setString(2, passwordText.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    Icon icon = new javax.swing.ImageIcon(getClass().getResource("kwanza tukule icon.png"));
                JOptionPane.showMessageDialog(this, "Login Successful.","Access Granted",JOptionPane.INFORMATION_MESSAGE,icon);
                Dashboard db = new Dashboard(userName);
                this.setVisible(false);
                db.setVisible(true);
                }
                else{
                    Icon icon = new javax.swing.ImageIcon(getClass().getResource("kwanza tukule icon.png"));
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password.","Access Denied",JOptionPane.INFORMATION_MESSAGE,icon);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        String query = "select * from users where username=? and password=?";
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kwanza Tukule?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","samokoth.1999");
                pst = con.prepareStatement(query);
                userName = usernameText.getText();
                pst.setString(1, userName);
                pst.setString(2, passwordText.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    Icon icon = new javax.swing.ImageIcon(getClass().getResource("kwanza tukule icon.png"));
                JOptionPane.showMessageDialog(this, "Login Successful.","Access Granted",JOptionPane.INFORMATION_MESSAGE,icon);
                Dashboard db = new Dashboard(userName);
                this.setVisible(false);
                db.setVisible(true);
                }
                else{
                    Icon icon = new javax.swing.ImageIcon(getClass().getResource("kwanza tukule icon.png"));
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password.","Access Denied",JOptionPane.INFORMATION_MESSAGE,icon);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_passwordTextActionPerformed

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
    private javax.swing.JLabel forgotLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel signUpLink;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kwanza tukule icon.png")));
    }
}
