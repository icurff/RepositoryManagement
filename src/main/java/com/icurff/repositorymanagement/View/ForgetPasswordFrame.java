package View;

import Utilities.TransactionalEmail;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;

import javax.swing.UIManager;

public class ForgetPasswordFrame extends javax.swing.JFrame {

    public ForgetPasswordFrame() {
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
        SendPassPanel = new javax.swing.JPanel();
        SendPass = new javax.swing.JPanel();
        EmailField = new javax.swing.JTextField();
        SendBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));

        LogPanel.setMinimumSize(new java.awt.Dimension(900, 500));
        LogPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        LogPanel.setLayout(new java.awt.BorderLayout());

        InfoPanel.setBackground(new java.awt.Color(48, 66, 106));
        InfoPanel.setMinimumSize(new java.awt.Dimension(300, 500));
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

        SendPassPanel.setBackground(new java.awt.Color(18, 23, 28));
        SendPassPanel.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        SendPassPanel.setPreferredSize(new java.awt.Dimension(600, 500));

        SendPass.setBackground(new java.awt.Color(29, 35, 42));
        SendPass.setMinimumSize(new java.awt.Dimension(400, 400));
        SendPass.setPreferredSize(new java.awt.Dimension(400, 400));

        EmailField.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N

        SendBtn.setBackground(new java.awt.Color(0, 112, 242));
        SendBtn.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        SendBtn.setForeground(new java.awt.Color(255, 255, 255));
        SendBtn.setText("Send password to email");
        SendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        jPanel1.setBackground(new java.awt.Color(29, 35, 42));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(77, 177, 255));
        jLabel9.setText("Back to login!");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout SendPassLayout = new javax.swing.GroupLayout(SendPass);
        SendPass.setLayout(SendPassLayout);
        SendPassLayout.setHorizontalGroup(
            SendPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendPassLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(SendPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SendPassLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SendPassLayout.createSequentialGroup()
                        .addGroup(SendPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SendBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SendPassLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(SendPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(158, 158, 158))))
        );
        SendPassLayout.setVerticalGroup(
            SendPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendPassLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailField)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addComponent(SendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout SendPassPanelLayout = new javax.swing.GroupLayout(SendPassPanel);
        SendPassPanel.setLayout(SendPassPanelLayout);
        SendPassPanelLayout.setHorizontalGroup(
            SendPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SendPassPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(SendPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
        SendPassPanelLayout.setVerticalGroup(
            SendPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SendPassPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(SendPass, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        LogPanel.add(SendPassPanel, java.awt.BorderLayout.CENTER);

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
        SendPass.putClientProperty(FlatClientProperties.STYLE, "arc: 16");
        EmailField.putClientProperty("JComponent.roundRect", true);
        SendBtn.putClientProperty("JButton.buttonType", "roundRect");
    }

    private void SendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBtnActionPerformed
        String TO = EmailField.getText().trim();
       
            TransactionalEmail.sendEmail(TO);
        


    }//GEN-LAST:event_SendBtnActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel LogPanel;
    private javax.swing.JButton SendBtn;
    private javax.swing.JPanel SendPass;
    private javax.swing.JPanel SendPassPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
