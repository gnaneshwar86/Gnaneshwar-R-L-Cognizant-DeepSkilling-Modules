import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        while (true) {

            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Search Product");
            System.out.println("5. Display Inventory");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.addProduct(new Product(id, name, qty, price));
                    break;

                case 2:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    price = sc.nextDouble();

                    inventory.updateProduct(id, name, qty, price);
                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    inventory.deleteProduct(id);
                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    inventory.searchProduct(id);
                    break;

                case 5:

                    inventory.displayProducts();
                    break;

                case 6:

                    inventory.totalValue();
                    break;

                case 7:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}