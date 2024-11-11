public class Waitress {
    CommandInterface currentOrder;
    String name;

    public Waitress(String name){
        this.name= name;
    }

    public void takeOrder(CommandInterface order){
        currentOrder = order;
        createOrder();
    }

    public void createOrder(){
        System.out.println(name+ ": I'll put his order in...");
        currentOrder.execute();
        System.out.println("Here is your order!\n");
    }
}
