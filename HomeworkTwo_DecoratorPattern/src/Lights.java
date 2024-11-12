public class Lights extends TreeDecorator{
    public Lights(Tree tree){
        description = "Lights";
        this.tree = tree;
        this.starCount = tree.starCount;
    }    

    public double cost(){
        return tree.cost() + 5.00;
    }

    public String getDescription(){
        return tree.getDescription() + ", Lights";
    }
}
