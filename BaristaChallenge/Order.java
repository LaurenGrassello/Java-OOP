import java.util.*;
class Order{
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

     //constructor
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    //overloaded const
    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    //additem
    public void addItem(Item item){
        this.items.add(item);
    }

    //getstatusmsg
    public String getStatusMessage(){
        if (this.ready == true){
            return "Your order is ready!";
        }else{
            return "Thank you for waiting. Your order will be ready soon!";
        }
    }

    //getordertotal
    public double getOrderTotal(){
        double total = 0;
        for(Item item: this.items){
            total += item.getPrice();
        }
        return total;
    }

    //display
    public void display(){
        System.out.printf("Customer name: %s ", this.name);

        for(Item item: this.items)
        {
        System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n\n", this.getOrderTotal());
    }

    //getters
    public String getName(){
    return this.name;
    }

    public ArrayList<Item> getItem(){
        return items;
    }

    public boolean isReady(){
        return this.ready;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }
}
