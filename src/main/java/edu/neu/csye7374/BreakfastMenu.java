package edu.neu.csye7374;

public class BreakfastMenu implements MenuStateAPI {

    private final MenuStateAPI menu;

    public BreakfastMenu(MenuStateAPI currMenu){
        this.menu = currMenu;
    }

    @Override
    public void LunchMenu() {
        System.out.println("\nLunch Menu is Closed! \n");
    }

    @Override
    public void BreakfastMenu() {
        System.out.println("\nThis is the Breakfast Menu! \n");
    }

    @Override
    public void displayMenu() {
        System.out.println("Breakfast Menu:");
        System.out.println("ITEM    PRICE    DESCRIPTION");
        System.out.println("1       $2.99    oatmeal");
        System.out.println("2       $3.99    pancakes");
        System.out.println("3       $4.99    omelette");
    }

    @Override
    public void DinnerMenu() {
        System.out.println("\nDinner Menu is Closed! \n");
    }
}
