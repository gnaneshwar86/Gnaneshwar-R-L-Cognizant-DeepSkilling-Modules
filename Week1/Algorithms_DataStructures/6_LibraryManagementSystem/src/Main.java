import java.util.Scanner;

public class Main {

    public static void displayBooks(Book[] books) {

        System.out.println("----------------------------------------------");
        System.out.printf("%-8s %-25s %-20s%n",
                "ID",
                "Title",
                "Author");
        System.out.println("----------------------------------------------");

        for (Book book : books)
            System.out.println(book);

        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Algorithms", "Thomas Cormen"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Computer Networks", "Andrew Tanenbaum")
        };

        while (true) {

            System.out.println("\n===== Library Management System =====");

            System.out.println("1. Display Books");
            System.out.println("2. Linear Search");
            System.out.println("3. Binary Search");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    displayBooks(books);
                    break;

                case 2:

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    Book book1 =
                            SearchOperations.linearSearch(books, title);

                    if (book1 != null)
                        System.out.println(book1);
                    else
                        System.out.println("Book Not Found.");

                    break;

                case 3:

                    System.out.print("Enter Book Title: ");
                    title = sc.nextLine();

                    Book book2 =
                            SearchOperations.binarySearch(books, title);

                    if (book2 != null)
                        System.out.println(book2);
                    else
                        System.out.println("Book Not Found.");

                    break;

                case 4:

                    System.out.println("Thank You!");
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}