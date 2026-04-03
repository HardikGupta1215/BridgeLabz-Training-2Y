import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DatabaseManager db = new DatabaseManager();

        while (true) {
            System.out.println("\n--- Student Result System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    String grade = (marks >= 80) ? "A" :
                                   (marks >= 60) ? "B" :
                                   (marks >= 40) ? "C" : "F";

                    db.addStudent(new Student(id, name, marks, grade));
                    break;

                case 2:
                    db.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();

                    System.out.print("New Marks: ");
                    double newMarks = sc.nextDouble();

                    String newGrade = (newMarks >= 80) ? "A" :
                                      (newMarks >= 60) ? "B" :
                                      (newMarks >= 40) ? "C" : "F";

                    db.updateStudent(uid, newMarks, newGrade);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    db.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Exit...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}