import java.util.*;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Mocha", 3.5);

        Item item2 = new Item("Latte", 3.75);

        Item item3 = new Item("Cappucino", 4.25);

        Item item4 = new Item("Drip Coffee", 3.5);
        
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();

        Order order2 = new Order();

        Order order3 = new Order("Cindhuri");

        Order order4 = new Order("Sam");
        
        Order order5 = new Order("Jimmy");


        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item2);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item1);
        order5.addItem(item4);
        order5.addItem(item1);

        System.out.println(order3.getStatusMessage());

        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        System.out.println(order4.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();



    }
}