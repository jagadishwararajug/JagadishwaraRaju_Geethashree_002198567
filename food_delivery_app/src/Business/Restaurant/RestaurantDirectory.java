package Business.Restaurant;

import Business.Employee.Employee;
import java.util.ArrayList;


public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;
    
    public RestaurantDirectory() {
        restaurantList = new ArrayList<Restaurant>();
    }
    
    public boolean addRestaurant(Restaurant res) {
        if (res == null)
            return false;
        return restaurantList.add(res);
    }
    
    public boolean removeRestaurant(Restaurant res) {
        if (res == null)
            return false;
        return restaurantList.remove(res);
    }
    
    public boolean updateRestaurant(int idx, Restaurant res) {
        if ((res == null) || (idx < 0))
            return false;
        restaurantList.set(idx, res);
        return true;
    }
    
    public Restaurant findRestaurantManagedBy(Employee emp) {
        for(Restaurant res: restaurantList) {
            if (res.getManager().equals(emp))
                return res;
        }
        return null;
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    
}
