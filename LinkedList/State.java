class State {
    String text;
    State prev, next;

    State(String t) {
        text = t;
    }
}

class Editor {
    State current;

    void addState(String t) {
        State s = new State(t);
        if(current != null) {
            current.next = s;
            s.prev = current;
        }
        current = s;
    }

    void undo() {
        if(current.prev != null)
            current = current.prev;
    }

    void redo() {
        if(current.next != null)
            current = current.next;
    }
}