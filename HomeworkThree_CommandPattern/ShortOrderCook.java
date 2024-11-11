public class ShortOrderCook {
    private String name;
    
    public ShortOrderCook(String name){
        this.name=name;
    }

    public void makeOrder(CommandInterface command){
        command.execute();
    }

    public String getName(){
        return name;
    }
}
