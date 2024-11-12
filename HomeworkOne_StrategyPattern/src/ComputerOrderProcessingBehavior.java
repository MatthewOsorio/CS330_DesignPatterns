import java.util.Random;

public class ComputerOrderProcessingBehavior implements IOrderProcessing{
    public void orderProcessing(){
        Random random = new Random();
        int min=1, max=100;
        int orderNumber= random.nextInt((max - min) + 1) + min;

        System.out.printf("Order number is: %d", orderNumber);
    }
}
