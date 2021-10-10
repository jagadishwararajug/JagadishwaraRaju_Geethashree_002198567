package model;

import java.util.Objects;

public class Driver {
    private String name;
    private String gender;
    private int age;
    
    public Driver() {
        
    }

    @Override
    public String toString() {
        return "Driver{" + "name=" + name + ", gender=" + gender + ", age=" + age + '}';
    }

    public Driver(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if ((name == null) || (name.trim().equals("")))
            return false;
        this.name = name;
        return true;
    }

    public String getGender() {
        return gender;
    }

    public boolean setGender(String gender) {
        if ((gender == null) || (gender.trim().equals("")))
            return false;
        this.gender = gender;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if ((age < 16) || (age > 100)) //  16 is the legal driving age in USA
            return false;
        this.age = age;
        return true;
    }
    
    public boolean setAge(String age) {
        if (age == null)
            return false;
        try {
            return this.setAge(Integer.parseInt(age));
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.gender);
        hash = 61 * hash + this.age;
        return hash;
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
        final Driver other = (Driver) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }
    
    
}