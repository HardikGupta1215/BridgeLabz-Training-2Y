class Employee implements Cloneable {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }

    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class CloningPrototype {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Vineet", "IT");
        Employee e2 = e1.clone();

        System.out.println("Original Object:");
        e1.display();

        System.out.println("Cloned Object:");
        e2.display();

        System.out.println("\nAre e1 and e2 different objects? " + (e1 != e2));
    }
}
