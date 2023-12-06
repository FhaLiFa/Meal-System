package classes;
import interfaces.*;

import java.lang.*;

public class Burger extends Food {
    protected int numberOfPatty;

    public Burger(){}
    public Burger(String Name, String[] ingredients, int numberOfPatty, double price, float calories){
        super(Name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setNumberOfPatty(int numberOfPatty) {
        this.numberOfPatty = numberOfPatty;
    }

    public int getNumberOfPatty() {
        return numberOfPatty;
    }

    public void showDetails(){
        System.out.println("Name : "+ Name+".");
        if(numberOfPatty>1){
            System.out.println("Number of patty : "+ numberOfPatty+" patties.");
        }
        else{
            System.out.println("Number of patty : "+ numberOfPatty+" patty.");
        }
        System.out.println("Price : "+ price+"$.");
        if(calories>1.0F){
            System.out.println("Calories : "+ calories+" calories.");
        }
        else{
            System.out.println("Calories : "+ calories+" calorie.");
        }
        for (int i=0; i<ingredients.length; i++){
            if(ingredients[i] != null)
                System.out.println("Ingredient "+ i +" is "+ ingredients[i]+".");
        }
    }
}
