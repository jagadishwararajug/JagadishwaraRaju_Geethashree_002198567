package Business.Restaurant;

public class MenuItemOrder {
    private MenuItem menuItem;
    private int quantity;
    private String comments;

    public String getComments() {
        return comments;
    }

    public boolean setComments(String comments) {
        if (comments == null || comments.trim().equals(""))
            return false;
        this.comments = comments;
        return true;
    }
    
    public MenuItem getMenuItem() {
        return menuItem;
    }

    public boolean setMenuItem(MenuItem menuItem) {
        if (menuItem == null)
            return false;
        this.menuItem = menuItem;
        return true;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(String quantity) {
        if (quantity == null)
            return false;
        try {
            return setQuantity(Integer.valueOf(quantity));
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean setQuantity(int quantity) {
        if (quantity <= 0)
            return false;
        this.quantity = quantity;
        return true;
    }
}