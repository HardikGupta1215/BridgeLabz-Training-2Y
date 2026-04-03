class Task {
    int id;
    Task next;

    Task(int id) {
        this.id = id;
    }
}

class CircularList {
    Task head = null;

    void add(int id) {
        Task newTask = new Task(id);
        if(head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while(temp.next != head) temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
    }

    void display() {
        Task temp = head;
        if(head == null) return;
        do {
            System.out.println(temp.id);
            temp = temp.next;
        } while(temp != head);
    }
}