package Business.UserAccount;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;


public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role, Customer customer){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        if (employee != null)
            userAccount.setEmployee(employee);
        if (customer != null)
            userAccount.setCustomer(customer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public boolean addUserAccount(UserAccount uacc) {
        if(userAccountList.contains(uacc))
            return false;
        return userAccountList.add(uacc);
    }
    
    public boolean updateUserAccount(int idx, UserAccount uacc) {
        if (userAccountList.contains(uacc)) {
            // user exists. but it is okay if the username is the same as the 
            // previous username for this user
            int existingIdx = userAccountList.indexOf(uacc);
            if (existingIdx != idx) // trying to take someone elses username
                return false;
        }
        
        userAccountList.set(idx, uacc);
        return true;
    }
    
    public boolean removeUserAccount(UserAccount uacc) {
        return userAccountList.remove(uacc);
    }
}
