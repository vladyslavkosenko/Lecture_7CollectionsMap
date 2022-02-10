import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, LocalDate> lib = new HashMap<>();
        lib.put("Hary ", LocalDate.of(2020, 10, 17));
        lib.put("Hary1 ", LocalDate.of(2020, 10, 18));
        lib.put("Hary3 ", LocalDate.of(2020, 10, 19));
        lib.put("Hary2", LocalDate.of(2020, 10, 20));
        System.out.println("Enter the date you borrowed the book in format yyyy mm dd");
        Scanner in = new Scanner(System.in);
        String book = in.nextLine();
        for (Map.Entry<String, LocalDate> entry : lib.entrySet()) {
            System.out.println(entry.getValue().toString());
            if (entry.getValue().toString().equals(book)) {
                System.out.println("Your book" + entry.getKey());
            } else {
                System.out.println("There is no such book");
            }

        }
        
    }
}
