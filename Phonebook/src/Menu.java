import java.util.Scanner;
import java.util.logging.Level;

public class Menu {

    public static void mainMenu(){
        LoggerClass.logger.log(Level.INFO, "Start menu");
        Scanner in = new Scanner(System.in);
        System.out.println("1 - ОТОБРАЗИТЬ СПРАВОЧНИК");
        System.out.println("2 - ВЫГРУЗИТЬ ДАННЫЕ");
        System.out.println("3 - ЗАГРУЗИТЬ ДАННЫЕ");

        System.out.println(". ".repeat( 15));
        System.out.print("ВЫБЕРИТЕ ДЕЙСТВИЕ: ");

        int input = in.nextInt();  // считываем с клавиатуры число

//        Filemanager run = new Filemanager();
        Import imp = new Import();
        Export export = new Export();
        Addresbook phones = new Addresbook();
        phones.Addresbook();

        switch (input) {
            case 1:
                phones.showAddresBook();
                break;
            case 2:
                phones.Addresbook();
                export.ExportFile(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                phones.Addresbook();
                imp.ImportFile(phones.pb);
                phones.showAddresBook();
                break;

        }
    }
}
