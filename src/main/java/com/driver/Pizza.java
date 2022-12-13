package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isBagAdded;
    boolean isBillGenerated;
    private int toppingsPrice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg) {
            this.price = 300;
            this.toppingsPrice = 80;
        }
        else {
            this.price = 400;
            this.toppingsPrice = 120;
        }

        this.isCheeseAdded= false;
        this.isToppingsAdded= false;
        this.isBagAdded= false;
        this.isBillGenerated= false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(isCheeseAdded== false){

            this.price+= 80;
            isCheeseAdded= true;
        }
    }

    public void addExtraToppings(){

        if(isToppingsAdded==false) {
            if (isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {

            if (isBagAdded == false){
                this.price += 20;
                isBagAdded= true;
            }
    }

    public String getBill(){
        if(isBillGenerated== false) {
            if (isVeg) {
                this.bill += "Base Price Of The Pizza: 300" + "\n";
            }
            else
                this.bill += "Base Price Of The Pizza: 400" + "\n";

            if(isCheeseAdded){
            this.bill += "Extra Cheese Added: 40" + "\n";}

            if(isToppingsAdded){
            this.bill += "Extra Toppings Added: " +this.toppingsPrice + "\n";}

            if(isBagAdded){
            this.bill += "Paperbag Added: 20";}

            this.bill += "Total Price: " + this.price;

            this.isBillGenerated = true;
        }

        return this.bill;
    }
}
