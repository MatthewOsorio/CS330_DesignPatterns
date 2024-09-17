import java.util.Scanner;

public class TicketOrderProcessingBehavior implements IOrderProcessing{
    public void orderProcessing(){
        Scanner scanner= new Scanner(System.in);
        int orderNumber;

        System.out.print("Please enter an order number: ");
        if(scanner.hasNextInt()){
            orderNumber= scanner.nextInt();
        }
        else{
            orderNumber=-1;
        }
    }
}
