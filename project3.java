import java.util.*;
public class Project3{
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add\n2. View\n3. Update\n4. Delete\n5. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    students.put(id, name);
                }
                case 2 -> students.forEach((id, name) -> System.out.println(id + " - " + name));
                case 3 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    if (students.containsKey(id)) {
                        System.out.print("New Name: ");
                        students.put(id, sc.nextLine());
                    } 
                    else 
                    System.out.println("Not Found");
                }
                case 4 -> {
                    System.out.print("ID: ");
                    if (students.remove(sc.nextLine()) == null) 
                    System.out.println("Not Found");
                }
            }
        } while (choice != 5);
    }
}

