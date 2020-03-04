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
import javax.swing.JOptionPane;

/**
 *
 * @author Mariwa
 */
public class Registration extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        pNumberLabel = new javax.swing.JLabel();
        eAddressLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        roleText = new javax.swing.JTextField();
        pNumberText = new javax.swing.JTextField();
        eAddressText = new javax.swing.JTextField();
        cPasswordLabel = new javax.swing.JLabel();
        cPasswordText = new javax.swing.JPasswordField();
        roleLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        nationalIdNumberLabel = new javax.swing.JLabel();
        yobLabel = new javax.swing.JLabel();
        staffIdNumberLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        nationalIdNumberText = new javax.swing.JTextField();
        staffIdNumberText = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        yobText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kwanza Tukule | Registration");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(737, 470));
        getContentPane().setLayout(null);

        fNameLabel.setText("First Name:");
        getContentPane().add(fNameLabel);
        fNameLabel.setBounds(42, 108, 72, 16);

        lNameLabel.setText("Last Name:");
        getContentPane().add(lNameLabel);
        lNameLabel.setBounds(350, 108, 70, 16);

        pNumberLabel.setText("Phone Number:");
        getContentPane().add(pNumberLabel);
        pNumberLabel.setBounds(42, 156, 96, 16);

        eAddressLabel.setText("E-mail Address:");
        getContentPane().add(eAddressLabel);
        eAddressLabel.setBounds(350, 156, 101, 16);

        usernameLabel.setText("Username:");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(350, 306, 66, 16);

        passwordLabel.setText("Password:");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(42, 351, 63, 16);

        fNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextActionPerformed(evt);
            }
        });
        getContentPane().add(fNameText);
        fNameText.setBounds(120, 103, 197, 26);

        lNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextActionPerformed(evt);
            }
        });
        getContentPane().add(lNameText);
        lNameText.setBounds(426, 103, 260, 26);

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        getContentPane().add(passwordText);
        passwordText.setBounds(111, 341, 201, 26);

        roleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleTextActionPerformed(evt);
            }
        });
        getContentPane().add(roleText);
        roleText.setBounds(79, 293, 233, 26);
        getContentPane().add(pNumberText);
        pNumberText.setBounds(144, 151, 173, 26);

        eAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eAddressTextActionPerformed(evt);
            }
        });
        getContentPane().add(eAddressText);
        eAddressText.setBounds(457, 151, 229, 26);

        cPasswordLabel.setText("Confirm Password:");
        getContentPane().add(cPasswordLabel);
        cPasswordLabel.setBounds(350, 346, 118, 16);

        cPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPasswordTextActionPerformed(evt);
            }
        });
        getContentPane().add(cPasswordText);
        cPasswordText.setBounds(474, 341, 212, 26);

        roleLabel.setText("Role:");
        getContentPane().add(roleLabel);
        roleLabel.setBounds(42, 298, 31, 16);

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        getContentPane().add(usernameText);
        usernameText.setBounds(422, 301, 264, 26);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel9.setText("REGISTRATION");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(266, 50, 197, 50);

        registerButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton);
        registerButton.setBounds(200, 385, 130, 41);

        clearButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(402, 385, 130, 41);

        nationalIdNumberLabel.setText("National ID Number:");
        getContentPane().add(nationalIdNumberLabel);
        nationalIdNumberLabel.setBounds(42, 200, 129, 16);

        yobLabel.setText("Year of Birth:");
        getContentPane().add(yobLabel);
        yobLabel.setBounds(42, 246, 81, 16);

        staffIdNumberLabel.setText("Staff ID Number:");
        getContentPane().add(staffIdNumberLabel);
        staffIdNumberLabel.setBounds(350, 200, 105, 16);

        genderLabel.setText("Gender:");
        getContentPane().add(genderLabel);
        genderLabel.setBounds(350, 246, 48, 16);
        getContentPane().add(nationalIdNumberText);
        nationalIdNumberText.setBounds(177, 195, 140, 26);
        getContentPane().add(staffIdNumberText);
        staffIdNumberText.setBounds(461, 195, 225, 26);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Male", "Female", "Other" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderComboBox);
        genderComboBox.setBounds(404, 242, 105, 27);

        yobText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yobTextActionPerformed(evt);
            }
        });
        getContentPane().add(yobText);
        yobText.setBounds(140, 241, 177, 26);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/Kwanza Tukule.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(621, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 840, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPasswordTextActionPerformed

    private void fNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        if(passwordText.getText().equals(cPasswordText.getText()))
        {
        try{
            String query = "INSERT INTO `users`(`firstname`, `lastname`, `number`, `email`, `nationalID`, `staffID`, `yob`, `gender`, `role`, `username`, `password`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kwanza Tukule","root","samokoth.1999");
            pst = con.prepareStatement(query);
            pst.setString(1,fNameText.getText());
            pst.setString(2,lNameText.getText());
            pst.setString(3,pNumberText.getText());
            pst.setString(4,eAddressText.getText());
            pst.setString(5,nationalIdNumberText.getText());
            pst.setString(6,staffIdNumberText.getText());
            pst.setString(7,yobText.getText());
            pst.setString(8,genderComboBox.getSelectedItem().toString());
            pst.setString(9,roleText.getText());
            pst.setString(10,usernameText.getText());
            pst.setString(11,passwordText.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registration Complete");
            Login lg = new Login();
            this.setVisible(false);
            lg.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Your Passwords do not match.");
        }
    }//GEN-LAST:event_registerButtonActionPerformed
        
    private void lNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTextActionPerformed

    private void eAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eAddressTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void roleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleTextActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void yobTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yobTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yobTextActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        fNameText.setText("");
        lNameText.setText("");
        pNumberText.setText("");
        eAddressText.setText("");
        nationalIdNumberText.setText("");
        staffIdNumberText.setText("");
        genderComboBox.setSelectedIndex(0);
        yobText.setText("");
        roleText.setText("");
        usernameText.setText("");
        passwordText.setText("");
        cPasswordText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cPasswordLabel;
    private javax.swing.JPasswordField cPasswordText;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel eAddressLabel;
    private javax.swing.JTextField eAddressText;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameText;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameText;
    private javax.swing.JLabel nationalIdNumberLabel;
    private javax.swing.JTextField nationalIdNumberText;
    private javax.swing.JLabel pNumberLabel;
    private javax.swing.JTextField pNumberText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JTextField roleText;
    private javax.swing.JLabel staffIdNumberLabel;
    private javax.swing.JTextField staffIdNumberText;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel yobLabel;
    private javax.swing.JTextField yobText;
    // End of variables declaration//GEN-END:variables
}
