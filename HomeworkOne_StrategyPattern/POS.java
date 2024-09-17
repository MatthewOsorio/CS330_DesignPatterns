abstract class POS {
    IOrderProcessing orderProcessingBehavior;
    IPaymentProcessing paymentProcessingBehavior;

    public void setOrderProcessingBehavior(IOrderProcessing newOrderProcessingBehavior){
        orderProcessingBehavior= newOrderProcessingBehavior;
    }

    public void setPaymentProcessingBehavior (IPaymentProcessing newPaymentProcessingBehavior){
        paymentProcessingBehavior= newPaymentProcessingBehavior;
    }

    public void paymentProcessing(){
        paymentProcessingBehavior.paymentProcessing();
    }

    public void orderProcessing(){
        orderProcessingBehavior.orderProcessing();
    }

    public abstract void display();
}
