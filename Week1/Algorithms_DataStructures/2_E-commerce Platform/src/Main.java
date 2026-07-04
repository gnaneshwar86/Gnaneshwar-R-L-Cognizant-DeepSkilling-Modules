import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== E-Commerce Search =====");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product Name: ");

                    String name = sc.nextLine();

                    Product p1 =
                            SearchOperations.linearSearch(products, name);

                    if (p1 != null)
                        System.out.println("Found : " + p1);
                    else
                        System.out.println("Product Not Found");

                    break;

                case 2:

                    System.out.print("Enter Product Name: ");

                    name = sc.nextLine();

                    Product p2 =
                            SearchOperations.binarySearch(products, name);

                    if (p2 != null)
                        System.out.println("Found : " + p2);
                    else
                        System.out.println("Product Not Found");

                    break;

                case 3:

                    for (Product product : products)
                        System.out.println(product);

                    break;

                case 4:

                    System.out.println("Thank You");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}