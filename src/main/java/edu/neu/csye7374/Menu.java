package edu.neu.csye7374;

public class Menu implements MenuStateAPI{

    private MenuStateAPI currentMenu;
    private MenuStateAPI breakfastMenu;
    private MenuStateAPI lunchMenu;
    private MenuStateAPI dinnerMenu;

    public Menu(){
        this.breakfastMenu = new BreakfastMenu(this);
        this.lunchMenu = new LunchMenu(this);
        this.dinnerMenu = new DinnerMenu(this);
        this.currentMenu = this.breakfastMenu;
    }

    public void setState(MenuStateAPI state) {
        currentMenu = state;
    }

    @Override
    public void LunchMenu() {
        setState(lunchMenu);
    }

    @Override
    public void BreakfastMenu() {
        setState(breakfastMenu);
    }

    @Override
    public void DinnerMenu() {
        setState(dinnerMenu);
    }

    @Override
    public void displayMenu() {
        currentMenu.displayMenu();
    }
}

