class Process {
    int id, burst;
    Process next;

    Process(int id, int burst) {
        this.id = id; this.burst = burst;
    }
}

class RoundRobin {
    Process head;

    void add(int id, int burst) {
        Process p = new Process(id, burst);
        if(head == null) {
            head = p;
            p.next = head;
        } else {
            Process temp = head;
            while(temp.next != head) temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }
}