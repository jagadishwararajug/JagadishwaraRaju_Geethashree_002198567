package model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Uber {
    private Date lastUpdateTime;
    private List<Car> carList;
    
    public Uber() {
        carList = new ArrayList<Car>();
        lastUpdateTime = new Date();
    }
    
    public Uber(String file) {
        carList = readCarListFromFile(file);
        lastUpdateTime = new Date();
    } 
    
     private static String readFileAsString(String filePath) throws IOException{
      byte[] encoded = Files.readAllBytes(Paths.get(filePath));
      return new String(encoded, StandardCharsets.US_ASCII);
    }
    
    private static Car parseCar(String line) throws ParseException {
        String[] entries = line.trim().split(", ");
        
        for(int i = 0; i < entries.length; i++)
            entries[i] = entries[i].trim();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        
        Driver driver = new Driver(entries[2], entries[3], Integer.valueOf(entries[4]));
        MaintenanceCertificate cert = new MaintenanceCertificate(entries[11], 
                format.parse(entries[12]), format.parse(entries[13]));
        Car car = new Car(CarType.valueOf(entries[0]), Boolean.valueOf(entries[1].toLowerCase()), 
                driver, entries[5], Integer.valueOf(entries[6]), Integer.valueOf(entries[7]), 
                entries[8], entries[9], entries[10], cert);
                
        return car;
    }
    
    private static List<Car> readCarListFromFile(String filePath) {
        List<Car> carList = new ArrayList<>();
        try {
            String fileStr = readFileAsString(filePath);
            String[] lines = fileStr.split("\n");
           
            for(int i = 0; i < lines.length; i++) {
                carList.add(parseCar(lines[i]));
            }
        } catch (IOException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carList;
    }
    
    public void addCar(Car car) {
        Car ourCopy = new Car(car); // creating a new object so that the user 
                                    // can't edit the values later
        carList.add(ourCopy);
        lastUpdateTime = new Date();
    }
    
    public Car getCarAtIndex(int index) {
        Car ourCarObject = carList.get(index);
        Car theirCopy = new Car(ourCarObject);
        return theirCopy;
    }
    
    public int findIndexWithSerialNumber(String serialNumber) {
        for (int i = 0; i < carList.size(); i++)
            if (carList.get(i).getSerialNumber().equals(serialNumber))
                return i;
        return -1;
    }
    
    public boolean updateCar(int index, Car car) {
        if (index < 0) 
            return false;
        carList.set(index, car);
        lastUpdateTime = new Date();
        return true;
    }
    
    public Car findFirstAvailablePassengerCar() {
        for (Car c: carList) {
            if (c.getCarType() == CarType.PASSENGER) 
                return new Car(c); 
        }
        return null; // returns null if no passenger car is available
    }
    
    public List<Car> getAvailableCars() {
        List<Car> matchList = new ArrayList<>();
        
        for (Car c: carList) {
            if (c.isIsAvailable()) 
                matchList.add(c);
        }
        
        return matchList;
    }
    
    public List<Car> getUnavailableCars() {
        List<Car> matchList = new ArrayList<>();
        
        for (Car c: carList) {
            if (c.isIsAvailable() == false) 
                matchList.add(c);
        }
        
        return matchList;
    }
    
    public List<Car> getAllCars() {
        return new ArrayList(this.carList);
    }
    
    public boolean deleteCar(Car car) {
        return carList.remove(car);
    }
    
    public List<Car> getCarsFromManufacturer(String manufacturer) {
        List<Car> matchList = new ArrayList<>();
        
        for (Car c: carList) {
            if (c.getManufacturer().toLowerCase().equals(manufacturer.toLowerCase()))
                matchList.add(new Car(c));
        }
        return matchList;
    }
    
    public List<Car> getCarsFromYear(int year) {
        List<Car> matchList = new ArrayList<>();
        
        for (Car c: carList) {
            if (c.getManufactureYear() == year)
                matchList.add(new Car(c));
        }
        return matchList;
    }
    
    public List<Car> filterCarsBySeats(int minSeats, int maxSeats) {
        List<Car> matchList = new ArrayList<>();
        
        for (Car c: carList) {
            int numSeats = c.getNumSeats();
            if ( (numSeats >= minSeats) && (numSeats <= maxSeats) )
                matchList.add(new Car(c));
        }
        return matchList;
    }
    
    public Car findCarBySerialNumber(String serialNumber) {
        for (Car c: carList) {
            if ( c.getSerialNumber().equals(serialNumber) )
                return new Car(c);
        }
        return null;
    }
    
    public List<Car> filterCarsByModelNumber(String modelNumber) {
        List<Car> matchList = new ArrayList<>();
        
        for (Car c: carList) {
            if ( c.getModelNumber().equals(modelNumber) )
                matchList.add(new Car(c));
        }
        return matchList;
    }
    
    public List<String> getAllManufacturers() {
        List<String> allManus = new ArrayList<String>();
        
        for (Car c: carList) {
            String curManu = c.getManufacturer();
            if (allManus.contains(curManu) == false)
                allManus.add(curManu);
        }
        return allManus;
    }
    
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }
    
    public List<Car> filterCarsByCity(String city) {
        List<Car> matchList = new ArrayList<>();
        
        for (Car c: carList) {
            if ( c.getCity().toLowerCase().equals(city.toLowerCase()) )
                matchList.add(new Car(c));
        }
        return matchList;
    }
    
    public List<Car> getCarsWithExpiredManitanenceCerts() {
        List<Car> matchList = new ArrayList<>();
        Date curTime = new Date();
        for (Car c: carList) {
            if ( c.getMaintenanceCertificate().getValidTill().before(curTime) )
                matchList.add(new Car(c));
        }
        return matchList;
    }
    
}