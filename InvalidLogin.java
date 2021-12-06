package project;

import java.awt.event.ActionEvent;

public class InvalidLogin extends LoginMassage
{
    InvalidLogin(String str)
    {
        super(str);
    }
    public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
    }
}
