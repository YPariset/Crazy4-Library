package Library;

import IHM.GraphicApplication;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    public static ArrayList<Book> bookList;
    Scanner scanner = new Scanner(System.in);




    public Library() {
        bookList = new ArrayList<>();


        //Some object already in the Array List
       bookList.add(new Book("Merci qui ?","Jacquie",1980,"Deluxe","FR",1));
       bookList.add(new Book("Amour & Amnésie","Le poète",2004,"Classic","FR",2));
       bookList.add(new Book("Modern Warbook","Captain Price",2099,"Superior","EN",3));
       // bookList.add(new Book("Wesh alors","Le Z",2020,"Universal","FR",4));

    }

      /** Fonction ajout de livre **/
    /*******************************/
    public void addBook(String title, String author, int year, String editor, String language, int  id) {
                Book theBook = new Book(title, author, year, editor, language, id);
                bookList.add(theBook);
            }















      /** Fonction return tous les livres en chaîne de caractère  **/
    /**************************************************************/
    public void getAllBooks(JTextArea resultLabel) {
        String result = "";                //variable de stockage
        for (Book book : bookList) {       //for each book dans ArrayList
            result += (book.getTitle() + " de " + book.getAuthor() + " (" + book.getYear()+ ")\n"
                    + "Edition: " + book.getEditor() + ", version : " +book.getLanguage() + ", Reference :  " +book.getId() + "\n\n");
        }
        resultLabel.setText(result);


    }

      /** Fonction return tous les livres commençant par la lettre A  **/
    /******************************************************************/
    public void getBookStartByA(JTextArea resultLabel) {
        String result = "";
        for (Book book : bookList) {
            String bookTitle = book.getTitle();
            if (bookTitle.toLowerCase().startsWith("a")) {
                result += (book.getTitle() + " de " + book.getAuthor() + " (" + book.getYear()+ ")\n"
                        + "Edition: " + book.getEditor() + ", version : " +book.getLanguage() + ", Reference :  " +book.getId() + "\n\n");
            }
        }
        resultLabel.setText(result);
    }

    public void getBookIndexImpair(JTextArea resultLabel) {
        String result = "";
        for (Book book : bookList) {
            if ((book.getId() % 2) != 0) {
                result += (book.getTitle() + " de " + book.getAuthor() + " (" + book.getYear()+ ")\n"
                        + "Edition: " + book.getEditor() + ", version : " +book.getLanguage() + ", Reference :  " +book.getId() + "\n\n");
            }
        }
        resultLabel.setText(result);
    }

    //guetters
    public ArrayList<Book> getBookList() {
        return bookList;
    }

    }


