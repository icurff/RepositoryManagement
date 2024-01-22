package Utilities;

import Database.DbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class TransactionalEmail {

    public class MailConfig {

        public static final String from = "nguyeniah2810@gmail.com";
        public static final String password = "hkklpaumdzjxwldr";
        public static final String HOST_NAME = "smtp.gmail.com";
        public static final int TSL_PORT = 587;

    }

    public static void sendEmail(String TO) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT password from user WHERE email = ?  ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, TO);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                String password = rs.getString("password");
                String CONTENT = "Your Password is : <b>" + password + "</b> ";
                sendPassword(TO, "Your RepositoryApp Password", CONTENT);
                JOptionPane.showMessageDialog(null, "Sent Successfully,Please check your inbox or spam folder to get password!");
            } else {
                JOptionPane.showMessageDialog(null, "This email isn't belong to any account!");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    private static void sendPassword(String TO, String SUBJECT, String CONTENT) {
        // Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", MailConfig.HOST_NAME);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", MailConfig.TSL_PORT);
        // get Session
        Authenticator auth = new Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MailConfig.from, MailConfig.password);
            }
        };
        Session session = Session.getInstance(props, auth);
        // compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(TO));
            message.setSubject(SUBJECT);
            message.setContent(CONTENT, "text/html");
            // send message
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
