class Burger{
    String type;

    public Burger(String type){
        this.type= type;
    }

    public void cookBurger(){
        System.out.println("Cook: " + type + " burger coming up!");
    }
}