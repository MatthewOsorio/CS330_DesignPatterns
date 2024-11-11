public class CreateBurgerCommand implements CommandInterface{
    Burger burger;

    public CreateBurgerCommand(Burger burger) {
        this.burger= burger;
    }

    public void execute(){
        burger.cookBurger();
    }


}
