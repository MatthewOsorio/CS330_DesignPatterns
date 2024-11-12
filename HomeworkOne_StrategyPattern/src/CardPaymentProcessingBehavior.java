import java.util.Scanner;

public class CardPaymentProcessingBehavior implements IPaymentProcessing{
    public void paymentProcessing(){
        int cardNumber, sale;
        Scanner scanner= new Scanner(System.in);

        System.out.print("Please enter credit card number: ");
        if(scanner.hasNextInt()){
            cardNumber= scanner.nextInt();
        }
        else{
            cardNumber= -1;
        }

        System.out.print("Please enter the amount of sale: ");
        if(scanner.hasNextInt()){
            sale= scanner.nextInt();
        }
        else{
            sale= -1;
        }
    }
}
