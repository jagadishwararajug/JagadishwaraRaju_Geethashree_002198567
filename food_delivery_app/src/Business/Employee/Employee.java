package Business.Employee;

import Business.UserAccount.UserAccount;
import Business.Util.Util;

public class Employee {
    
    private String name;
    private String address;
    private String phoneNumber;
    private int id;
    private UserAccount userAccount;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public boolean setName(String name) {
        if (Util.strValidate(name, null) == false)
            return false;
        this.name = name;
        return true;
    }

    
    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return name;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public boolean setUserAccount(UserAccount userAccount) {
        if (userAccount == null) 
            return false;
        this.userAccount = userAccount;
        return true;
    }
    
//    public boolean setId(String id) {
//        if (Util.strValidate(id, "^[0-9]+$") == false)
//            return false;
//        try {
//            return setId(Integer.valueOf(id));
//        } catch (Exception ex) {
//            return false;
//        }
//    }
//
//    public boolean setId(int id) {
//        if (id < 0)
//            return false;
//        this.id = id;
//        return true;
//    }

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
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.userAccount != other.userAccount && (this.userAccount == null || !this.userAccount.equals(other.userAccount))) {
            return false;
        }
        return true;
    }
    
    
}
