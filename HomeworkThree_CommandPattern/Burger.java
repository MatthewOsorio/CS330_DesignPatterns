class Burger{
    private String type;

    public Burger(String type){
        this.type= type;
    }

    public void cookBurger(){
        System.out.println("SIZZLE SIZZLE SIZZLE");
    }

    public String getType(){
        return type;
    }
}