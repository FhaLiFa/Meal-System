import java.lang.*;

import classes.*;
import interfaces.*;

public class Start {
    public static void main(String[] args) {
        String[] ingredients = new String[5];

        ingredients[0] = "Carbohydrate";
        ingredients[1] = "Protein";
        ingredients[2] = "Fat";
        ingredients[3] = "Vitamins";
        ingredients[4] = "Minerals";

        Food f1 = new Drinks("Lassi", "Dairy drink", 2, ingredients, 250.00, 9712397.00F);
        Food f2 = new Pizza("Hawaiiean Deluxe Pizza", ingredients, 15, 1800.00, 1927318.00F);
        Food f3 = new Burger("Dhaka Special Burger", ingredients, 3, 677.99, 1231231.00F);

        Drinks Soft_Drinks = new Drinks();
        Drinks Lemonade = new Drinks();
        Drinks Beers = new Drinks("Kingfisher","Alcohol",1, ingredients, 850.50, 6000000.00F);
        Drinks Lassi = new Drinks();
        Drinks Coffee = new Drinks();

        Burger Regular_Chicken_Burger = new Burger();
        Burger Regular_Beef_Burger = new Burger();
        Burger BBQ_Chicken_Burger = new Burger();
        Burger Cheese_Special_Beef_Burger = new Burger();
        Burger Mutton_Burger = new Burger();

        Pizza Regular_Chicken_Pizza = new Pizza();
        Pizza Regular_Beef_Pizza = new Pizza();
        Pizza Mexican_Hot_Pizza = new Pizza();
        Pizza Cheese_Margherita = new Pizza();
        Pizza BBQ_Hot_Pizza = new Pizza();

        Restaurant r1 = new Restaurant();

        Soft_Drinks.setName("Cocacola");
        Soft_Drinks.setType("Soda");
        Soft_Drinks.setSizeInLitre(1);
        Soft_Drinks.setIngredients(ingredients);
        Soft_Drinks.removeIngredients("Vitamins");
        Soft_Drinks.addIngredients("Suger");
        Soft_Drinks.setPrice(500.00);
        Soft_Drinks.setCalories(50000.00F);
        Soft_Drinks.showDetails();

        Mutton_Burger.setName("Chatgaiya Special Mutton Burger");
        Mutton_Burger.setIngredients(ingredients);
        Mutton_Burger.setNumberOfPatty(2);
        Mutton_Burger.setPrice(450.00);
        Mutton_Burger.setCalories(7000000.00F);
        Mutton_Burger.removeIngredients("Vitamins");
        Mutton_Burger.addIngredients("Fibre");
        Mutton_Burger.showDetails();

        BBQ_Hot_Pizza.setName("Smokey BBQ Chicken Pizza");
        BBQ_Hot_Pizza.setIngredients(ingredients);
        BBQ_Hot_Pizza.setSizeInInches(12);
        BBQ_Hot_Pizza.setPrice(1800.00);
        BBQ_Hot_Pizza.setCalories(60282726.00F);
        BBQ_Hot_Pizza.removeIngredients("Minerals");
        BBQ_Hot_Pizza.addIngredients("Fibre");
        BBQ_Hot_Pizza.showDetails();

        r1.addDrink(Soft_Drinks);
        r1.addDrink(Beers);
        r1.showDrink();
        r1.removeDrink(Beers);
        r1.showDrink();
        r1.calculateDrinksBill(10);
        r1.addToOrder(f1);
        f1.removeIngredients("Protein");
        f1.showDetails();
        r1.addToOrder(f2);
        f2.addIngredients("Protein");
        f2.removeIngredients("Minerals");
        f2.showDetails();
        r1.addToOrder(f3);
        f3.addIngredients("Minerals");
        f3.showDetails();
        r1.showOrder();
        r1.calculateOrderBill();
    }
}
