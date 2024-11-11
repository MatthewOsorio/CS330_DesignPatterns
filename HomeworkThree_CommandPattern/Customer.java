import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Integer> order;
    private Waitress waitress;

    Customer(String name, Waitress waitress){
        this.name= name;
        order= new ArrayList<Integer>();
        this.waitress= waitress;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getOrder(){
        return order;
    }

    public Waitress getWaitress(){
        return waitress;
    }

    public void createOrder(int orderNum){
        order.addLast(orderNum);
        createCommand(order.getLast());
    }

    private void createCommand(int orderNum){
        switch (orderNum) {
            case 1:
                Burger hamburger= new Burger("Regular");
                CreateBurgerCommand createHamburger= new CreateBurgerCommand(hamburger);
                waitress.takeOrder(createHamburger);
                break;
            case 2:
                Burger cheeseburger= new Burger("Cheeseburger");
                CreateBurgerCommand createCheeseBurger= new CreateBurgerCommand(cheeseburger);
                waitress.takeOrder(createCheeseBurger);
                break;
            case 3:
                Shake vanillaShake= new Shake("Vanilla");
                CreateShakeCommand createVanillaShake= new CreateShakeCommand(vanillaShake);
                waitress.takeOrder(createVanillaShake);
                break;
            case 4:
                Shake chocolateShake= new Shake("Vanilla");
                CreateShakeCommand createChocolateShake= new CreateShakeCommand(chocolateShake);
                waitress.takeOrder(createChocolateShake);
                break;
            default:
                break;
        }
    }
}
