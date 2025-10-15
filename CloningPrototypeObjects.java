class Vehicle implements Cloneable {
    String model;
    String color;

    Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) {
        Vehicle original = new Vehicle("Sedan", "Red");
        Vehicle copy = (Vehicle) original.clone();

        System.out.println("Original Vehicle: " + original.model + " - " + original.color);
        System.out.println("Cloned Vehicle: " + copy.model + " - " + copy.color);
    }
}
