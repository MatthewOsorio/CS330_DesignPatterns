import java.util.Scanner;

public class CashPaymentProcessingBehavior implements IPaymentProcessing{
    public void paymentProcessing(){
        int sale, payment, change;
        Scanner scanner= new Scanner(System.in);

        System.out.print("Please enter amount of sale: ");
        if(scanner.hasNextInt()){
            sale= scanner.nextInt();
        }
        else{
            sale= -1;
        }

        System.out.print("Please enter amount of cash given: ");
        if(scanner.hasNextInt()){
            payment= scanner.nextInt();
        }
        else{
            payment= -1;
        }

        change= payment - sale;

        System.out.printf("The chanage is: %d\n", change);
    }
}
