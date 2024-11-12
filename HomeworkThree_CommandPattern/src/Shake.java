public class Shake {
    private String type;

    public Shake(String type){
        this.type= type;
    }

    public void blendShake(){
        System.out.println("BLENDING BLENDING BLENDING");
    }

    public String getType(){
        return type;
    }
}
