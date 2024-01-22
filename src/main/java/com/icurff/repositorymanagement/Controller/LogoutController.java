
package Controller;

import View.LoginFrame;
import static View.MainFrame.curUser;

public class LogoutController {
    public static void logout(){
      curUser = null;
    new LoginFrame().setVisible(true);
}
}
