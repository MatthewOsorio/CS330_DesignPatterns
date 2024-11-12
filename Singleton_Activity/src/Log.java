import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
    private volatile static Log unique_log;

    private Log () {}

    public static Log getInstance(){
        if(unique_log == null){
            synchronized(Log.class){
                if(unique_log == null){
                    unique_log = new Log();
                }
            }
        }
        return unique_log;
    }

    public void debug (String message){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.write("Debug: " + message);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void info (String message){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.write("Debug: " + message);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}