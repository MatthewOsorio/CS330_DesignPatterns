public class HelpDesk {
    int id;
    
    public HelpDesk(int id){
        this.id= id;
    }

    public void newEvent(String message){
        Log newLog = Log.getInstance();
        newLog.info(message);
    }
}
