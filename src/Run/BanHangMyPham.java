package Run;

import ViewUser.LoginUser;

public class BanHangMyPham {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }
}
