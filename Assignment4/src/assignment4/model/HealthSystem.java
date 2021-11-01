package assignment4.model;

import java.util.ArrayList;
import java.util.Date;

public class HealthSystem {
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;
    private ArrayList<City> cityList;
    
    public HealthSystem() {
        patientDirectory = new PatientDirectory();
        personDirectory = new PersonDirectory();
        cityList = new ArrayList<>();
        
        
        City boston = newCity("Boston", "Massachusetts");
        cityList.add(boston);
        Community longwood = newCommunity("Longwood", boston);
        boston.addCommunity(longwood);
        Community fenway = newCommunity("Fenway", boston);
        boston.addCommunity(fenway);
        City portland = newCity("Portland", "Oregon");
        cityList.add(portland);
        portland.addCommunity(newCommunity("SouthEast Portland", portland));
        portland.addCommunity(newCommunity("NorthEast Portland", portland));
        
        House h1 = newHouse("121 Huntington Street", fenway);
        fenway.addHouse(h1);
        House h2 = newHouse("221 Alphonsus Street", longwood);
        longwood.addHouse(h2);
        House h3 = newHouse("556 Alphonsus Street", longwood);
        longwood.addHouse(h3);
        House h4 = newHouse("998 Huntington Street", fenway);
        fenway.addHouse(h4);
        
        
        Patient p1 = newPatient("111", newPerson("Geetha", "a1", 25, "Female", h1, null));
        p1.addEncounter(newEncounter(80, 120, 70, 98.8f, 99, "Jones"));
        p1.addEncounter(newEncounter(82, 118, 72, 99.2f, 98, "Smith"));
        p1.addEncounter(newEncounter(79, 124, 80, 97.7f, 100, "John"));
        Patient p2 = newPatient("112", newPerson("Chandana", "a2", 16, "Female", h1, null));
        // abnormal BP
        p2.addEncounter(newEncounter(70, 100, 80, 97.8f, 97, "John"));
        p2.addEncounter(newEncounter(68, 101, 75, 100.2f, 98, "Smith"));
        p2.addEncounter(newEncounter(71, 104, 85, 98.7f, 99, "Jones"));  
        Patient p7 = newPatient("117", newPerson("Jimmy", "a7", 65, "Male", h4, null));
        // abnormal BP
        p7.addEncounter(newEncounter(80, 118, 76, 98.2f, 98, "Jones"));
        p7.addEncounter(newEncounter(75, 115, 79, 100.4f, 98, "Smith"));
        p7.addEncounter(newEncounter(76, 110, 110, 101.2f, 99, "Jones"));
        Patient p8 = newPatient("118", newPerson("Sarah", "a8", 34, "Female", h4, null));
        // abnormal BP
        p8.addEncounter(newEncounter(90, 150, 99, 98.2f, 98, "Jones"));
        p8.addEncounter(newEncounter(94, 140, 100, 102.2f, 98, "Smith"));
        p8.addEncounter(newEncounter(93, 150, 110, 101.5f, 99, "Jones"));
        Patient p9 = newPatient("119", newPerson("Ralph", "a9", 19, "Male", h4, null));
        p9.addEncounter(newEncounter(77, 115, 80, 98.2f, 97, "Jones"));
        p9.addEncounter(newEncounter(79, 112, 76, 98.3f, 100, "Smith"));
        p9.addEncounter(newEncounter(80, 114, 78, 97.9f, 98, "Jones"));
        
        Patient p3 = newPatient("113", newPerson("Meghana", "a3", 8, "Female", h2, null));
        // abnormal BP
        p3.addEncounter(newEncounter(90, 120, 76, 98.2f, 97, "Jones"));
        p3.addEncounter(newEncounter(92, 125, 80, 98.3f, 100, "Smith"));
        p3.addEncounter(newEncounter(93, 124, 78, 97.9f, 98, "Jones"));
        Patient p4 = newPatient("114", newPerson("Prerana", "a4", 3, "Female", h2, null));
        p4.addEncounter(newEncounter(65, 90, 90, 98.2f, 97, "Jones"));
        p4.addEncounter(newEncounter(67, 92, 92, 98.3f, 100, "Smith"));
        p4.addEncounter(newEncounter(68, 91, 91, 99.1f, 98, "Jones"));
        Patient p5 = newPatient("115", newPerson("Divya", "a5", 38, "Female", h3, null));
        p5.addEncounter(newEncounter(80, 120, 80, 98.2f, 99, "Jones"));
        p5.addEncounter(newEncounter(81, 119, 75, 98.3f, 100, "Smith"));
        p5.addEncounter(newEncounter(79, 121, 76, 99.1f, 97, "Jones"));
        Patient p6 = newPatient("116", newPerson("Amar", "a6", 48, "Male", h3, null));
        p6.addEncounter(newEncounter(85, 125, 80, 98.2f, 100, "Jones"));
        p6.addEncounter(newEncounter(84, 127, 75, 100.1f, 99, "Smith"));
        p6.addEncounter(newEncounter(85, 126, 76, 98.2f, 99, "Jones"));
        Patient p10 = newPatient("120", newPerson("Rajath", "a10", 22, "Male", h3, null));
        // abnormal BP
        p10.addEncounter(newEncounter(70, 100, 90, 100.3f, 99, "Jones"));
        p10.addEncounter(newEncounter(68, 98, 95, 101.1f, 100, "Smith"));
        p10.addEncounter(newEncounter(66, 99, 101, 102.2f, 97, "Jones"));

        
    }
    
    private House newHouse(String address, Community comm) {
        House house = new House();
        house.setAddress(address);
        house.setCommunity(comm);
        return house;
    }
    
    
    private Person newPerson(String name, String id, int age, String sex, House house, Patient patient) {
        Person person = new Person();
        person.setName(name);
        person.setId(id);
        person.setAge(age);
        person.setSex(sex);
        person.setHouse(house);
        house.addPerson(person);
        person.setPatient(patient);
        personDirectory.addPerson(person);
        return person;
    }
    
    private Community newCommunity(String name, City city) {
        Community c = new Community();
        c.setName(name);
        c.setCity(city);
        return c;
    }
    
    public Patient newPatient(String id, Person person) {
        Patient p = new Patient();
        p.setId(id);
        p.setPerson(person);
        person.setPatient(p);
        patientDirectory.addPatient(p);
        return p;
    }
    
    private Encounter newEncounter(float dbp, float sbp, float heartRate, float temperature, float spo2, String doctor) {
        VitalSigns vt = new VitalSigns();
        vt.setSbp(sbp);
        vt.setDbp(dbp);
        vt.setHeartRate(heartRate);
        vt.setTemperature(temperature);
        vt.setSpo2(spo2);
        Encounter enc = new Encounter();
        enc.setDoctor(doctor);
        enc.setVitalSigns(vt);
        enc.setDate(new Date());
        return enc;
    }
    
    public void addCity(City city) {
        cityList.add(city);
    }
    
    public City getCity(String cityName) {
        cityName = cityName.trim().toLowerCase();
        for (City c: cityList) {
            if (c.getName().trim().toLowerCase().equals(cityName)) {
                return c;
            }
        }
        return null;
    }
    
    public Community getCommunity(String communityName) {
        for (City c: cityList) {
            Community com = c.getCommunity(communityName);
            if (com != null)
                return com;
        }
        return null;
    }
    
    private City newCity(String name, String state) {
        City c = new City();
        c.setName(name);
        c.setState(state);
        c.setSystem(this);
        return c;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public boolean setPatientDirectory(PatientDirectory patientDirectory) {
        if (patientDirectory == null)
            return false;
        this.patientDirectory = patientDirectory;
        return true;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public boolean setPersonDirectory(PersonDirectory personDirectory) {
        if (personDirectory == null)
            return false;
        this.personDirectory = personDirectory;
        return true;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public boolean setCityList(ArrayList<City> cityList) {
        if (cityList == null)
            return false;
        this.cityList = cityList;
        return true;
    }


}
