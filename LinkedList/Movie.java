class Movie {
    String title;
    Movie prev, next;

    Movie(String t) {
        title = t;
    }
}

class MovieList {
    Movie head;

    void add(String t) {
        Movie m = new Movie(t);
        if(head == null) head = m;
        else {
            Movie temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = m;
            m.prev = temp;
        }
    }

    void displayForward() {
        Movie temp = head;
        while(temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }
}