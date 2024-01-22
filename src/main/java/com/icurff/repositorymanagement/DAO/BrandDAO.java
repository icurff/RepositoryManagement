package DAO;

import Model.Brand;
import java.util.ArrayList;
import java.sql.*;
import Database.DbConnector;
import javax.swing.JOptionPane;

public class BrandDAO implements DAOInterface<Brand> {

    private int affectedRows = 0;
    private static BrandDAO brandInstance = null;

    public static BrandDAO getInstance() {
        if (brandInstance == null) {
            brandInstance = new BrandDAO();
        }
        return brandInstance;
    }

    @Override
    public boolean add(Brand t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "INSERT INTO brand(name)VALUES(?)";
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
    public boolean update(Brand t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "UPDATE brand SET name =? WHERE id = ? ";
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
    public boolean delete(Brand t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "DELETE FROM brand WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getId());
            affectedRows = st.executeUpdate();
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {
           
            e.printStackTrace();
        }
        return affectedRows != 0;
    }

    @Override
    public ArrayList<Brand> getArrayList() {
        ArrayList<Brand> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT id, name FROM brand";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Brand brand = new Brand(id, name);
                arr.add(brand);
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public ArrayList<Brand> selectByName(String query) {
        ArrayList<Brand> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();

            String sql = "Select id , name FROM brand WHERE name LIKE ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, query + '%');
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Brand brand = new Brand(id, name);
                arr.add(brand);
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;

    }
}
