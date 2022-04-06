import java.util.*;
public class TestOrders {
    public static void main(String[] args) {
    CoffeeKiosk kiosk = new CoffeeKiosk();

    //add items
    kiosk.addMenuItem("Coffee", 2.25);
    kiosk.addMenuItem("Latte", 4.5);
    kiosk.addMenuItem("Banana", 2);
    kiosk.addMenuItem("Muffin", 4);
    kiosk.newOrder();
    }
}