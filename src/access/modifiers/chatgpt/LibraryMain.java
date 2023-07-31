package access.modifiers.chatgpt;

public class LibraryMain {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.setBookTitle("Harry Potter");
        l1.setAuthor("J. K. Rowling");
        l1.setIsbn(123456);

        System.out.println("l1 : Title - "+l1.getBookTitle()+", Author - "+l1.getAuthor()+", ISBN - "+l1.getIsbn());

        Library l2 = new Library();
        l2.setBookTitle("Harry Potter");
        l2.setAuthor("J. K. Rowling");
        l2.setIsbn(123456);

        System.out.println("l2 : Title - "+l2.getBookTitle()+", Author - "+l2.getAuthor()+", ISBN - "+l2.getIsbn());

        Library l3 = new Library();
        l3.setBookTitle("Ram");
        l3.setAuthor("Amish Trivedi");
        l3.setIsbn(726372);

        System.out.println("l3 : Title - "+l3.getBookTitle()+", Author - "+l3.getAuthor()+", ISBN - "+l3.getIsbn());

        System.out.println("Are l1 and l2 same : "+l1.areBooksSame(l2));
        System.out.println("Are l2 and l3 same : "+l2.areBooksSame(l3));


    }
}
