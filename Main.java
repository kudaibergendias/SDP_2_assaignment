package sdp2;

public class Main {
    public static void main(String[] args) {
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        Coffee order = coffeeOrder.doOrder();
        System.out.println("Description: " + order.getDescription());
        System.out.println("Cots: " + order.cost());
    }
}