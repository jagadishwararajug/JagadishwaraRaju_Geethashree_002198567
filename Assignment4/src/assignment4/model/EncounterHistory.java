package assignment4.model;

import java.util.ArrayList;

public class EncounterHistory {
    private ArrayList<Encounter> encounterList;

    public EncounterHistory() {
        encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public boolean setEncounterList(ArrayList<Encounter> encounterList) {
        if (encounterList == null)
            return false;
        this.encounterList = encounterList;
        return true;
    }
    
    public boolean addEncounter(Encounter e) {
        return encounterList.add(e);
    }
    
    public boolean deleteEncounter(Encounter e) {
        return encounterList.remove(e);
    }
    
    public void updateEncounter(int index, Encounter e) {
        encounterList.set(index, e);
    }
    
}
