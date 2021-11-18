package Business.UserAccount;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.Util.Util;
import Business.WorkQueue.WorkQueue;

public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private Customer customer;
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public boolean setCustomer(Customer customer) {
        if (customer == null) 
            return false;
        this.customer = customer;
        return true;
    }

    public String getUsername() {
        return username;
    }

    public boolean setUsername(String username) {
        if (Util.strValidate(username, null) == false) 
            return false;
        this.username = username;
        return true;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (Util.strValidate(password, null) == false) 
            return false;
        this.password = password;
        return true;
    }

    public Role getRole() {
        return role;
    }

    public boolean setEmployee(Employee employee) {
        if (employee == null)
            return false;
        this.employee = employee;
        return true;
    }

    public boolean setRole(Role role) {
        if (role == null) 
            return false;
        this.role = role;
        return true;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    @Override
    public String toString() {
        return username;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserAccount other = (UserAccount) obj;
        if ((this.username == null) ? (other.username != null) : !this.username.equals(other.username)) {
            return false;
        }
        return true;
    }


}