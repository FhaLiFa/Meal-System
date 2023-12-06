package classes;
import interfaces.*;

import java.lang.*;

public class Restaurant implements RestaurantOperation{
    protected String restaurantName;
    Food[] food = new Food[100];
    Drinks[] drinks = new Drinks[100];
    Burger[] burgers = new Burger[100];
    Pizza[] pizzas = new Pizza[100];

    public Restaurant(){}
    public Restaurant(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void addDrink(Drinks d){
        for(int i=0; i<drinks.length; i++){
            if(drinks[i]==null){
                drinks[i] = d;
                break;
            }
            System.out.println("");
        }
    }
    public void removeDrink(Drinks d){
        for(int i=0; i<drinks.length; i++){
            if(drinks[i]==d)
                drinks[i]=null;
        }
        System.out.println("Removing "+d.getName());
    }
    public void showDrink(){
        for(int i=0; i< drinks.length; i++){
            if(drinks[i]!=null)
            System.out.println("Drink "+ i +" is "+ drinks[i].getName());
        }
    }
    public double calculateDrinksBill(int amountOfDrinks){
        double price = 0.0;
        for(int i=0; i< drinks.length; i++){
            if(drinks[i]!= null)
              price = amountOfDrinks * drinks[i].getPrice();
        }
        System.out.println("Bill of drinks : "+ price+"$");
        return price;
    }

    public void addBurger(Burger b){
        for(int i=0; i<burgers.length; i++){
            if(burgers[i]==null){
                burgers[i] = b;
            break;
            }
        }
    }
    public void removeBurger(Burger b){
        for(int i=0; i<burgers.length; i++){
            if(burgers[i]==b)
                burgers[i]=null;
        }
    }
    public void showBurger(){
        for(int i=0; i<burgers.length; i++){
            if(burgers[i]!= null)
                System.out.println("Burger "+ i + " is "+ burgers[i].getName());
        }
    }
    public double calculateBurgerBill(int amountOfBurger){
        double price = 0.0;
        for(int i=0; i<burgers.length; i++){
            if(burgers[i]!=null)
                price = amountOfBurger * burgers[i].getPrice();
        }
        System.out.println("Bill of burgers : "+ price+"$");
        return price;
    }

    public void addPizzas(Pizza p){
        for(int i=0; i<pizzas.length; i++){
            if(pizzas[i]==null)
                pizzas[i]=p;
        }
    }
    public void removePizza(Pizza p){
        for(int i=0; i<pizzas.length; i++){
            if(pizzas[i]==p)
                pizzas[i]=null;
        }
    }
    public void showPizza(){
        for(int i=0; i<pizzas.length; i++){
            if(pizzas[i]!=null)
                System.out.println("Pizza "+ i +" is "+ pizzas[i].getName());
        }
    }
    public double calculatePizzaBill(int amountOfPizza){
        double price = 0.0;
        for(int i=0; i<pizzas.length; i++){
            if(pizzas[i]!=null)
                price = amountOfPizza * pizzas[i].getPrice();
        }
        System.out.println("Bill of pizzas : "+price+"$");
        return price;
    }

    public void addToOrder(Food f){
        boolean select = false;
        for(int i=0; i< food.length; i++){
            if(food[i]==null){
                food[i] = f;
                select = true;
                break;
            }
        }
        if(select==true){
            System.out.println(f.getName()+" is added.");
        }
        else{
            System.out.println("Can't add, ERROR!");
        }
    }
    public void removeFromOrder(Food f){
        boolean select = false;
        for(int i=0; i< food.length; i++){
            if(food[i]==f){
                food[i] = null;
                select = true;
                break;
            }
        }
        if(select==true){
            System.out.println(f.getName()+" is removed.");
        }
        else{
            System.out.println("Can't remove.");
        }
    }
    public void showOrder(){
        for(Food f : food){
            if(f != null){
                System.out.println("Ordered Food name : "+f.getName());
                System.out.println("            Price : "+f.getPrice()+"$");
            }
        }
    }

    public double calculateOrderBill(){
        double price = 0.0;
        double priceWithVAT = 0.0;
        for(Food f : food){
            if(f != null){
                price += f.getPrice();
            }
        }
        System.out.println("Total Bill : "+price+"$.");
        priceWithVAT = price + (price * 0.15);
        System.out.println("Total Bill including 15% VAT : "+String.format("%.2f",priceWithVAT)+"$");
        return price;
    }
}
