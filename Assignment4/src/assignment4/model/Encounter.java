package assignment4.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Encounter {
    private VitalSigns vitalSigns;
    private String doctor;
    private Date date;
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private DateFormat formatter = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
    
    public Encounter() {
        date = new Date();
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Encounter other = (Encounter) obj;
        if (!Objects.equals(this.doctor, other.doctor)) {
            return false;
        }
        if (!Objects.equals(this.vitalSigns, other.vitalSigns)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    public String toString() {
        return this.getDate();
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public boolean setVitalSigns(VitalSigns vitalSigns) {
        if (vitalSigns == null)
            return false;
        this.vitalSigns = vitalSigns;
        return true;
    }

    public String getDoctor() {
        return doctor;
    }

    public boolean setDoctor(String doctor) {
        if (doctor == null || doctor.trim().equals(""))
            return false;
        this.doctor = doctor;
        return true;
    }
    
    public boolean setDate(Date date) {
        if (date == null)
            return false;
        this.date = date;
        return true;
    }
    
    public boolean setDate(String date) {
        if (date == null || date.trim().equals(""))
            return false;
        
        try {    
            this.date = formatter.parse(date);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
    
    public String getDate() {
        return formatter.format(date);
    }
}