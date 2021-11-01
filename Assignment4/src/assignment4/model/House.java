package assignment4.model;

import java.util.ArrayList;

public class House {
    private String address;
    private Community community;
    private ArrayList<Person> residents;
    
    public boolean addPerson(Person person) {
        if (person == null)
            return false;
        return residents.add(person);
    }
    
    public House() {
        residents = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        if (address == null || address.trim().equals(""))
            return false;
        this.address = address;
        return true;
    }

    public Community getCommunity() {
        return community;
    }

    public boolean setCommunity(Community community) {
        if (community == null)
            return false;
        this.community = community;
        return true;
    }

    public ArrayList<Person> getResidents() {
        return residents;
    }

    public boolean setResidents(ArrayList<Person> residents) {
        if (residents == null)
            return false;
        this.residents = residents;
        return true;
    }
    
    public boolean removeResident(Person person) {
        return residents.remove(person);
    }
}
