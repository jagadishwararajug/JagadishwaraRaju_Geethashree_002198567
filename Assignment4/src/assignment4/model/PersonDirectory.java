package assignment4.model;

import java.util.ArrayList;

public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public boolean setPersonList(ArrayList<Person> personList) {
        if (personList == null)
            return false;
        this.personList = personList;
        return true;
    }
    
    public void addPerson(Person person) {
        personList.add(person);
    }
    
    public boolean removePerson(Person person) {
        return personList.remove(person);
    }
    
    public void updatePerson(int index, Person person) {
        person.getHouse().removeResident(person);
        personList.set(index, person);
    }
    
    public boolean findId(String id) {
        
        for (Person p: personList) {
            if (p.getId().equals(id.trim())) 
                return true;
        }
        
        return false;
    }
            
}
