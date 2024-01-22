package View;

import Controller.LoginController;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
       

        initComponents();
//        getContentPane().requestFocusInWindow();
        setRoundComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogPanel = new javax.swing.JPanel();
        InfoPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        SignIn = new javax.swing.JPanel();
        showPass = new javax.swing.JRadioButton();
        EmailField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        recoverPassword = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));

        LogPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        LogPanel.setRequestFocusEnabled(false);
        LogPanel.setLayout(new java.awt.BorderLayout());

        InfoPanel.setBackground(new java.awt.Color(48, 66, 106));
        InfoPanel.setPreferredSize(new java.awt.Dimension(300, 500));
        InfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(48, 66, 106));

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        InfoPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 290, 170));

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Repository");
        InfoPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 67));

        LogPanel.add(InfoPanel, java.awt.BorderLayout.WEST);

        LoginPanel.setBackground(new java.awt.Color(18, 23, 28));
        LoginPanel.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        LoginPanel.setPreferredSize(new java.awt.Dimension(600, 500));

        SignIn.setBackground(new java.awt.Color(29, 35, 42));
        SignIn.setMinimumSize(new java.awt.Dimension(400, 400));
        SignIn.setPreferredSize(new java.awt.Dimension(400, 400));

        showPass.setBackground(new java.awt.Color(29, 35, 42));
        showPass.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setText("Show Pass");
        showPass.setFocusable(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        EmailField.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        EmailField.setText("icurff");
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(0, 112, 242));
        LoginBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        recoverPassword.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        recoverPassword.setForeground(new java.awt.Color(77, 177, 255));
        recoverPassword.setText("Forgot Password");
        recoverPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                recoverPasswordMousePressed(evt);
            }
        });

        PasswordField.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        PasswordField.setText("Hai281005@");

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email or Username");

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        jPanel1.setBackground(new java.awt.Color(29, 35, 42));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Don't have an account? ");

        registerBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(77, 177, 255));
        registerBtn.setText("Register Here!");
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(registerBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(registerBtn))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Email25.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Password25.png"))); // NOI18N

        javax.swing.GroupLayout SignInLayout = new javax.swing.GroupLayout(SignIn);
        SignIn.setLayout(SignInLayout);
        SignInLayout.setHorizontalGroup(
            SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInLayout.createSequentialGroup()
                .addGroup(SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignInLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(SignInLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addGap(10, 10, 10)
                .addGroup(SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInLayout.createSequentialGroup()
                        .addGroup(SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordField)
                            .addComponent(LoginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SignInLayout.createSequentialGroup()
                                .addGap(0, 297, Short.MAX_VALUE)
                                .addComponent(recoverPassword)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPass)
                        .addGap(40, 40, 40))
                    .addGroup(SignInLayout.createSequentialGroup()
                        .addGroup(SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(SignInLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SignInLayout.setVerticalGroup(
            SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmailField))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPass)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addComponent(recoverPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(SignIn, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        LogPanel.add(LoginPanel, java.awt.BorderLayout.CENTER);

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
        LoginBtn.putClientProperty("JButton.buttonType", "roundRect");
        EmailField.putClientProperty("JComponent.roundRect", true);
        PasswordField.putClientProperty("JComponent.roundRect", true);
        SignIn.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
    }

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed

        String username = EmailField.getText().trim();
        String password = String.valueOf(PasswordField.getPassword());
        new LoginController(username, password, this);

    }//GEN-LAST:event_LoginBtnActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()) {
            PasswordField.setEchoChar((char) 0);
        }else{
            PasswordField.setEchoChar('\u2022');
        }
        
    }//GEN-LAST:event_showPassActionPerformed

    private void recoverPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recoverPasswordMousePressed
        new ForgetPasswordFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_recoverPasswordMousePressed

    private void registerBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMousePressed
        new SignupFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerBtnMousePressed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel LogPanel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel SignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel recoverPassword;
    private javax.swing.JLabel registerBtn;
    private javax.swing.JRadioButton showPass;
    // End of variables declaration//GEN-END:variables
}
