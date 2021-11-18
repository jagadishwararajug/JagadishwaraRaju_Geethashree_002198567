package Business.DeliveryMan;

import Business.Employee.Employee;
import Business.Util.Util;


public class DeliveryMan extends Employee{
    private String driversLicense, vehicleNumber;

    public String getDriversLicense() {
        return driversLicense;
    }

    public boolean setDriversLicense(String driversLicense) {
        if (Util.strValidate(driversLicense, "[A-Za-z0-9]+") == false)
            return false;
        this.driversLicense = driversLicense;
        return true;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public boolean setVehicleNumber(String vehicleNumber) {
        if (Util.strValidate(vehicleNumber, "[A-Za-z0-9]+") == false)
            return false;
        this.vehicleNumber = vehicleNumber;
        return true;
    }
    
    
}
