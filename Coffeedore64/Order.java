import java.util.*;
public class Order{
    private String name;
    private double price;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();;

    //constructor and overloaded constructor
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    //methods

    //addItem
    public void addItem(Item item){
        this.items.add(item);
    }

    public double getOrderTotal(){
        double total = 0;
        for(Item item : this.items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer name: %s ", this.name);
        for(Item item : this.items){
        System.out.printf(" Item: %s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Order total: $%.2f\n", this.getOrderTotal());
    }


    //getters
    public String getName(){
        return this.name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}