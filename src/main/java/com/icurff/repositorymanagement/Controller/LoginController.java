package Controller;

import java.sql.*;
import Database.DbConnector;
import Model.User;
import View.MainFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController {

    public LoginController(String emailOrUsername, String password, JFrame frame) {

        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT id FROM user WHERE ( email = ? or username = ? ) AND password = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, emailOrUsername);
            st.setString(2, emailOrUsername);
            st.setString(3, password);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                User user = new User(id);
                new MainFrame(user).setVisible(true);
                frame.dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Wrong password or email");
            }

//            DbConnector.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
