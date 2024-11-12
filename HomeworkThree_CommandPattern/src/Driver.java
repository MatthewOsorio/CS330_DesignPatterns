import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        ShortOrderCook cook1= new ShortOrderCook("Chad");
        Waitress waitress1= new Waitress( "Patricia", cook1);
        Customer customer1= new Customer("Matt", waitress1);
        Boolean orderComplete= false;
        
        while(!orderComplete){
            System.out.println("Welcome to ObjectVill Diner, here is our menu!");
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

            if(order >= 1 && order <= 4){
                customer1.createOrder(order);
            }
            else if(order == 5){
                if(customer1.getOrder().isEmpty()){
                    System.out.println(waitress1.getName() +"Sorry we couldn't serve you, have a good day.");
                }
                else{
                    System.out.println(waitress1.getName() + ": Alright I'll run this to the kitchen.");
                }
                orderComplete= true;
            }
            else{
                System.out.println(waitress1.getName() + " Sorry we don't serve that here. Please choose somthing from our menu.");
            }
        }
        scanner.close();
        waitress1.orderUp();
    }
}
