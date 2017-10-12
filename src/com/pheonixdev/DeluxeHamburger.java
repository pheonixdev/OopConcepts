package com.pheonixdev;

/**
 * Created by SAB on 10/12/2017.
 */
public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger() {
        super("Deluxe", "Sausage and Bacon", 32.50, "White");
        super.addHamburgerAddition1("Chips",2.57);
        super.addHamburgerAddition2("Coke",4.25);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add addtional items to a deluxe burger");
    }
}
