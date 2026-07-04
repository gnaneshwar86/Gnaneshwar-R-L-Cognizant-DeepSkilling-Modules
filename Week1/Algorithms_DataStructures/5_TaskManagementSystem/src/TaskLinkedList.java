public class TaskLinkedList {

    private Task head;

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null)
                temp = temp.next;

            temp.next = newTask;
        }

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                System.out.println(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("Task List Empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted.");
            return;
        }

        Task prev = head;
        Task curr = head.next;

        while (curr != null) {

            if (curr.taskId == id) {

                prev.next = curr.next;
                System.out.println("Task Deleted.");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task Not Found.");
    }

    // Display Tasks
    public void displayTasks() {

        if (head == null) {

            System.out.println("No Tasks Available.");
            return;
        }

        System.out.println("---------------------------------------------");
        System.out.printf("%-8s %-20s %-15s%n",
                "ID",
                "Task Name",
                "Status");
        System.out.println("---------------------------------------------");

        Task temp = head;

        while (temp != null) {

            System.out.println(temp);
            temp = temp.next;
        }

        System.out.println("---------------------------------------------");
    }
}