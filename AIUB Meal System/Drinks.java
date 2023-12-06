package classes;
import interfaces.*;

import java.lang.*;

public class Drinks extends Food {
    protected String Type;
    protected int sizeInLitre;

    public Drinks(){}
    public Drinks(String Name, String Type, int sizeInLitre, String[] ingredients, double price, float calories){
        super(Name, ingredients, price, calories);
        this.Type = Type;
        this.sizeInLitre = sizeInLitre;
    }

    public void setType(String Type){
        this.Type = Type;
    }
    public void setSizeInLitre(int sizeInLitre) {
        this.sizeInLitre = sizeInLitre;
    }

    public String getType(){
        return Type;
    }
    public int getSizeInLitre() {
        return sizeInLitre;
    }

    public void showDetails(){
        System.out.println("Name : "+ Name+".");
        System.out.println("Type : "+ Type+".");
        if(sizeInLitre>1){
            System.out.println("Size : "+ sizeInLitre+" Litres.");
        }
        else
            System.out.println("Size : "+ sizeInLitre+ " Litre.");
        System.out.println("Price : "+ price+"$.");
        if(calories>1.0F){
            System.out.println("Calories : "+ calories+" calories.");
        }
        else{
            System.out.println("Calories : "+ calories+" calorie.");
        }
        for (int i=0; i<ingredients.length; i++){
            if (ingredients[i]!=null)
                System.out.println("Ingredients "+ i + " is " + this.ingredients[i]+".");
        }
    }


}

