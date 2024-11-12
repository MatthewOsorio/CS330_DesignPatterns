public class CreateShakeCommand implements CommandInterface{
    private Shake shake;

    public CreateShakeCommand(Shake shake) {
        this.shake= shake;
    }

    public void execute(){
        shake.blendShake();
    }

    public Shake getShake(){
        return shake;
    }
}
