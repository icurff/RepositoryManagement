package DAO;
import Model.Product;
import java.util.ArrayList;
import java.sql.*;
import Database.DbConnector;

public class ProductDAO implements DAOInterface<Product> {

    private int affectedRows = 0;
    private static ProductDAO productInstance = null;

    public static ProductDAO getInstance() {
        if (productInstance == null) {
            productInstance = new ProductDAO();
        }
        return productInstance;
    }

    @Override
    public boolean add(Product t) {
        try {
            Connection con = DbConnector.getConnection();
            // GET BRAND ID
            String sql = "Select id from brand where name = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getBrand());
            ResultSet rs = st.executeQuery();
            rs.next();
            int brandId = rs.getInt("id");

            // GET Category Id
            sql = "Select id from category where name = ? ";
            st = con.prepareStatement(sql);
            st.setString(1, t.getCategory());
            rs = st.executeQuery();
            rs.next();
            int categoryId = rs.getInt("id");
                        // GET User Id

            sql = "Select id from user where username = ? ";
            st = con.prepareStatement(sql);
            st.setString(1, t.getPostBy());
            rs = st.executeQuery();
            rs.next();
            int userId = rs.getInt("id");

            sql = "INSERT INTO product(name,brandId,categoryId,price,quantity,postBy)VALUES(?,?,?,?,?,?)";
            st = con.prepareStatement(sql);
            st.setString(1, t.getName());
            st.setInt(2, brandId);
            st.setInt(3, categoryId);
            st.setDouble(4, t.getPrice());
            st.setDouble(5, t.getQuantity());
            st.setInt(6, userId);
            affectedRows = st.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return (affectedRows != 0);
    }

    @Override
    public boolean update(Product t) {
        try {
            Connection con = DbConnector.getConnection();
            // GET BRAND ID
            String sql = "Select id from brand where name = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getBrand());
            ResultSet rs = st.executeQuery();
            rs.next();
            int brandId = rs.getInt("id");

            // GET Category Id
            sql = "Select id from category where name = ? ";
            st = con.prepareStatement(sql);
            st.setString(1, t.getCategory());
            rs = st.executeQuery();
            rs.next();
            int categoryId = rs.getInt("id");

            sql = "Update product set name = ? ,price = ? , categoryId = ? ,brandId  =  ?,quantity = ? where id = ?";
            st = con.prepareStatement(sql);
            st.setString(1, t.getName());

            st.setDouble(2, t.getPrice());
            st.setInt(3, categoryId);
            st.setInt(4, brandId);
            st.setInt(5, t.getQuantity());

            st.setInt(6, t.getId());

            affectedRows = st.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return affectedRows != 0;
    }

    @Override
    public boolean delete(Product t) {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "DELETE FROM product WHERE id = ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getId());
            affectedRows = st.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return affectedRows != 0;
    }

    @Override
    public ArrayList<Product> getArrayList() {
        ArrayList<Product> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();
            String sql = " SELECT * from detailproduct";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String category = rs.getString("category");
                String brand = rs.getString("brand");
                String postBy = rs.getString("postBy");
                Timestamp updateAt = rs.getTimestamp("updateAt");
                Product product = new Product(id, name, price, quantity, category, brand, postBy, updateAt);
                arr.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public ArrayList<Product> selectByName(String query) {
        ArrayList<Product> arr = new ArrayList();
        try {
            Connection con = DbConnector.getConnection();
            String sql = " SELECT * from detailproduct WHERE name LIKE ? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, query + '%');
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String category = rs.getString("category");
                String brand = rs.getString("brand");
                String postBy = rs.getString("postBy");
                Timestamp updateAt = rs.getTimestamp("updateAt");
                Product product = new Product(id, name, price, quantity, category, brand, postBy, updateAt);
                arr.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;

    }
}
