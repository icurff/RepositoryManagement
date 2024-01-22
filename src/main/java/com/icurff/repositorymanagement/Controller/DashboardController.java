package Controller;

import Database.DbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class DashboardController {

    public static JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                null,
                "Overview", "Value",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
       
        return barChart;
    }

    public static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(loadTotalCategory(), "Total Category", "Categories");
        dataset.setValue(loadTotalBrand(), "Total Brand", "Brands");
        dataset.setValue(loadTotalProduct(), "Total Product", "Products");

        dataset.setValue(loadTotalUser(), "Total User", "Users");
        return dataset;
    }

    private static int loadTotalProduct() {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT COUNT(*) as Total FROM product ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                return rs.getInt("Total");
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return 0;
    }

    private static int loadTotalUser() {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT COUNT(*) as Total FROM user ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
              
                return rs.getInt("Total");
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return 0;
    }

    private static int loadTotalBrand() {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT COUNT(*) as Total FROM brand ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                return rs.getInt("Total");
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return 0;
    }

    private static int loadTotalCategory() {
        try {
            Connection con = DbConnector.getConnection();
            String sql = "SELECT COUNT(*) as Total FROM category ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
         
                return rs.getInt("Total");
            }
//            DbConnector.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return 0;
    }
}
