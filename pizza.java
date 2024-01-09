public class pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 50;
    private int takeAwayPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayAdded = false;


    pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 450;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        System.out.println("Extra cheese has been added to your pizza");
        this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
        isExtraToppingsAdded =true;
        System.out.println("Extra toppings have been added to your pizza");
        this.price += extraToppingsPrice;

    }

    public void takeAway(){
        isTakeAwayAdded =true;
        System.out.println("The pizza is ready for a takeaway");
        this.price += takeAwayPrice;

    }

    public void getBill(){
        String bill = "";
        
        System.out.println("The price split is as follows:");
        //base pizza price
        System.out.println("BasePizzaPrice : " + basePizzaPrice);
        //if toppings are added - 2 splits either extraCheese or extraToppings
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Cheese Added : " + extraToppingsPrice + "\n";
        }

        if (isExtraToppingsAdded) {
            bill += "Extra Cheese Added : " + extraToppingsPrice + "\n";
        }
        if (isTakeAwayAdded) {
            bill += "Extra Cheese Added : " + takeAwayPrice + "\n";
        }
        bill += "Bill= " + this.price + "\n";
        System.out.println(bill);





    

    }







}
