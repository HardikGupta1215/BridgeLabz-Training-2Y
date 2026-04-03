class Book {
    int id;
    String title;
    Book prev, next;

    Book(int id, String t) {
        this.id = id; title = t;
    }
}

class Library {
    Book head;

    void add(int id, String t) {
        Book b = new Book(id, t);
        if(head == null) head = b;
        else {
            Book temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = b;
            b.prev = temp;
        }
    }
}