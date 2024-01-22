package Controller;

import DAO.BrandDAO;
import DAO.CategoryDAO;
import DAO.ProductDAO;
import Model.Brand;
import Model.Category;
import Model.Product;
import View.MainFrame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.sql.Timestamp;

public class ProductController {

    public static void loadBrandData(JComboBox box) {
        box.removeAllItems();
        box.addItem("Brand");

        ArrayList<Brand> arr = BrandDAO.getInstance().getArrayList();
        for (Brand brand : arr) {
            box.addItem(brand.getName());
        }

    }

    public static void loadCategoryData(JComboBox box) {
        box.removeAllItems();
        box.addItem("Category");
        ArrayList<Category> arr = CategoryDAO.getInstance().getArrayList();
        for (Category category : arr) {
            box.addItem(category.getName());
        }

    }

    public ProductController(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);    // delete all rows when switch layer
        ArrayList<Product> arr = ProductDAO.getInstance().getArrayList();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (Product product : arr) {
            String text = formatter.format(product.getUpdateAt());
            model.addRow(new Object[]{product.getId(), product.getName(), product.getPrice(), product.getQuantity(),
                product.getCategory(), product.getBrand(),product.getPostBy(),text});
        }

    }

    public static void displayTable(ArrayList<Product> arr, JTable table) {
        for (Product product : arr) {
            ProductDAO.getInstance().add(product);
        }
        new ProductController(table);
    }

    public static void search(String query, JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);    // delete all rows when switch panel
        ArrayList<Product> arr = ProductDAO.getInstance().selectByName(query.trim());
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (Product product : arr) {
            String text = formatter.format(product.getUpdateAt());
            model.addRow(new Object[]{product.getId(), product.getName(), product.getPrice(), product.getQuantity(),
                product.getCategory(), product.getBrand(),product.getPostBy(),text});
        }

    }

    public static void dbAddProduct(Product product) {
        if (product.getName().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!ProductDAO.getInstance().add(product)) {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbUpdateProduct(Product product) {

        int temp = JOptionPane.showConfirmDialog(null, "Do you want to update product Id: " + product.getId(), "Product Update", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (ProductDAO.getInstance().update(product)) {
                JOptionPane.showMessageDialog(null, "This product has been updated successfully!",
                        "Product updated", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbDeleteProduct(Product product) {

        int temp = JOptionPane.showConfirmDialog(null, "Do you want to delete product Id: " + product.getId(), "Product Delete", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (ProductDAO.getInstance().delete(product)) {
                JOptionPane.showMessageDialog(null, "This product has been deleted successfully!",
                        "Product updated", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public static void exportFile(String path) {
        ArrayList<Product> arr = ProductDAO.getInstance().getArrayList();
        XSSFWorkbook wordkbook = new XSSFWorkbook();
        XSSFSheet sheet = wordkbook.createSheet("danhsach");
        XSSFRow row = null;
        Cell cell = null;
//        row = sheet.createRow(0);
//        cell = row.createCell(0, CellType.STRING);
//        cell.setCellValue("DANH SACH ");

        row = sheet.createRow(0);

        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("ID");

        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Name");

        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Category");

        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Brand");
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Price");
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Quantity");
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("LastUpdate");

        for (int i = 0; i < arr.size(); i++) {
            //Modelbook book =arr.get(i);
            row = sheet.createRow(1 + i);

            cell = row.createCell(0, CellType.NUMERIC);
            cell.setCellValue(arr.get(i).getId());

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(arr.get(i).getName());

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(arr.get(i).getCategory());

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(arr.get(i).getBrand());

            cell = row.createCell(4, CellType.NUMERIC);
            cell.setCellValue(arr.get(i).getPrice());

            cell = row.createCell(5, CellType.NUMERIC);
            cell.setCellValue(arr.get(i).getQuantity());

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String text = formatter.format(arr.get(i).getUpdateAt());
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue(text);
        }

        try {
            FileOutputStream fos = new FileOutputStream(path);
            wordkbook.write(fos);
            fos.close();
            JOptionPane.showMessageDialog(null, "These data has been exported successfully!",
                    "data export", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void importFile(String path, JTable table) {
        ArrayList<Product> arr = new ArrayList();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            DataFormatter format = new DataFormatter();
           
            for (Row row : sheet) {
                if ( row.getRowNum() == 0) {   // ignore 2 first row
                 
                    continue;
                }
                Product product = new Product();
                for (Cell cell : row) {

                    String formattedString = format.formatCellValue(cell);
               
                    int columnIndex = cell.getColumnIndex();

                    switch (columnIndex) {

                        case 1:

                            product.setName(formattedString);
                            break;
                        case 2:

                            product.setCategory(formattedString);
                            break;
                        case 3:

                            product.setBrand(formattedString);
                            break;
                        case 4:

                            product.setPrice(Integer.parseInt(formattedString));
                            break;
                        case 5:

                            product.setQuantity(Integer.parseInt(formattedString));
                            break;
                        case 6:

                            java.util.Date utilDate = formatter.parse(formattedString);
                            Timestamp timestamp = new Timestamp(utilDate.getTime());
                            product.setUpdateAt(timestamp);
                            break;
                    }

                }
                product.setPostBy(MainFrame.curUser.getUsername());
                arr.add(product);
              
            }
            displayTable(arr, table);
            JOptionPane.showMessageDialog(null, " data has been imported successfully!",
                    "data import", JOptionPane.INFORMATION_MESSAGE);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
