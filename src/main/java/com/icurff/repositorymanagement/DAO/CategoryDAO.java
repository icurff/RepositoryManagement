package DAO;

import Model.Category;
import java.util.ArrayList;
import java.sql.*;
import Database.DbConnector;
import javax.swing.JOptionPane;

public class CategoryDAO implements DAOInterface<Category> {

    private int affectedRows = 0;
    private static CategoryDAO categoryInstance = null;

    public static CategoryDAO getInstance() {
        if (categoryInstance == null) {
            categoryInstance = new CategoryDAO();
        }
        return categoryInstance;
    }

    @Override
    public boolean add(Category t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "INSERT INTO category(name )VALUES(?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getName());
            affectedRows = st.executeUpdate();
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return (affectedRows != 0);
    }

    @Override
    public boolean update(Category t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "UPDATE category SET name =? WHERE id = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getName());
            st.setString(2, Integer.toString(t.getId()));
            affectedRows = st.executeUpdate();
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return affectedRows != 0;
    }

    @Override
    public boolean delete(Category t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "DELETE FROM category WHERE id = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Integer.toString(t.getId()));
            affectedRows = st.executeUpdate();
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {
e.printStackTrace();
        }
        return affectedRows != 0;
    }

    @Override
    public ArrayList<Category> getArrayList() {
        ArrayList<Category> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT id, name FROM category";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Category category = new Category(id, name);
                arr.add(category);
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public ArrayList<Category> selectByName(String query) {
        ArrayList<Category> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();

            String sql = "Select id , name FROM category WHERE name LIKE ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, query + '%');
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Category category = new Category(id, name);
                arr.add(category);
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;

    }
}
