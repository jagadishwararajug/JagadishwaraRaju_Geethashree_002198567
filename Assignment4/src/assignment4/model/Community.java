package assignment4.model;

import java.util.ArrayList;

public class Community {
    private String name;
    private ArrayList<House> houseList;
    private City city;
    
    public boolean addHouse(House h) {
        if (h == null)
            return false;
        return houseList.add(h);
    }
    
    public Community() {
        houseList = new ArrayList<>();
    }
    
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name == null || name.trim().equals(""))
            return false;
        this.name = name;
        return true;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public boolean setHouseList(ArrayList<House> houseList) {
        if (houseList == null)
            return false;
        this.houseList = houseList;
        return true;
    }

    public City getCity() {
        return city;
    }

    public boolean setCity(City city) {
        if (city == null)
            return false;
        this.city = city;
        return true;
    }
}
