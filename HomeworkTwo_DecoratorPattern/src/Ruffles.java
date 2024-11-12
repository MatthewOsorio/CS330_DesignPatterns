public class Ruffles extends TreeDecorator{
    public Ruffles(Tree tree){
        description = "Ruffles";
        this.tree = tree;
        this.starCount = tree.starCount;
    }

    public double cost(){
        return tree.cost() + 1.00;
    }

    public String getDescription(){
        return tree.getDescription() + ", Ruffles";
    }
}
