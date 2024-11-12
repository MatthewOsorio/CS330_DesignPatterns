public class Star extends TreeDecorator{
    Boolean tooManyStars= false;

    public Star(Tree tree){
        description = "Star";
        this.tree = tree;
        starCount =  tree.starCount + 1;
        checkStars();
    }
    
    public String getDescription(){
        if(tooManyStars){
            return tree.getDescription();
        }
        else{
            return tree.getDescription() + ",a Star";
        }
    }

    public double cost(){
        if(tooManyStars){
            return tree.cost();
        }
        else{
            return tree.cost() + 4.00;
        }
    }

    public void checkStars(){
        if(starCount > 1){
            tooManyStars= true;
            System.out.println("Tree already has a star");
        }
    }
}
