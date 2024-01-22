package DAO;

import Model.User;
import java.util.ArrayList;
import java.sql.*;
import Database.DbConnector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UserDAO implements DAOInterface<User> {

    private int affectedRows = 0;
    private static UserDAO userInstance = null;

    public static UserDAO getInstance() {
        if (userInstance == null) {
            userInstance = new UserDAO();
        }
        return userInstance;
    }

    void checkFC() {

    }

    @Override
    public boolean add(User t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "INSERT INTO user(username,email,password,firstname,lastname) VALUES(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getUsername());
            st.setString(2, t.getEmail());

            st.setString(3, t.getPassword());

            st.setString(4, t.getFirstname());

            st.setString(5, t.getLastname());

            affectedRows = st.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return (affectedRows != 0);
    }

    @Override
    public boolean update(User t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "UPDATE user SET  email = ? ,password = ? ,firstname = ?,"
                    + "lastname = ? WHERE id = ? ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, t.getEmail());

            st.setString(2, t.getPassword());

            st.setString(3, t.getFirstname());

            st.setString(4, t.getLastname());

            st.setInt(5, t.getId());
            affectedRows = st.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return affectedRows != 0;
    }

    private int checkFC(User t) {
        int temp = 0;
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT count(*) AS 'Result' FROM product WHERE postBy = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getId());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                temp = rs.getInt("Result");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

    @Override
    public boolean delete(User t) {
        try {
            if (checkFC(t) > 0) {
                return false;
            } else {
                Connection con = DbConnector.getConnection();
                String sql = "DELETE FROM user WHERE id = ?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setInt(1, t.getId());
//            st.setString(2, t.getUsername());
                affectedRows = st.executeUpdate();

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return affectedRows != 0;
    }

    public boolean selectUsername(String username) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "Select username FROM user WHERE username = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return true;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return false;
    }

    public boolean selectEmail(String email) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "Select email FROM user WHERE email = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, email);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return true;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return false;
    }

    public User selectUser(int id) {
        User user = new User(id);
        try {
            Connection con = DbConnector.getConnection();
            String sql = "Select username,email FROM user WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public ArrayList<User> getArrayList() {
        ArrayList<User> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT * FROM user";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");

                Timestamp registerAt = rs.getTimestamp("registerAt");

                User user = new User(id, username, email, password, firstname, lastname, registerAt);
                arr.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public ArrayList<User> selectByName(String query) {
        ArrayList<User> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();

            String sql = "Select * FROM user WHERE username LIKE ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, query + '%');
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");

                Timestamp registerAt = rs.getTimestamp("registerAt");
                User user = new User(id, username, email, password, firstname, lastname, registerAt);
                arr.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;

    }

    public static User LoadCurrentUser(User user) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT * FROM user WHERE id = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, user.getId());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");

                user.setUsername(username);
                user.setEmail(email);
                user.setPassword(password);
                user.setFirstname(firstname);
                user.setLastname(lastname);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public static void loadAccountInfo(JTextField email, JTextField firstname, JTextField lastname, User user) {
        email.setText(user.getEmail());
        firstname.setText(user.getFirstname());
        lastname.setText(user.getLastname());

    }

    public static void dbUpdateUser(User user) {

        try {
            Connection con = DbConnector.getConnection();
            String sql = "UPDATE user SET  email = ? ,password = ? ,firstname = ?,"
                    + "lastname = ? WHERE id = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, user.getEmail());
            st.setString(2, user.getPassword());
            st.setString(3, user.getFirstname());
            st.setString(4, user.getLastname());

            st.setInt(5, user.getId());
            st.executeUpdate();


        } catch (SQLException e) {

            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Update successfully");
    }

}
