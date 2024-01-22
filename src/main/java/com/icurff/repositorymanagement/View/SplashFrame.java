package View;

import Database.DbConnector;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class SplashFrame extends javax.swing.JFrame {

    public SplashFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplashPanel = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        loadingLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        SplashPanel.setBackground(new java.awt.Color(48, 66, 106));
        SplashPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        SplashPanel.setLayout(new java.awt.BorderLayout());

        ProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        ProgressBar.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        ProgressBar.setForeground(new java.awt.Color(81, 206, 103));
        ProgressBar.setPreferredSize(new java.awt.Dimension(900, 18));
        SplashPanel.add(ProgressBar, java.awt.BorderLayout.SOUTH);

        jPanel1.setBackground(new java.awt.Color(48, 66, 106));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(48, 66, 106));

        loadingLabel.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        loadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        loadingLabel.setText("Loading...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(loadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(loadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 370, 60));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RepositoryManagement");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 670, 150));

        SplashPanel.add(jPanel1, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public static void loadDatabase(JFrame frame) {
        if (DbConnector.getConnection() == null) {
            int ans = JOptionPane.showConfirmDialog(null, "Do you want to reload database?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (ans == 0) {
                loadDatabase(frame);
            } else if (ans == 1) {
                JOptionPane.showMessageDialog(null, "Cant use app without database , please try later!");
                frame.setVisible(false);
                frame.dispose();
                System.exit(0);
            }
        }
    }

    public static void main(String args[]) {
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                frame.ProgressBar.setValue(i);

                switch (i) {
                    case 20:

                        frame.loadingLabel.setText("Loading Components");
                        break;
                    case 40:
                        frame.loadingLabel.setText("Loading Utilities");
                        break;
                    case 60:
                        frame.loadingLabel.setText("Loading Media");
                        break;
                    case 80:
                        frame.loadingLabel.setText("Loading Database");
                        loadDatabase(frame);
                        break;
                    case 100:
                        frame.loadingLabel.setText("Loading Success");

                        break;
                }

            }
            new LoginFrame().setVisible(true);
            frame.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please close and try again");

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JPanel SplashPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loadingLabel;
    // End of variables declaration//GEN-END:variables
}
