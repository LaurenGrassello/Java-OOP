import java.util.*;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 3.75;

        Item item3 = new Item();
        item3.name = "Cappucino";
        item3.price = 4.25;

        Item item4 = new Item();
        item4.name = "Drip Coffee";
        item4.price = 3.5;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";


        // Application Simulations
        System.out.println(order1);


        //add item1 to order2 item list and ++
        order2.items.add(item1);
        order2.price += item1.price;
        System.out.printf("%s total is %.2f\n", order2.name, order2.price);

        order3.items.add(item3);
        order3.price += item3.price;
        System.out.printf("%s ordered a %s and their total is %.2f\n", order3.name, item3.name, order3.price);

        order4.items.add(item2);
        order4.price += item2.price;
        System.out.printf("%s ordered a %s and their total is %.2f\n", order4.name, item2.name, order4.price);


        order1.ready = true;
        System.out.printf("Is %s's order ready? It is " + order1.ready , order1.name);


        order4.items.add(item2);
        order4.price += item2.price*2;
        System.out.printf("%s ordered a %s and their total is %.2f\n", order4.name, item2.name, order4.price);


        order2.ready = true;
        System.out.printf("Is %s's order ready? It is " + order2.ready , order2.name);




        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}