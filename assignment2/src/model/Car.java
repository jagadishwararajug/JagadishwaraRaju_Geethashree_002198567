package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Car {
    private CarType carType;
    private boolean isAvailable;
    private Driver driver;
    private String manufacturer;
    private int manufactureYear;
    private int numSeats;
    private String serialNumber;
    private String modelNumber;
    private String city;
    private MaintenanceCertificate maintenanceCertificate;

    public CarType getCarType() {
        return carType;
    }

    public boolean setCarType(CarType carType) {
        if (carType == null)
            return false;
        this.carType = carType;
        return true;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public boolean setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return true;
    }

    public Driver getDriver() {
        return driver;
    }

    public boolean setDriver(Driver driver) {
        if (driver == null)
            return false;
        this.driver = driver;
        return true;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean setManufacturer(String manufacturer) {
        if ((manufacturer == null) || (manufacturer.trim().equals("")))
            return false;
        this.manufacturer = manufacturer;
        return true;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public boolean setManufactureYear(int manufactureYear) {
        if ((manufactureYear < 1886) || (manufactureYear > 2021)) // 1886 is when cars were invented
            return false;
        this.manufactureYear = manufactureYear;
        return true;
    }
    
    public boolean setManufactureYear(String manufactureYear) {
        if (manufactureYear == null) 
            return false;
        try {
            return this.setManufactureYear(Integer.parseInt(manufactureYear));
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public int getNumSeats() {
        return numSeats;
    }

    public boolean setNumSeats(int numSeats) {
        if ((numSeats <= 0) || (numSeats >= 100) )
            return false;
        this.numSeats = numSeats;
        return true;
    }
    
    public boolean setNumSeats(String numSeats) {
        if (numSeats == null )
            return false;
        try {
            return this.setNumSeats(Integer.parseInt(numSeats));
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean setSerialNumber(String serialNumber) {
        if (serialNumber == null || serialNumber.trim().equals(""))
            return false;
        this.serialNumber = serialNumber;
        return true;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public boolean setModelNumber(String modelNumber) {
        if ((modelNumber == null) || (modelNumber.trim().equals("")) )
            return false;
        this.modelNumber = modelNumber;
        return true;
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) {
        if ((city == null) || (city.trim().equals("")) )
            return false;
        this.city = city;
        return true;
    }

    public MaintenanceCertificate getMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public boolean setMaintenanceCertificate(MaintenanceCertificate maintenanceCertificate) {
        if (maintenanceCertificate == null)
            return false;
        this.maintenanceCertificate = maintenanceCertificate;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.carType);
        hash = 71 * hash + (this.isAvailable ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.driver);
        hash = 71 * hash + Objects.hashCode(this.manufacturer);
        hash = 71 * hash + this.manufactureYear;
        hash = 71 * hash + this.numSeats;
        hash = 71 * hash + Objects.hashCode(this.serialNumber);
        hash = 71 * hash + Objects.hashCode(this.modelNumber);
        hash = 71 * hash + Objects.hashCode(this.city);
        hash = 71 * hash + Objects.hashCode(this.maintenanceCertificate);
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
        final Car other = (Car) obj;
        if (this.isAvailable != other.isAvailable) {
            return false;
        }
        if (this.manufactureYear != other.manufactureYear) {
            return false;
        }
        if (this.numSeats != other.numSeats) {
            return false;
        }
        if (!Objects.equals(this.manufacturer, other.manufacturer)) {
            return false;
        }
        if (!Objects.equals(this.serialNumber, other.serialNumber)) {
            return false;
        }
        if (!Objects.equals(this.modelNumber, other.modelNumber)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (this.carType != other.carType) {
            return false;
        }
        if (!Objects.equals(this.driver, other.driver)) {
            return false;
        }
        if (!Objects.equals(this.maintenanceCertificate, other.maintenanceCertificate)) {
            return false;
        }
        return true;
    }

    public Car(Car car) {
        this.carType = car.carType;
        this.isAvailable = car.isAvailable;
        this.driver = car.driver;
        this.manufacturer = car.manufacturer;
        this.manufactureYear = car.manufactureYear;
        this.numSeats = car.numSeats;
        this.serialNumber = car.serialNumber;
        this.modelNumber = car.modelNumber;
        this.city = car.city;
        this.maintenanceCertificate = car.maintenanceCertificate;
    }

    public Car(CarType carType, boolean isAvailable, Driver driver, String manufacturer, 
            int manufactureYear, int numSeats, String serialNumber, String modelNumber, 
            String city, MaintenanceCertificate maintenanceCertificate) {
        this.carType = carType;
        this.isAvailable = isAvailable;
        this.driver = driver;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.numSeats = numSeats;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.city = city;
        this.maintenanceCertificate = maintenanceCertificate;
    }
    
    public Car() {
    }

    @Override
    public String toString() {
        return manufacturer;
    }
    
   
}