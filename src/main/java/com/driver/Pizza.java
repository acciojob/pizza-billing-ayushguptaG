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
    private int cheesePrice;
    private int takeAwayPrice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg) {
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else {
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.takeAwayPrice= 20;
        this.cheesePrice= 80;
        this.isCheeseAdded= false;
        this.isToppingsAdded= false;
        this.isBagAdded= false;
        this.isBillGenerated= false;

        this.bill= "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(isCheeseAdded== false){

            this.price+= this.cheesePrice;
            isCheeseAdded= true;
        }
    }

    public void addExtraToppings(){

        if(isToppingsAdded==false) {

            this.price += this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {

            if (isBagAdded == false){
                this.price += this.takeAwayPrice;
                isBagAdded= true;
            }
    }

    public String getBill(){
        if(isBillGenerated== false) {

            if(isCheeseAdded){
            this.bill += "Extra Cheese Added: "+ this.cheesePrice + "\n";}

            if(isToppingsAdded){
            this.bill += "Extra Toppings Added: " +this.toppingsPrice + "\n";}

            if(isBagAdded){
            this.bill += "Paperbag Added: "+this.takeAwayPrice+"\n";}

            this.bill += "Total Price: " + this.price+ "\n";

            this.isBillGenerated = true;
        }

        return this.bill;
    }
}
