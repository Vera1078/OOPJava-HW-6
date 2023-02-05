import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        LoggerClass.logger.log (Level.INFO, "Start program");


      Menu.mainMenu();

        LoggerClass.logger.log (Level.INFO, "Stop program");
    }
}