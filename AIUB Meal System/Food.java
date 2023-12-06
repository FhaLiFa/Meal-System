package classes;
import interfaces.*;

import java.lang.*;

public abstract class Food implements FoodOperation {

    protected String Name;
    protected String ingredients[];
    protected double price;
    protected float calories;
    protected int abc;

    Food(){}
    Food(String Name, String[] ingredients, double price, float calories){
        this.Name = Name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setIngredients(String[] ingredients){
        this.ingredients = ingredients;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCalories(float calories){
        this.calories = calories;
    }

    public String getName() {
        return Name;
    }
    public String[] getIngredients() {
        return ingredients;
    }
    public double getPrice() {
        return price;
    }
    public float getCalories() {
        return calories;
    }

    public void removeIngredients(String ingredient){
        for(int i=0; i<ingredients.length; i++){
            if(ingredients[i]==ingredient){
                ingredients[i] = null;
            }
        }
    }

    public void addIngredients(String ingredient){
        for(int i=0; i<ingredients.length; i++){
            if (ingredients[i]==null) {
                ingredients[i] = ingredient;
            }
        }
    }

    public abstract void showDetails();

}
