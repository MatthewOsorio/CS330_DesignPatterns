public class BallsBlue extends TreeDecorator{
    public BallsBlue(Tree tree){
        description= "Blue Balls";
        this.tree = tree;
        this.starCount= tree.starCount;
    }

    public double cost(){
        return tree.cost() + 2.00;
    }

    public String getDescription(){
        return tree.getDescription() + ", Blue Balls";
    }
}
