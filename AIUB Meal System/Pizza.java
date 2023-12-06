package classes;
import interfaces.*;

import java.lang.*;

public class Pizza extends Food{
    protected int sizeInInches;

    public Pizza(){}
    public Pizza(String Name, String[] ingredients, int sizeInInches, double price, float calories){
        super(Name, ingredients, price, calories);
        this.sizeInInches = sizeInInches;
    }

    public void setSizeInInches(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    public void showDetails(){
        System.out.println("Name : "+ Name+".");
        if(sizeInInches>1){
            System.out.println("Size in inches : "+sizeInInches+" inches.");
        }
        else{
            System.out.println("Size in inches : "+sizeInInches+" inch.");
        }
        System.out.println("Price : "+ price+"$.");
        if(calories>1.0F){
            System.out.println("Calories : "+ calories+" calories.");
        }
        else{
            System.out.println("Calories : "+ calories+" calorie.");
        }
        for(int i=0; i<ingredients.length; i++){
            if (ingredients[i]!=null)
                System.out.println("Ingredients "+ i + " is " + this.ingredients[i]+".");
        }
    }
}
