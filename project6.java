import java.util.*;
public class SimpleToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> status = new ArrayList<>();
        do {
            System.out.println("\n1. Add\n2. Edit\n3. Delete\n4. Mark Complete\n5. View\n6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Task: ");
                    tasks.add(sc.nextLine());
                    status.add(false);
                }
                case 2 -> {
                    System.out.print("Task Number to Edit: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine();
                    if (index >= 0 && index < tasks.size()) {
                        System.out.print("New Task: ");
                        tasks.set(index, sc.nextLine());
                    } else System.out.println("Invalid Task Number.");
                }
                case 3 -> {
                    System.out.print("Task Number to Delete: ");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        status.remove(index);
                    } else System.out.println("Invalid Task Number.");
                }
                case 4 -> {
                    System.out.print("Task Number to Mark Complete: ");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < tasks.size()) status.set(index, true);
                    else System.out.println("Invalid Task Number.");
                }
                case 5 -> {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i) + (status.get(i) ? " [Completed]" : " [Pending]"));
                    }
                }
            }
        } while (choice != 6);
    }
}

