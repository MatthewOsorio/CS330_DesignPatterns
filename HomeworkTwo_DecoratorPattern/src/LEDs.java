public class LEDs extends TreeDecorator{
    public LEDs(Tree tree){
        description = "LED's";
        this.tree = tree;
        this.starCount = tree.starCount;
    }

    public double cost(){
        return tree.cost() + 10.00;
    }

    public String getDescription(){
        return tree.getDescription() + ", LEDs";
    }
}
