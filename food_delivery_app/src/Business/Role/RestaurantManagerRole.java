package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.RestaurantManagerJPanel;
import javax.swing.JPanel;


public class RestaurantManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new RestaurantManagerJPanel(userProcessContainer, account, business); // TODO
    }

}
