package Controller;

import DAO.UserDAO;
import Model.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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

public class UserController {

    public UserController(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);    // delete all rows when switch layer
        ArrayList<User> arr = UserDAO.getInstance().getArrayList();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        for (User user : arr) {
            
           
            
            String regTime = formatter.format(user.getRegisterAt());
            model.addRow(new Object[]{user.getId(), user.getUsername(), user.getEmail(), user.getPassword(), user.getFirstname(),
                user.getLastname(), regTime});
        }

    }

    public static void displayTable(ArrayList<User> arr, JTable table) {
        for (User user : arr) {
            UserDAO.getInstance().add(user);
        }
        new UserController(table);
    }

    public static void search(String query, JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);    // delete all rows when switch panel
        ArrayList<User> arr = UserDAO.getInstance().selectByName(query.trim());
        for (User user : arr) {
            model.addRow(new Object[]{user.getId(), user.getUsername(), user.getEmail(), user.getPassword(), user.getFirstname(),
                user.getLastname(), user.getRegisterAt()});
        }

    }

    public static void dbAddUser(User user) {
        if (user.getUsername().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!UserDAO.getInstance().add(user)) {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbUpdateUser(User user) {

        int temp = JOptionPane.showConfirmDialog(null, "Do you want to update " + user.getUsername(), "User Update", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (UserDAO.getInstance().update(user)) {
                JOptionPane.showMessageDialog(null, "This user has been updated successfully!",
                        "User updated", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is some error",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void dbDeleteUser(User user) {
        
        int temp = JOptionPane.showConfirmDialog(null, "Do you want to delete " + user.getUsername(), "User Delete", JOptionPane.YES_NO_OPTION, 0);
        if (temp == JOptionPane.YES_OPTION) {
            if (UserDAO.getInstance().delete(user)) {
                JOptionPane.showMessageDialog(null, "This user has been deleted successfully!",
                        "User updated", JOptionPane.INFORMATION_MESSAGE);
            } else {

                
 JOptionPane.showMessageDialog(null, "This User sticks to some products so you can't delete it",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public static void exportFile(String path) {
        ArrayList<User> arr = UserDAO.getInstance().getArrayList();
    
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        XSSFWorkbook wordkbook = new XSSFWorkbook();
        XSSFSheet sheet = wordkbook.createSheet("danhsach");
        XSSFRow row = null;
        Cell cell = null;
       row = sheet.createRow(0);

        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("ID");
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Username");
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Email");
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Password");
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("FirstName");
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("LastName");

    
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("RegisterAt");

        for (int i = 0; i < arr.size(); i++) {
            //Modelbook book =arr.get(i);
            row = sheet.createRow(1 + i);

            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(arr.get(i).getId());
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(arr.get(i).getUsername());
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(arr.get(i).getEmail());
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(arr.get(i).getPassword());
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(arr.get(i).getFirstname());
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(arr.get(i).getLastname());
      
            cell = row.createCell(6, CellType.STRING);
            String registerTime = formatter.format(arr.get(i).getRegisterAt());
            cell.setCellValue(registerTime);

        }

        try {
            FileOutputStream fos = new FileOutputStream(path);
            wordkbook.write(fos);
            fos.close();
            JOptionPane.showMessageDialog(null, "These data has been exported successfully!",
                    "Export Date", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void importFile(String path, JTable table) {
        ArrayList<User> arr = new ArrayList();
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
                User user = new User();
                for (Cell cell : row) {

                    String formattedString = format.formatCellValue(cell);
                    int columnIndex = cell.getColumnIndex();

                    switch (columnIndex) {
                        case 1: 
                            user.setUsername(formattedString);
                            break;
                        case 2:

                            user.setEmail(formattedString);
                            break;
                        case 3:

                            user.setPassword(formattedString);
                            break;
                        case 4:

                            user.setFirstname(formattedString);
                            break;
                        case 5:

                            user.setLastname(formattedString);
                            break;
                        
                     
                        case 6:
                            java.util.Date regDate = formatter.parse(formattedString);
                            Timestamp timestamp = new Timestamp(regDate.getTime());
                            
                            user.setRegisterAt(timestamp);
                            break;

                    }

                }
                arr.add(user);
            }
            displayTable(arr, table);
            JOptionPane.showMessageDialog(null, " Data has been imported successfully!",
                    "Import Date", JOptionPane.INFORMATION_MESSAGE);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
