import java.util.ArrayList;

public class Waitress {
    private ArrayList<CommandInterface> customerOrders;
    private ShortOrderCook cook;
    private String name;

    public Waitress(String name, ShortOrderCook cook){
        this.name= name;
        this.cook= cook;
        customerOrders= new ArrayList<CommandInterface>();
    }

    public String getName(){
        return name;
    } 

    public ArrayList<CommandInterface> getCustomerOrders(){
        return customerOrders;
    }

    public ShortOrderCook getCook(){
        return cook;
    }

    public void takeOrder(CommandInterface order){
        customerOrders.addLast(order);
    }

    public void orderUp(){
        if(!customerOrders.isEmpty()){
            System.out.println( name + ": Order up!");
            for(CommandInterface i : customerOrders){
                cook.makeOrder(i);
            }
    
            System.out.println(name+ ": Here is your order!");
        }
    }
}
