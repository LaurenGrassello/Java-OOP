import java.util.*;
public class Item{
    private String name;
    private double price;
    private int index;
    
    //constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getIndex(){
        return this.index;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIndex(int index){
        this.index = index;
    }




}