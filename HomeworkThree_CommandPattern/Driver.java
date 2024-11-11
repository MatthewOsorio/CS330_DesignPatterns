import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        ShortOrderCook cook1= new ShortOrderCook("Chad");
        Waitress waitress1= new Waitress(cook1);
        Customer customer1= new Customer("Matt");
        Boolean orderComplete= false;
        
        while(!orderComplete){
            System.out.println("Welcome to ObjectVill Diner!");
            System.out.println("1. Hamburger        2. Cheeseburger");
            System.out.println("3. Vanilla Shake    4. Chocolate Shake");
            System.out.print("5. Complete Order \n> ");
            int order;

            if(scanner.hasNextInt()){
                order= scanner.nextInt();
            }
            else{
                order= -1;
            }

            switch (order) {
                case 1:
                    customer1.createOrder(order);
                    Burger hamburger= new Burger("Regular");
                    CreateBurgerCommand createHamburger= new CreateBurgerCommand(hamburger);
                    waitress1.takeOrder(createHamburger);
                    break;
                case 2:
                    customer1.createOrder(order);
                    Burger cheeseburger= new Burger("Cheeseburger");
                    CreateBurgerCommand createCheeseBurger= new CreateBurgerCommand(cheeseburger);
                    waitress1.takeOrder(createCheeseBurger);
                    break;
                case 3:
                    customer1.createOrder(order);
                    Shake vanillaShake= new Shake("Vanilla");
                    CreateShakeCommand createVanillaShake= new CreateShakeCommand(vanillaShake);
                    waitress1.takeOrder(createVanillaShake);
                    break;
                case 4:
                    customer1.createOrder(order);
                    Shake chocolateShake= new Shake("Vanilla");
                    CreateShakeCommand createChocolateShake= new CreateShakeCommand(chocolateShake);
                    waitress1.takeOrder(createChocolateShake);
                    break;
                case 5:
                    orderComplete= true;
                    break;
                default:
                    System.out.println("Sorry we don't serve that.");
                    break;
            }
        }
        scanner.close();
        waitress1.orderUp();

    }
}
