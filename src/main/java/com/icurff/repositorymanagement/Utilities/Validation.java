package Utilities;

import DAO.UserDAO;
import Model.User;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validation extends InputVerifier {
  
    public static boolean checkExistence(int id, JComponent username, JComponent email) {

        String text1 = ((JTextField) username).getText().trim();
        String text2 = ((JTextField) email).getText().trim();

        User user = UserDAO.getInstance().selectUser(id);
        if (text1 == user.getUsername()) {
            JOptionPane.showMessageDialog(null, "Username has been taken");
            return false;
        };

        if (text2 == user.getUsername()) {
            JOptionPane.showMessageDialog(null, "Email has been taken");
            return false;
        };
        
        return true;
    }

    @Override
    public boolean verify(JComponent input) {

        String name = input.getName();
        if (name.equals("username")) {
            String text = ((JTextField) input).getText().trim();
            if (text.length() < 6 || text.length() > 20) {
                JOptionPane.showMessageDialog(null, "username length must be >=6 and <=20 ");
                return false;
            }
            if (!text.matches("^[a-zA-Z0-9]+$")) {
                JOptionPane.showMessageDialog(null, "username must not have special char ");
                return false;
            }

        }
        if (name.equals("existUsername")) {
            String text = ((JTextField) input).getText().trim();
            if (text.length() < 6 || text.length() > 20) {
                JOptionPane.showMessageDialog(null, "username length must be >=6 and <=20 ");
                return false;
            }
            if (!text.matches("^[a-zA-Z0-9]+$")) {
                JOptionPane.showMessageDialog(null, "username must not have special char ");
                return false;
            }

            if (UserDAO.getInstance().selectUsername(text)) {
                JOptionPane.showMessageDialog(null, "username has been taken");
                return false;
            }

        }
        if (name.equals("existEmail")) {
            String text = ((JTextField) input).getText().trim();
            if (text.length() < 3 || text.length() > 320) {
                JOptionPane.showMessageDialog(null, "Email length is not valid ");
                return false;
            }
            if (!text.matches("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})*$")) {
                JOptionPane.showMessageDialog(null, "Email is not valid ");
                return false;
            }

            if (UserDAO.getInstance().selectEmail(text)) {
                JOptionPane.showMessageDialog(null, "Email has been taken");
                return false;
            }

        }
        if (name.equals("email")) {
            String text = ((JTextField) input).getText().trim();
            if (text.length() < 3 || text.length() > 320) {
                JOptionPane.showMessageDialog(null, "Email length is not valid ");
                return false;
            }
            if (!text.matches("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})*$")) {
                JOptionPane.showMessageDialog(null, "Email is not valid ");
                return false;
            }
        }

        if (name.equals("password")) {
            String text = ((JTextField) input).getText().trim();

            if (!text.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
                JOptionPane.showMessageDialog(null, "Password must be minimum eight characters,"
                        + " at least one uppercase letter, one lowercase letter, one number and one special character: ");
                return false;
            }

        }
        if (name.equals("quantity")) {
            String text = ((JTextField) input).getText().trim();
            if (!text.matches("^\\d+$")) {
                JOptionPane.showMessageDialog(null, "Quantity must be a positive integer number");
                return false;
            }

        }
        if (name.equals("price")) {
            String text = ((JTextField) input).getText().trim();
            if (!text.matches("^\\d+$")) {
                JOptionPane.showMessageDialog(null, "Price must be a positive integer number");
                return false;
            }

        }
        if (name.equals("name")) {
            String text = ((JTextField) input).getText().trim();

            if (text.length() == 0) {
                JOptionPane.showMessageDialog(null, "You must input ");
                return false;
            }
            if (!text.matches("^[\\p{L} ]+$")) {
                JOptionPane.showMessageDialog(null, "Name must not have special char ");
                return false;
            }

        }
        
        
        return true;
    }

    @Override
    public boolean shouldYieldFocus(JComponent source, JComponent target) {
        return true;
    }

}
