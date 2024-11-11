public class Resturant {
    public static void main(String[] args){
        Waitress waitress1= new Waitress("Patricia");
        Waitress waitress2= new Waitress("Janet");
        
        Burger cheeseBurger= new Burger("cheese");
        Shake maltShake= new Shake("malt");
        CommandInterface createCheeseBurger= new CreateBurgerCommand(cheeseBurger);
        CommandInterface craeteMaltShake= new CreateShakeCommand(maltShake);

        waitress1.takeOrder(createCheeseBurger);
        waitress1.takeOrder(craeteMaltShake);

        Burger animalStyleBurger = new Burger("animal style");
        Shake vanillaShake = new Shake("vanilla");

        CommandInterface createAnimalStyleBurger = new CreateBurgerCommand(animalStyleBurger);
        CommandInterface createVanillaShake= new CreateShakeCommand(vanillaShake);

        waitress2.takeOrder(createAnimalStyleBurger);
        waitress2.takeOrder(createVanillaShake);

    }
}
