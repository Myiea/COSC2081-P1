package tutorial4;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantSystem {

    public static void main(String args[]){

        // E1 && E2
        /*
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ingredient> ingredientsList = new ArrayList<Ingredient>();

        int exit = 0;
        while (exit != 1){
            System.out.println("Enter the ingredient name: ");
            String name = scanner.next();
            System.out.println("Enter the ingredient measurement unit: ");
            String unit = scanner.next();
            Ingredient ingredient = new Ingredient(name, unit);
            ingredientsList.add(ingredient);

            System.out.println("If you finish, please press 1, if not 0");
            exit = scanner.nextInt();
        }
        displayIngredient(ingredientsList); */

        // E3
        Ingredients i = new Ingredients();
        System.out.println(i);
        if (i.setMeasurementUnit("Invalid")){
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }
        System.out.println(i);
        if (i.setMeasurementUnit("ml")){
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }
        System.out.println(i);

        // E4
        Recipe r1 = new Recipe("first", 3);
        for (int j = 0; j < 3; j++){
            r1.addComponent(j);
        }
        r1.display();
    }

    public static void displayIngredient(ArrayList<Ingredients> list){
        for (Ingredients ingredient: list){
            System.out.println(ingredient);
        }
    }
}
