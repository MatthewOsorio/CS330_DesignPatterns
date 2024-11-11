import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Integer> order;

    Customer(String name){
        this.name= name;
        order= new ArrayList<Integer>();
    }

    public void createOrder(int orderNum){
        order.addLast(orderNum);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getOrder(){
        return order;
    }
}
