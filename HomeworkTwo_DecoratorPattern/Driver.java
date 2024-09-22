public class Driver{
    public static void main(String[] args){
        System.out.print("\n");

        Tree myTree= new ColoradoBlueSpruce();
        myTree = new Star(myTree);
        myTree = new Ruffles(myTree);
        myTree = new Star(myTree);
        myTree = new Ruffles(myTree);
        printTree(myTree);

        System.out.print("\n");

        Tree tree2= new BalsamFir();
        tree2 = new BallsSilver(tree2);
        tree2 = new LEDs(tree2);
        tree2= new Ribbons(tree2);
        tree2= new Star(tree2);
        printTree(tree2);

        System.out.print("\n");
        
        Tree tree3= new DouglasFir();
        tree3= new Star(tree3);
        tree3= new Star(tree3);
        tree3= new Star(tree3);
        tree3= new Lights(tree3);
        tree3= new BallsBlue(tree3);
        printTree(tree3);

        System.out.print("\n");
    }

    public static void printTree(Tree tree){
        System.out.println(tree.getDescription() + " costs $" + tree.cost());
    }
}