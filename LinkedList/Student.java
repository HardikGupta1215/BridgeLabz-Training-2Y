class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;

    Student(int r, String n, int a, String g) {
        roll = r; name = n; age = a; grade = g;
        next = null;
    }
}

class StudentList {
    Student head;

    void add(int r, String n, int a, String g) {
        Student newNode = new Student(r,n,a,g);
        if(head == null) head = newNode;
        else {
            Student temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    void display() {
        Student temp = head;
        while(temp != null) {
            System.out.println(temp.roll+" "+temp.name+" "+temp.grade);
            temp = temp.next;
        }
    }
}