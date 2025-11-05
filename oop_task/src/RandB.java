public class RandB {
    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", "Лев Толстой");
        Book b2 = new Book("Маленький принц", "Антуан де Сент-Экзюпери");
        Book b3 = new Book("Менің атым Қожа", "Бердібек Соқпақбаев");

        Reader r1 = new Reader("Қасымов Ернұр", 1, "Әдебиет", "1.2.1899", "87051115599");
        r1.takeBook(b1, b2, b3);
        r1.returnBook(b1, b2, b3);
    }
}
class Reader{
    String fullName;
    int numberTicket;
    String facultet;
    String birthDate;
    String number;

    public Reader(String fullName, int numberTicket, String facultet, String birthDate, String number) {
        this.fullName = fullName;
        this.numberTicket = numberTicket;
        this.facultet = facultet;
        this.birthDate = birthDate;
        this.number = number;
    }

    public void takeBook(){}
    public void takeBook(int b){
        System.out.println(fullName + " взял " + b + " книги");
    }
    public void takeBook(String ...books){
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if(i != books.length - 1){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
    public void takeBook(Book ...books){
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].title);
            if(i != books.length - 1){
                System.out.print(",");
            } else {
                System.out.println(".");
            }
        }
    }
    public void returnBook(){}
    public void returnBook(int amount){
        System.out.println(fullName + " вернул " + amount + " книги.");
    }
    public void returnBook(String ...books){
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if(i != books.length - 1){
                System.out.print(",");
            } else {
                System.out.println(".");
            }
        }
    }
    public void returnBook(Book ...books){
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].title);
            if(i != books.length - 1){
                System.out.print(",");
            } else {
                System.out.println(".");
            }
        }
    }

}
class Book{
    String title;
    String author;
    public Book(){}
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}