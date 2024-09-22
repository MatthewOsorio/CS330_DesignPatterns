public class BallsRed extends TreeDecorator{
    public BallsRed(Tree tree){
        description= "Red Balls";
        this.tree = tree;
        this.starCount= tree.starCount;
    }

    public double cost(){
        return tree.cost() + 1.00;
    }

    public String getDescription(){
        return tree.getDescription() + ", Red Balls";
    }
}
