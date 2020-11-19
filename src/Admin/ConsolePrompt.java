package Admin;

import Library.Library;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class ConsolePrompt {

    static Scanner scanner = new Scanner(System.in);
    Library myLibrary = new Library();

    public void launchApplication() {
        System.out.println("\n                               \n");
        System.out.println("-----------------------------------");
        System.out.println("   Welcome on the Parizoo Library  ");
        System.out.println("-----------------------------------");
        chooseOption();
    }

    public void chooseOption() {
        String choosenOption;

            System.out.println("Make a choice : ");
            System.out.println("1-Add one book");
            System.out.println("2-See all books listed in the library");
            System.out.println("3-See the books starting with letter: A");
            System.out.println("4-See the books with an index impair");
            System.out.println("5-Quit the application");
            System.out.println(">");
            choosenOption = scanner.nextLine();


       switch (choosenOption) {
            case "1":
                //myLibrary.addBook("");
                chooseOption();
                break;
            case "2":
                //System.out.println(myLibrary.getAllBooks());
                chooseOption();
                break;
            case "3":
                //System.out.println(myLibrary.getBookStartByA());
                chooseOption();
                break;
            case "4":
                //System.out.println(myLibrary.getBookIndexImpair());
                chooseOption();
                break;
            case "5":
                System.out.println("See you soon");
                exit(0);
                break;
        }






    }
}
