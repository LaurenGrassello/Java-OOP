import java.util.*;
public class CoffeeKiosk{
    private ArrayList<Item> menu = new ArrayList<Item>();;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public CoffeeKiosk(){
    }

    //methods

    //addMenuItem
    public void addMenuItem(String name, double price){
        Item newItem = new Item(name, price);
        menu.add(newItem);
        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    //displayMenu
    public void displayMenu(){
        for(Item item : this.menu){
            System.out.printf("%d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
    }

        public void newOrder() {
        System.out.println("Please enter customer name for new order: ");
        String name = System.console().readLine();

        Order newOrder = new Order(name);

        displayMenu();

        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        while(!itemNumber.equals("q")) {
            int itemIndex = Integer.parseInt(itemNumber);
            if(this.menu.size() > itemIndex){
                Item orderedItem = menu.get(itemIndex);
                newOrder.addItem(orderedItem);
                displayMenu();
            }else{
                System.out.println("Item not available.");
                displayMenu();
            }
                System.out.println("Please enter the index of the coffee you would like to order, or press q to exit");
                itemNumber = System.console().readLine();
        }
        newOrder.display();
        this.orders.add(newOrder);
        
    }

}