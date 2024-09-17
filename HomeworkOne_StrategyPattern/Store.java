public class Store extends POS{
    
    public Store(){
        orderProcessingBehavior= new ComputerOrderProcessingBehavior();
        paymentProcessingBehavior = null;
    }

    public void display() {
        System.out.println("Welcome to the Store POS");        
    }
}
