import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;

public class Export {

        String FILE_PATH = "./src/";
        String FILE_NAME_EXPORT = "export.csv";
        String FILE_PATH_FULL = FILE_PATH + FILE_NAME_EXPORT;
        public void ExportFile (ArrayList<Phonebook> pb){

            LoggerClass.logger.log(Level.INFO, "Запись данных в файл");


            try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false))    // false - файл будет каждый раз перезаписываться, true - в файл будет добавляться ирнформация
            {


                for (Phonebook i : pb) {
                    String text = i.getName() + ";" + i.getPhone() + ";" + i.getCity();
                    writer.write(text);

                    writer.append('\n');

                }
                writer.flush();
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
}
