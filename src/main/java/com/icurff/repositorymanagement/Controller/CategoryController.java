package Controller;

import DAO.CategoryDAO;
import Model.Category;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
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

public class CategoryController {

    public CategoryController(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);    // delete all rows when switch layer
        ArrayList<Category> arr = CategoryDAO.getInstance().getArrayList();

        for (Category category : arr) {
            model.addRow(new Object[]{category.getId(), category.getName()});
          
        }
        

    }

    public static void displayTable(ArrayList<Category> arr, JTable table) {
        for (Category category : arr) {
            CategoryDAO.getInstance().add(category);
        }
        new CategoryController(table);
    }

    public static void search(String query, JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);    // delete all rows when switch panel
        ArrayList<Category> arr = CategoryDAO.getInstance().selectByName(query.trim());
        for (Category category : arr) {
            model.addRow(new Object[]{category.getId(), category.getName()});
        }

    }

    public static void dbAddCategory(Category category) {

        if (category.getName().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!CategoryDAO.getInstance().add(category)) {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbUpdateCategory(Category category) {

        int temp = JOptionPane.showConfirmDialog(null, "Do you want to update category with Id: " + category.getId() + "\n" + "Change its Name to: " + category.getName(), "Update Category", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (CategoryDAO.getInstance().update(category)) {
                JOptionPane.showMessageDialog(null, "This category has been updated successfully!",
                        "Category updated", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbDeleteCategory(Category category) {

        int temp = JOptionPane.showConfirmDialog(null, "Do you want to delete category with Id: " + category.getId(), "Delete Category", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (CategoryDAO.getInstance().delete(category)) {
                JOptionPane.showMessageDialog(null, "This category has been deleted successfully!",
                        "Category updated", JOptionPane.INFORMATION_MESSAGE);
            } else {
//                JOptionPane.showMessageDialog(null, "There are some errors!",
//                        "Error", JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog(null, "This Category sticks to some products so you can't delete it",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public static void exportFile(String path) {
        ArrayList<Category> arr = CategoryDAO.getInstance().getArrayList();
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

        for (int i = 0; i < arr.size(); i++) {
            //Modelbook book =arr.get(i);
            row = sheet.createRow(1 + i);

            cell = row.createCell(0, CellType.NUMERIC);
            cell.setCellValue(arr.get(i).getId());

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(arr.get(i).getName());

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
        ArrayList<Category> arr = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            DataFormatter format = new DataFormatter();
            for (Row row : sheet) {
                if ( row.getRowNum() == 0) {   // ignore 2 first row
                    continue;
                }
                Category category = new Category();
                for (Cell cell : row) {

                    String formattedString = format.formatCellValue(cell);
                    int columnIndex = cell.getColumnIndex();

                    switch (columnIndex) {

//                        case 0:
//
//                            category.setId(Integer.parseInt(formattedString));
//                            break;
                        case 1:

                            category.setName(formattedString);
                            break;
                    }

                }
                arr.add(category);
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
