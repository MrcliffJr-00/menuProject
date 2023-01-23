import java.awt.*;
import java.util.ArrayList;

public class Main1 {
    public static ArrayList<MenuItem> initializeMenu() {
        ArrayList<MenuItem> foodList = new ArrayList<>();
        MenuItem drinkItem1 = new MenuItem();
        foodList.add(drinkItem1);

        MenuItem drinkItem2 = new MenuItem();
        foodList.add(drinkItem2);

        MenuItem drinkItem3 = new MenuItem();
        foodList.add(drinkItem3);

        MenuItem drinkItem4 = new MenuItem();
        foodList.add(drinkItem4);

        MenuItem drinkItem5 = new MenuItem();
        foodList.add(drinkItem5);
        return foodList;
    }


    public static void main(String[] args) {


        System.out.println("Welcome to CJ's kitchen. what would you like to order?");

        //user puts order in

        //Excellent your total is....
        System.out.println("Excellent your total is");
        //sorry but this item is not on our menu. Take a look at the menu and chose something from there

        //final output message Thank you for dinning at CJ's resturant. Come again!
        System.out.println("Thank you for dinning at CJ's resturant. Come again!");
    }
}