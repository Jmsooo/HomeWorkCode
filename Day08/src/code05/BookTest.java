package code05;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book(001, "", "", 6.2, 560, 230);
        Book book2 = new Book(002, "", "", 2.3, 120, 110);
        Book book3 = new Book(003, "", "", 5.9, 850, 20);
        Book book4 = new Book(004, "", "", 8.3, 410, 230);
        Book book5 = new Book(005, "", "", 7.2, 610, 230);

        Book[] books = {book1, book2, book3, book4, book5};

        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].getSales() < books[j + 1].getSales()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }

        System.out.println("Arrays.toString(books) = " + Arrays.toString(books));
    }
}
