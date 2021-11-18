package Business.Customer;

import Business.UserAccount.UserAccount;
import Business.Util.Util;

public class Customer {
    private String name, email, phoneNumber, address;
    private int age;
    private UserAccount userAccount;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public boolean setUserAccount(UserAccount userAcc) {
        if (userAcc == null)
            return false;
        this.userAccount = userAcc;
        return true;
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

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (Util.strValidate(email, "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$") == false)
            return false;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        if (Util.strValidate(address, null) == false)
            return false;
        this.address = address;
        return true;
    }

    public int getAge() {
        return age;
    }
    
    public boolean setAge(String age) {
        if (Util.strValidate(age, "^[0-9]+$") == false)
            return false;
        try {
            return setAge(Integer.valueOf(age));
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean setAge(int age) {
        if ((age <= 0) || (age > 200))
            return false;
        this.age = age;
        return true;
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
        final Customer other = (Customer) obj;
        if (this.age != other.age) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if ((this.phoneNumber == null) ? (other.phoneNumber != null) : !this.phoneNumber.equals(other.phoneNumber)) {
            return false;
        }
        if ((this.address == null) ? (other.address != null) : !this.address.equals(other.address)) {
            return false;
        }
        if (this.userAccount != other.userAccount && (this.userAccount == null || !this.userAccount.equals(other.userAccount))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
