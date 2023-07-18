package regular;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class View {

    public static String add_message(Scanner scan) {
        System.out.print("Введите заметку ! ");
        String message = scan.nextLine();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss : ").
                format(Calendar.getInstance().getTime());
        return String.format("%s%s\n", timeStamp, message);
    }
}
