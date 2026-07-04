public class Main {

    public static void display(Order[] orders) {

        System.out.println("--------------------------------------------");
        System.out.printf("%-8s %-15s %s\n",
                "ID",
                "Customer",
                "Total Price");
        System.out.println("--------------------------------------------");

        for (Order order : orders)
            System.out.println(order);

        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Alice", 2500),
                new Order(102, "Bob", 1200),
                new Order(103, "Charlie", 5400),
                new Order(104, "David", 1800),
                new Order(105, "Emma", 3200)
        };

        System.out.println("===== ORIGINAL ORDERS =====");
        display(orders);

        Order[] bubbleOrders = orders.clone();

        BubbleSort.sort(bubbleOrders);

        System.out.println("\n===== AFTER BUBBLE SORT =====");
        display(bubbleOrders);

        Order[] quickOrders = orders.clone();

        QuickSort.quickSort(quickOrders, 0, quickOrders.length - 1);

        System.out.println("\n===== AFTER QUICK SORT =====");
        display(quickOrders);
    }
}