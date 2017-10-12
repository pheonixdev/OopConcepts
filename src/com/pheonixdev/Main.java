package com.pheonixdev;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic","Sausage", 23.42,"roller");
        hamburger.addHamburgerAddition1("Tomato",4.2);
        hamburger.addHamburgerAddition2("Lettuce",4.6);
        hamburger.addHamburgerAddition3("Cheese",6.4);
        hamburger.addHamburgerAddition4("Pepperoni",2.2);
        System.out.println("Total burger price is " +hamburger.itemizeHamburger()+ "\n");

        HealthyHamburger healthyHamburger = new HealthyHamburger("Sausage",25.50);
        healthyHamburger.addHealthAddition1("Egg",2.00);
        healthyHamburger.addHealthAddition2("Potato", 1.80);
        System.out.println("Total burger price is " +healthyHamburger.itemizeHamburger()+ "\n");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addHamburgerAddition1("Tapioca",4.44);
        System.out.println("Total burger price is " +deluxeHamburger.itemizeHamburger()+ "\n");
    }
}
