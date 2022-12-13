package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // deluxe pizza has extra cheese and toppings by default
        this.addExtraCheese();
        this.addExtraToppings();

        // we can call super.addExtraCheese() also as this class is inherited
        // it doesn't have its own methods of adding cheese, toppings,...
        // but in future if we want to add some methods of its own
        // then super keyword won't be used as it is calling parent everytime
        // irrespective of the same method is present in child or not
    }
}
