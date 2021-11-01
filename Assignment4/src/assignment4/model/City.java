package assignment4.model;

import java.util.ArrayList;

public class City {
    private String name, state;
    private HealthSystem system;
    private ArrayList<Community> communities;
    
    public City() {
        communities = new ArrayList<>();
    }
    
    public Community getCommunity(String communityName) {
        for(Community c: communities) {
            if(c.getName().trim().toLowerCase().equals(communityName.trim().toLowerCase()))
                return c;
        }
        return null;
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
    
    public void addCommunity(Community comm) {
        communities.add(comm);
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public boolean setCommunities(ArrayList<Community> communities) {
        if (communities == null)
            return false;
        this.communities = communities;
        return true;
    }

    public String getState() {
        return state;
    }

    public boolean setState(String state) {
        if (state == null || state.trim().equals(""))
            return false;
        this.state = state;
        return true;
    }

    public HealthSystem getSystem() {
        return system;
    }

    public boolean setSystem(HealthSystem system) {
        if (system == null)
            return false;
        this.system = system;
        return true;
    }
}
