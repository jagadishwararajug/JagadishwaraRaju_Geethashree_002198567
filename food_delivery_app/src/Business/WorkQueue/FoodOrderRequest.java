package Business.WorkQueue;

import Business.Restaurant.MenuItemOrder;
import java.util.ArrayList;

public class FoodOrderRequest extends WorkRequest {
    private ArrayList<MenuItemOrder> menuItemOrders;

    public ArrayList<MenuItemOrder> getMenuItemOrders() {
        return menuItemOrders;
    }

    public void setMenuItemOrders(ArrayList<MenuItemOrder> menuItemOrders) {
        this.menuItemOrders = menuItemOrders;
    }
    
    
    
}