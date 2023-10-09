package sdp2;
import java.util.Scanner;
public class CoffeeOrder {
    public Coffee doOrder(){
        Coffee order = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a coffee type: ");
        System.out.println("1.Espresso");
        System.out.println("2.Latte");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                order = new Espresso();
                break;
            case 2:
                order = new Latte();
                break;
            default:
                System.out.println("Invalid coffee choice.");
                order = new Espresso();
        }
        while(true){
            System.out.println("Do you want to add condiments?(Y/N)");
            String addCond = scanner.next();
            if (addCond.equals("Y")){
                System.out.println("Choose a condiment: ");
                System.out.println("1.Milk");
                System.out.println("2.Sugar");
                System.out.println("3.Caramel");
                System.out.println("4.Выйти");
                int condChoice = scanner.nextInt();
                switch (condChoice){
                    case 1:
                        order = new Milk(order);
                        break;
                    case 2:
                        order = new Sugar(order);
                        break;
                    case 3:
                        order = new Caramel(order);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invaild condiment choice.");
                }
            } else if (addCond.equals("N")) {
                break;
            }
            else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
        scanner.close();
        return order;
    }
}
