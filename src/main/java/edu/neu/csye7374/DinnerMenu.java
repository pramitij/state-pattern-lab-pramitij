package edu.neu.csye7374;

class DinnerMenu implements MenuStateAPI {

    private final MenuStateAPI menu;

    public DinnerMenu(MenuStateAPI currMenu){
        this.menu = currMenu;
    }
    @Override
    public void LunchMenu() {
        System.out.println("\nLunch Menu is Closed! \n");
    }

    @Override
    public void BreakfastMenu() {
        System.out.println("\nBreakfast Menu is Closed! \n");
    }

    @Override
    public void displayMenu() {
        System.out.println("Dinner Menu:");
        System.out.println("ITEM    PRICE    DESCRIPTION");
        System.out.println("1       $11.99   soup");
        System.out.println("2       $12.99   salad");
        System.out.println("3       $13.99   steak");
        System.out.println("OPTIONAL");
        System.out.println("4       $14.99   salmon");
        System.out.println("5       $15.99   chicken");
    }

    @Override
    public void DinnerMenu() {
        System.out.println("\nThis is the Dinner Menu! \n");
    }
}

