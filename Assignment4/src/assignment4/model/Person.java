package assignment4.model;

import java.util.Objects;

public class Person {
    private String name;
    private String id;
    private int age;
    private String sex;
    private House house;
    private Patient patient;

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
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.sex, other.sex)) {
            return false;
        }
        if (!Objects.equals(this.house, other.house)) {
            return false;
        }
        if (!Objects.equals(this.patient, other.patient)) {
            return false;
        }
        return true;
    }
    
    

    public String toString() {
        return name;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public boolean setPatient(Patient patient) {
        if (patient == null)
            return false;
        this.patient = patient;
        return true;
    }

    public House getHouse() {
        return house;
    }

    public boolean setHouse(House house) {
        if (house == null)
            return false;
        this.house = house;
        return true;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name == null)
            return false;
        this.name = name;
        return true;
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id == null || id.trim().equals(""))
            return false;
        this.id = id;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age < 0 || age > 150)
            return false;
        this.age = age;
        return true;
    }
    
    public boolean setAge(String age) {
        if (age == null)
            return false;
        
        try {
            int ageNum = Integer.parseInt(age);
            return setAge(ageNum);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getSex() {
        return sex;
    }

    public boolean setSex(String sex) {
        if (sex == null || sex.trim().equals(""))
            return false;
        this.sex = sex;
        return true;
    }
}
