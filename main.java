import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Task title: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.print("Task number: ");
                    int complete = scanner.nextInt();
                    manager.completeTask(complete);
                    break;

                case 4:
                    System.out.print("Task number: ");
                    int delete = scanner.nextInt();
                    manager.deleteTask(delete);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}
