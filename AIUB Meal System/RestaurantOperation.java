package interfaces;
import classes.*;

public interface RestaurantOperation {
    public void addToOrder(Food f);
    public void removeFromOrder(Food f);
    public void showOrder();
    public double calculateOrderBill();
}
