public class BookInstances {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Cinderella", "Giambattista Basile", "0-061-96436-0");
        Book book3 = new Book("Rapunzel", "Anne Sexton");

        System.out.println();
        System.out.println(book1.title + ", " + book1.author + ", " + book1.isbn);
        System.out.println("\"" + book2.title + "\"" + ", " + book2.author + ", " + "ISBN " + book2.isbn);
        System.out.println("\"" + book3.title + "\"" + ", " + book3.author + ", " + "ISBN " + book3.isbn);


    }


}
