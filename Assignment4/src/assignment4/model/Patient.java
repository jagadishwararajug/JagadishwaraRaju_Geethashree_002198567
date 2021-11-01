package assignment4.model;

public class Patient {
    private EncounterHistory encounterHistory;
    private String id;
    private Person person;
    
    public Patient() {
        encounterHistory = new EncounterHistory();
    }
    
    public void addEncounter(Encounter e) {
        encounterHistory.getEncounterList().add(e);
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public boolean setEncounterHistory(EncounterHistory encounterHistory) {
        if (encounterHistory == null)
            return false;
        this.encounterHistory = encounterHistory;
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

    public Person getPerson() {
        return person;
    }

    public boolean setPerson(Person person) {
        if (person == null)
            return false;
        this.person = person;
        return true;
    }
    
    public String toString() {
        return person.getName();
    }
}
