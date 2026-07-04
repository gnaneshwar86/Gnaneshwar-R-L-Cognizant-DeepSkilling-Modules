import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskLinkedList taskList = new TaskLinkedList();

        while (true) {

            System.out.println("\n===== Task Management System =====");

            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Status: ");
                    String status = sc.nextLine();

                    taskList.addTask(id, name, status);

                    break;

                case 2:

                    System.out.print("Task ID: ");
                    id = sc.nextInt();

                    taskList.searchTask(id);

                    break;

                case 3:

                    taskList.displayTasks();

                    break;

                case 4:

                    System.out.print("Task ID: ");
                    id = sc.nextInt();

                    taskList.deleteTask(id);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}