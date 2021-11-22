package Business.Restaurant;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import Business.Util.Util;
import Business.WorkQueue.FoodOrderRequest;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    private String name, address, phoneNumber;
    private Employee manager;
    private ArrayList<MenuItem> menu;
    
    public Restaurant() {
        menu = new ArrayList<MenuItem>();
    }
    
    private String getOrderSummary(ArrayList<MenuItemOrder> order) {
        StringBuilder str = new StringBuilder();
        float total = 0.0f;
        for (MenuItemOrder mi : order) {
            str.append(mi.getMenuItem().toString() + " x" + mi.getQuantity() 
                    + " Comments : " + mi.getComments() + "\n");
            total += (mi.getMenuItem().getCost() * mi.getQuantity());
        }
        str.append("Total Bill = $" + total);
        return str.toString();
    }
    
    public void placeOrder(UserAccount customer, ArrayList<MenuItemOrder> order) {
        String orderSummary = getOrderSummary(order);
        FoodOrderRequest fr = new FoodOrderRequest();
        fr.setMessage(orderSummary);
        fr.setSender(customer);
        fr.setReceiver(manager.getUserAccount());
        fr.setRequestDate(new Date());
        fr.setStatus("Order Placed");
        fr.setMenuItemOrders(order);
        manager.getUserAccount().getWorkQueue().getWorkRequestList().add(fr);
        customer.getWorkQueue().getWorkRequestList().add(fr);
    }
    
    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (Util.strValidate(name, null) == false)
            return false;
        this.name = name;
        return true;
    }
    
    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        if (Util.strValidate(address, null) == false)
            return false;
        this.address = address;
        return true;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean setPhoneNumber(String phoneNumber) {
        if (Util.strValidate(phoneNumber, "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$") == false)
            return false;
        this.phoneNumber = phoneNumber;
        return true;
    }

    public Employee getManager() {
        return manager;
    }

    public boolean setManager(Employee manager) {
        if (manager == null)
            return false;
        this.manager = manager;
        return true;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public boolean setMenu(ArrayList<MenuItem> menu) {
        if (menu == null)
            return false;
        this.menu = menu;
        return true;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public MenuItem getMatchingMenuItem(String item) {
        for(MenuItem mi : menu) {
            if(mi.getName().equals(item))
                return mi;
        }
        return null;
    }
    
}
