package View;

import Controller.UserController;
import Model.User;
import Utilities.Validation;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SignupFrame extends javax.swing.JFrame {

    public SignupFrame() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        initComponents();
        setRoundComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogPanel = new javax.swing.JPanel();
        InfoPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RegisterPanel = new javax.swing.JPanel();
        Register = new javax.swing.JPanel();
        showPass = new javax.swing.JRadioButton();
        EmailField = new javax.swing.JTextField();
        RegisterBtn = new javax.swing.JButton();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        backToLoginBtn = new javax.swing.JLabel();
        showPass2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        LogPanel.setPreferredSize(new java.awt.Dimension(1000, 500));
        LogPanel.setLayout(new java.awt.BorderLayout());

        InfoPanel.setBackground(new java.awt.Color(48, 66, 106));
        InfoPanel.setPreferredSize(new java.awt.Dimension(300, 500));
        InfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(48, 66, 106));

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Repository");

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        InfoPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 270, 170));

        LogPanel.add(InfoPanel, java.awt.BorderLayout.WEST);

        RegisterPanel.setBackground(new java.awt.Color(18, 23, 28));
        RegisterPanel.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        RegisterPanel.setPreferredSize(new java.awt.Dimension(650, 550));

        Register.setBackground(new java.awt.Color(29, 35, 42));
        Register.setPreferredSize(new java.awt.Dimension(400, 400));

        showPass.setBackground(new java.awt.Color(29, 35, 42));
        showPass.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setText("Show Pass");
        showPass.setFocusable(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });

        EmailField.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N

        RegisterBtn.setBackground(new java.awt.Color(0, 112, 242));
        RegisterBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("Signup");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        ConfirmPasswordField.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Username");

        jLabel19.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Password");

        jLabel20.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email");

        UsernameField.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Confirm Password");

        PasswordField.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N

        backToLoginBtn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        backToLoginBtn.setForeground(new java.awt.Color(77, 177, 255));
        backToLoginBtn.setText("Already have an account ?");
        backToLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backToLoginBtnMousePressed(evt);
            }
        });
        backToLoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                backToLoginBtnKeyReleased(evt);
            }
        });

        showPass2.setBackground(new java.awt.Color(29, 35, 42));
        showPass2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        showPass2.setForeground(new java.awt.Color(255, 255, 255));
        showPass2.setText("Show Pass");
        showPass2.setFocusable(false);
        showPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPass2ShowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RegisterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backToLoginBtn))
                            .addComponent(UsernameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegisterLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PasswordField)
                            .addComponent(RegisterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(10, 10, 10)
                .addComponent(UsernameField)
                .addGap(10, 10, 10)
                .addComponent(jLabel20)
                .addGap(1, 1, 1)
                .addComponent(EmailField)
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(10, 10, 10)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField)
                    .addComponent(showPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(8, 8, 8)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPasswordField)
                    .addComponent(showPass2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backToLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(RegisterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        LogPanel.add(RegisterPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setRoundComponents() {
        RegisterBtn.putClientProperty("JButton.buttonType", "roundRect");
        UsernameField.putClientProperty("JComponent.roundRect", true);
        EmailField.putClientProperty("JComponent.roundRect", true);
        PasswordField.putClientProperty("JComponent.roundRect", true);
        ConfirmPasswordField.putClientProperty("JComponent.roundRect", true);
        Register.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
    }
    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        if (showPass.isSelected()) {
            PasswordField.setEchoChar((char) 0);

        }else{
            PasswordField.setEchoChar('\u2022');
        }
        
    }//GEN-LAST:event_ShowPassActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        String username = UsernameField.getText().trim().toLowerCase();

        String email = EmailField.getText().trim().toLowerCase();

        String password = new String(PasswordField.getPassword());
        String confirmPassword = new String(ConfirmPasswordField.getPassword());

        Validation inputVerifier = new Validation();

        UsernameField.setInputVerifier(inputVerifier);
        EmailField.setInputVerifier(inputVerifier);
        UsernameField.setName("existUsername");
        EmailField.setName("existEmail");
        PasswordField.setInputVerifier(inputVerifier);
        PasswordField.setName("password");
        if (inputVerifier.verify(UsernameField) && inputVerifier.verify(EmailField)&&inputVerifier.verify(PasswordField)) {

            if (password.equals(confirmPassword)) {
                
                User user = new User(username, email, password, null,null);
                UserController.dbAddUser(user);
                JOptionPane.showMessageDialog(null, "Register Successfully , Please Back To Login");
            } else {

                JOptionPane.showMessageDialog(null, "Confirm password is not correct!");
            }
        }


    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void backToLoginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToLoginBtnMousePressed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToLoginBtnMousePressed

    private void backToLoginBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backToLoginBtnKeyReleased

    }//GEN-LAST:event_backToLoginBtnKeyReleased

    private void showPass2ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPass2ShowPassActionPerformed
        if (showPass2.isSelected()) {
            ConfirmPasswordField.setEchoChar((char) 0);

        }else{
            ConfirmPasswordField.setEchoChar('\u2022');
        }
        
    }//GEN-LAST:event_showPass2ShowPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel LogPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel Register;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel backToLoginBtn;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton showPass;
    private javax.swing.JRadioButton showPass2;
    // End of variables declaration//GEN-END:variables
}
