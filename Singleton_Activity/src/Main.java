public class Main {
    
    public static void main(String[] args){
        Log mainLog = Log.getInstance();
        mainLog.debug("Testing Tesing Testing...\n");
        mainLog.info("Everying is operational\n");
        
        HelpDesk helpDesk1= new HelpDesk(1);
        helpDesk1.newEvent("New request came from Mark\n");

        HelpDesk helpDesk2= new HelpDesk(2);
        helpDesk2.newEvent("Recived a call from Leslie\n");
    }
}
