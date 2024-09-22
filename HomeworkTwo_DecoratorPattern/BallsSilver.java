public class BallsSilver extends TreeDecorator{
    public BallsSilver(Tree tree){
        description= "Silver Balls";
        this.tree = tree;
        this.starCount = tree.starCount;
    }

    public double cost(){
        return tree.cost() + 3.00;
    }

    public String getDescription(){
        return tree.getDescription() + ", Silver Balls";
    }
}
