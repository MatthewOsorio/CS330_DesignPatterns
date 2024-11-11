public class CreateShakeCommand implements CommandInterface{
    Shake shake;

    public CreateShakeCommand(Shake shake) {
        this.shake= shake;
    }

    public void execute(){
        shake.blendShake();
    }
}
