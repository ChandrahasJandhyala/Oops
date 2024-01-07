public class App {
    public static void main(String[] args){
        pizza basePizza = new pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        
        basePizza.getBill();
    }
}
