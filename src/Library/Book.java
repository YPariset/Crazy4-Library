package Library;

public class Book {

    /****************************************************/
    /***********           Attributes         ***********/
    /****************************************************/

    private String title;
    private String author;
    private int year;
    private String editor;
    private String language;;
    private int id;
    private String category;

    /****************************************************/
    /***********          Constructor        ************/
    /****************************************************/

    public Book(String title, String author, int year, String editor, String language, int id, String category) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.editor = editor;
        this.language = language;
        this.id = id;
        this.category = category;
    }

    public Book(String title, int id){
        this.title = title;
        this.id = id;
    }


    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public String toString(){
        return this.title;
    };

    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getEditor() {
        return editor;
    }

    public String getLanguage() {
        return language;
    }

    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }
}
