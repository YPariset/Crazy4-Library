package IHM;

import Library.Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicApplication extends JFrame {
    public GraphicApplication() {

        /*********************************************/
        /********* Configuration of JFrame ***********/
        /*********************************************/


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(350, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        /********************************************************/
        /************ Instantiation of our object ***************/
        /********************************************************/

        Library myLibrary = new Library();
        
        /***********************************************************/
        /***************** Configuration of JPanel *****************/
        /***********************************************************/

        JPanel paneStart = new JPanel();
        JPanel paneSearch = new JPanel();
        JPanel paneAddBook = new JPanel();
        JPanel paneResultTable = new JPanel();

        setContentPane(paneStart);
        paneStart.setBackground(Color.GREEN);
        paneSearch.setBackground(Color.ORANGE);
        paneAddBook.setBackground(Color.BLUE);
        paneResultTable.setBackground(Color.RED);


        /***********************************************************/
        /************** Configuration of Layout ********************/
        /***********************************************************/

        paneStart.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneSearch.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneResultTable.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneAddBook.setLayout(new FlowLayout(FlowLayout.LEFT));


        /***********************************************************/
        /********* Configuration Components of Panel ***************/
        /***********************************************************/

        //Panel Start
        JLabel MainTitle = new JLabel("Welcome to the Crazy4 Library");
        MainTitle.setPreferredSize(new Dimension(330, 300));
        MainTitle.setFont(new Font("Courier New ", Font.BOLD, 20));


        //Panel AddBook
        JLabel labelTitle = new JLabel();
        labelTitle.setText("Title : ");
        labelTitle.setForeground(Color.white);

        JTextField textTitle = new JTextField();
        textTitle.setColumns(29);

        JLabel labelAuthor = new JLabel();
        labelAuthor.setText("Author : ");
        labelAuthor.setForeground(Color.white);

        JTextField textAuthor = new JTextField();
        textAuthor.setColumns(29);

        JLabel labelYear = new JLabel();
        labelYear.setText("Year : ");
        labelYear.setForeground(Color.white);

        JTextField textYear = new JTextField();
        textYear.setColumns(29);

        JLabel labelEditor = new JLabel();
        labelEditor.setText("Editor : ");
        labelEditor.setForeground(Color.white);

        JTextField textEditor = new JTextField();
        textEditor.setColumns(29);

        JLabel labelLanguage = new JLabel();
        labelLanguage.setText("lang. : ");
        labelLanguage.setForeground(Color.white);

        JTextField textLanguage = new JTextField();
        textLanguage.setColumns(29);

        JLabel labelId = new JLabel();
        labelId.setText("Id: ");
        labelId.setForeground(Color.white);

        JTextField textId = new JTextField();
        textId.setColumns(29);

        JButton buttonValidate = new JButton();
        buttonValidate.setText("Validate");

        JLabel labelButtonRadio = new JLabel("Choose a category : ");
        labelButtonRadio.setForeground(Color.white);

        JRadioButton buttonTypeManga = new JRadioButton("Manga");
        buttonTypeManga.setForeground(Color.white);

        JRadioButton buttonNovel = new JRadioButton("Novel");
        buttonNovel.setForeground(Color.white);

        JRadioButton buttonMagazine = new JRadioButton("Magazine");
        buttonMagazine.setForeground(Color.white);

        JLabel labelConfirm = new JLabel();
        labelConfirm.setText("New book added in the library !");
        labelConfirm.setForeground(Color.white);
        labelConfirm.setFont(new Font("Courier New ", Font.BOLD, 15));

        JComboBox chooseTypeManga = new JComboBox();
        chooseTypeManga.setVisible(false);


        //Panel Search
        JButton getAllBooks = new JButton();
        getAllBooks.setText("Print all books");

        JButton getBooksStartByA = new JButton();
        getBooksStartByA.setText("Print books started by A");

        JButton getBookODD = new JButton();
        getBookODD.setText("Print odd id books");

        JTextArea resultLabel = new JTextArea(20, 28);




        /***********************************************************/
        /**************** Add components in Panel ******************/
        /***********************************************************/

        paneStart.add(MainTitle);

        paneAddBook.add(labelTitle);
        paneAddBook.add(textTitle);
        paneAddBook.add(labelAuthor);
        paneAddBook.add(textAuthor);
        paneAddBook.add(labelYear);
        paneAddBook.add(textYear);
        paneAddBook.add(labelEditor);
        paneAddBook.add(textEditor);
        paneAddBook.add(labelLanguage);
        paneAddBook.add(textLanguage);
        paneAddBook.add(labelId);
        paneAddBook.add(textId);
        paneAddBook.add(labelButtonRadio);
        paneAddBook.add(buttonTypeManga);
        paneAddBook.add(buttonNovel);
        paneAddBook.add(buttonMagazine);
        paneAddBook.add(buttonValidate);
        paneAddBook.add(chooseTypeManga);
        paneAddBook.add(labelConfirm);

        paneSearch.add(getAllBooks);
        paneSearch.add(getBooksStartByA);
        paneSearch.add(getBookODD);
        paneSearch.add(resultLabel);


        /***********************************************************/
        /********* Configuration of the application menu ***********/
        /***********************************************************/

        JMenuBar monMenu = new JMenuBar();
        this.setJMenuBar(monMenu);

        JMenu menuOptions = new JMenu("Options");
        monMenu.add(menuOptions);

        JMenuItem subMenuNew = new JMenuItem("Add book");
        JMenuItem subMenuSearch = new JMenuItem("Search");
        JMenuItem subMenuResult = new JMenuItem("Result");
        JMenuItem subMenuExit = new JMenuItem("Exit");

        menuOptions.add(subMenuNew);
        menuOptions.add(subMenuSearch);
        menuOptions.add(subMenuResult);
        menuOptions.add(subMenuExit);



        /***********************************************************/
        /**************** User actions Menu management *************/
        /***********************************************************/

        subMenuNew.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {

                                             setContentPane(paneAddBook);
                                             setTitle("Add Book");

                                             labelConfirm.setVisible(false);

                                             buttonValidate.addActionListener(new ActionListener() {
                                                 public void actionPerformed(ActionEvent e) {
                                                     labelConfirm.setVisible(true);
                                                     myLibrary.addBook(textTitle.getText(), textAuthor.getText(), Integer.parseInt(textYear.getText()),textEditor.getText(), textLanguage.getText(), Integer.parseInt(textId.getText()));

                                                 }
                                             });


                                             buttonTypeManga.addActionListener(new ActionListener() {
                                                 public void actionPerformed(ActionEvent e) {
                                                     chooseTypeManga.setVisible(true);
                                                     String[] mangaType = {"Choose a type of Manga", "Shonen", "Hentaï", "Seinen"};

                                                     for (String s : mangaType) {
                                                         chooseTypeManga.addItem(s);
                                                     }
                                                 }
                                             });


                                         }
                                     }
        );


        subMenuSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setContentPane(paneSearch);
                setTitle("Search");

                getAllBooks.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        resultLabel.setEditable(false);
                        myLibrary.getAllBooks(resultLabel);
                    }
                });

                getBooksStartByA.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        myLibrary.getBookStartByA(resultLabel);

                    }
                });

                getBookODD.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        myLibrary.getBookIndexImpair(resultLabel);
                    }
                });

                revalidate();
            }
        });

        subMenuExit.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                              System.exit(1);
                                          }
                                      }
        );


    }
}



