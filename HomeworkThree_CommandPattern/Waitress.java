import java.util.ArrayList;

public class Waitress {
    private ArrayList<CommandInterface> customerOrders;
    private ShortOrderCook cook;

    public Waitress(ShortOrderCook cook){
        this.cook= cook;
        customerOrders= new ArrayList<CommandInterface>();
    }

    public void takeOrder(CommandInterface order){
        customerOrders.addLast(order);
    }

    public void orderUp(){
        System.out.println("Waitress: Order up!");
        for(CommandInterface i : customerOrders){
            cook.makeOrder(i);
        }

        System.out.println("Here is your order!");
    }

    public ArrayList<CommandInterface> getCustomerOrders(){
        return customerOrders;
    }

    public ShortOrderCook getCook(){
        return cook;
    }

}
