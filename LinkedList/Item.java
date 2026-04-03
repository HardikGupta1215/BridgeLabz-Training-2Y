class Item {
    int id, qty;
    double price;
    Item next;

    Item(int id, int qty, double price) {
        this.id = id; this.qty = qty; this.price = price;
    }
}

class Inventory {
    Item head;

    void add(int id, int qty, double price) {
        Item newItem = new Item(id, qty, price);
        newItem.next = head;
        head = newItem;
    }

    double totalValue() {
        double sum = 0;
        Item temp = head;
        while(temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }
}