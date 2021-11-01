package assignment4.model;

import java.util.ArrayList;

public class PatientDirectory {
    private ArrayList<Patient> patients;

    public PatientDirectory() {
        patients = new ArrayList<>();
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public boolean setPatients(ArrayList<Patient> patients) {
        if (patients == null)
            return false;
        this.patients = patients;
        return true;
    }

    public boolean addPatient(Patient pt) {
        if (pt == null)
            return false;
        return patients.add(pt);
    }
    
    public void updatePatient(int index, Patient patient) {
        patients.set(index, patient);
    }
    
    public boolean removePatient(Patient patient) {
        return patients.remove(patient);
    }
    
    public boolean findId(String id) {
        
        for (Patient p: patients) {
            if (p.getId().equals(id.trim())) 
                return true;
        }
        
        return false;
    }
}
