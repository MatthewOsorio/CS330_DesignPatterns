public class Kiosk extends POS{

    public Kiosk(){
        orderProcessingBehavior= new TicketOrderProcessingBehavior();
        paymentProcessingBehavior = new CashPaymentProcessingBehavior();
    }

    public void display(){
        System.out.println("Welcome to the Kiosk POS");
    }
}
