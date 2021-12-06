package project;

import java.awt.event.ActionEvent;

public class ValidLogin extends LoginMassage
{
    ValidLogin(String str)
    {
        super(str);
    }
    public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
        new Admin();
    }
}
