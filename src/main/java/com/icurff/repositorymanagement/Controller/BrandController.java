package Controller;

import DAO.BrandDAO;
import Model.Brand;
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

public class BrandController {

    public BrandController(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);    // delete all rows when switch layer
        ArrayList<Brand> arr = BrandDAO.getInstance().getArrayList();
        for (Brand brand : arr) {
            model.addRow(new Object[]{brand.getId(), brand.getName()});
        }

    }

    public static void displayTable(ArrayList<Brand> arr, JTable table) {
        for (Brand brand : arr) {
            BrandDAO.getInstance().add(brand);
        }
        new BrandController(table);
    }

    public static void search(String query, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);   
        ArrayList<Brand> arr = BrandDAO.getInstance().selectByName(query.trim());
        for (Brand brand : arr) {
            model.addRow(new Object[]{brand.getId(), brand.getName()});
        }

    }

    public static void dbAddBrand(Brand brand) {
        if (brand.getName().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!BrandDAO.getInstance().add(brand)) {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbUpdateBrand(Brand brand) {

        int temp = JOptionPane.showConfirmDialog(null, "Do you want to update brand with Id: " + brand.getId() + "\n" + "Change its Name to: " + brand.getName(), "Brand Update", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (BrandDAO.getInstance().update(brand)) {
                JOptionPane.showMessageDialog(null, "This brand has been updated successfully!",
                        "Brand updated", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbDeleteBrand(Brand brand) {

        int temp = JOptionPane.showConfirmDialog(null, "Do you want to delete category with Id: " + brand.getId(), "Brand Delete", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (BrandDAO.getInstance().delete(brand)) {
                JOptionPane.showMessageDialog(null, "This brand has been deleted successfully!",
                        "Brand updated", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "This Brand sticks to some products so you can't delete it",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public static void exportFile(String path) {
        ArrayList<Brand> arr = BrandDAO.getInstance().getArrayList();
        XSSFWorkbook wordkbook = new XSSFWorkbook();
        XSSFSheet sheet = wordkbook.createSheet("danhsach");
        XSSFRow row = null;
        Cell cell = null;
        row = sheet.createRow(0);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("ID");
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Name");
        for (int i = 0; i < arr.size(); i++) {
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
        ArrayList<Brand> arr = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            DataFormatter format = new DataFormatter();
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {   
                    continue;
                }
                Brand brand = new Brand();
                for (Cell cell : row) {
                    String formattedString = format.formatCellValue(cell);
                    int columnIndex = cell.getColumnIndex();
                    switch (columnIndex) {
                        case 1:
                            brand.setName(formattedString);
                            break;
                    }
                }
                arr.add(brand);
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
