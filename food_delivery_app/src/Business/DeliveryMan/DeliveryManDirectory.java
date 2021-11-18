package Business.DeliveryMan;

import java.util.ArrayList;

public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
    
    public boolean addDeliveryMan(DeliveryMan emp) {
        if (emp == null) 
            return false;
        return deliveryManList.add(emp);
    }
    
    public boolean updateDeliveryMan(int idx, DeliveryMan emp) {
        if ((emp == null) || (idx < 0)) 
            return false;
        deliveryManList.set(idx, emp);
        return true;
    }
    
    public boolean removeDeliveryMan(DeliveryMan emp) {
        if (emp == null) 
            return false;
        return deliveryManList.remove(emp);
    }
}
