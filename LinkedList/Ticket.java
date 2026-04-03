class Ticket {
    int id;
    Ticket next;

    Ticket(int id) {
        this.id = id;
    }
}

class TicketSystem {
    Ticket head;

    void add(int id) {
        Ticket t = new Ticket(id);
        if(head == null) {
            head = t;
            t.next = head;
        } else {
            Ticket temp = head;
            while(temp.next != head) temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }
}