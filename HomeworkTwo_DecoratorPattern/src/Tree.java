public abstract class Tree {
    String description = "Unknown Tree";
    int starCount = 0;

    public abstract double cost();

    public String getDescription(){
        return description;
    }
}
