package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaintenanceCertificate {
    private String certificate;
    private Date validFrom, validTill;
    private DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);

    public MaintenanceCertificate(String certificate, Date validFrom, Date validTill) {
        this.certificate = certificate;
        this.validFrom = validFrom;
        this.validTill = validTill;
    }
    
    public DateFormat getDateFormat() {
        return this.format;
    }
    
    @Override
    public String toString() {
        return "MaintenanceCertificate{" + "certificate=" + certificate + ", validFrom=" + validFrom + ", validTill=" + validTill + '}';
    }

    public MaintenanceCertificate() {
    }
    
    public String getCertificate() {
        return certificate;
    }

    public boolean setCertificate(String certificate) {
        if ((certificate == null) || (certificate.trim().equals("")))
            return false;
        this.certificate = certificate;
        return true;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public boolean setValidFrom(Date validFrom) {
        if (validFrom == null)
            return false;
        this.validFrom = validFrom;
        return true;
    }
    
    public boolean setValidFromStr(String validFrom) {
        if (validFrom == null)
                return false;
        try {    
            this.validFrom = format.parse(validFrom);
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(MaintenanceCertificate.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Date getValidTill() {
        return validTill;
    }

    public boolean setValidTill(Date validTill) {
        if (validTill == null)
            return false;
        this.validTill = validTill;
        return true;
    }
    
    public boolean setValidTillStr(String validTill) {
        if (validTill == null)
                return false;
        try {    
            this.validTill = format.parse(validTill);
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(MaintenanceCertificate.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.certificate);
        hash = 23 * hash + Objects.hashCode(this.validFrom);
        hash = 23 * hash + Objects.hashCode(this.validTill);
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
        final MaintenanceCertificate other = (MaintenanceCertificate) obj;
        if (!Objects.equals(this.certificate, other.certificate)) {
            return false;
        }
        if (!Objects.equals(this.validFrom, other.validFrom)) {
            return false;
        }
        if (!Objects.equals(this.validTill, other.validTill)) {
            return false;
        }
        return true;
    }
    
    
}