package edu.neu.csye7374;

public class Restaurant {

    public static void Demo(){
        Menu menu = new Menu();
        //Displaying breakfast menu
        menu.BreakfastMenu();
        menu.displayMenu();

        //Displaying lunch menu
        menu.LunchMenu();
        menu.displayMenu();

        //Displaying dinner menu
        menu.DinnerMenu();
        menu.displayMenu();

    }
}
