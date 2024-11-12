public class CreateBurgerCommand implements CommandInterface{
    private Burger burger;

    public CreateBurgerCommand(Burger burger) {
        this.burger= burger;
    }

    public void execute(){
        burger.cookBurger();
    }

    public Burger getBurger(){
        return burger;
    }

}
