package Business.Customer;

import java.util.ArrayList;

public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public boolean setCustomerList(ArrayList<Customer> customerList) {
        if (customerList == null)
            return false;
        this.customerList = customerList;
        return true;
    }
    
    public boolean addCustomer(Customer cust) {
        return customerList.add(cust);
    }
    
    public void updateCustomer(int idx, Customer cust) {
        customerList.set(idx, cust);
    }
    
    public boolean deleteCustomer(Customer cust) {
        return customerList.remove(cust);
    }
    
}
