import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
public class Import {

    String FILE_PATH = "./src/";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH + FILE_NAME_EXPORT;

    public void ImportFile(ArrayList<Phonebook> pb) {

        LoggerClass.logger.log(Level.INFO, "Выгрузка данных из файла");
        try {
            File file = new File(FILE_PATH_FULL);

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {


                String[] tmp = line.split(";");    //с помощью разделителя split в стоке выискиваем строки, разделенные ";"
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));


                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


