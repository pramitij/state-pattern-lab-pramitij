package edu.neu.csye7374;

public class LunchMenu implements MenuStateAPI{

    private final MenuStateAPI menu;
    public LunchMenu(MenuStateAPI currMenu){
        this.menu = currMenu;
    }

    @Override
    public void LunchMenu() {
        System.out.println("\nThis is the Lunch Menu! \n");
    }

    @Override
    public void BreakfastMenu() {
        System.out.println("\nBreakfast Menu is closed! \n");
    }

    @Override
    public void displayMenu() {
        System.out.println("Lunch Menu:");
        System.out.println("ITEM    PRICE    DESCRIPTION");
        System.out.println("1       $1.99    hot dog");
        System.out.println("2       $2.99    salad");
        System.out.println("3       $3.99    hamburger");
    }

    @Override
    public void DinnerMenu() {
        System.out.println("\nDinner Menu is closed! \n");
    }

}
