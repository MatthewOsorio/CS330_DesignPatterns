public class Ribbons extends TreeDecorator{
    public Ribbons(Tree tree){
        description = "Ribbons";
        this.tree = tree;
        this.starCount = tree.starCount;
    }

    public double cost(){
        return tree.cost() + 2.00;
    }

    public String getDescription(){
        return tree.getDescription() + ", Ribbons";
    }
}
