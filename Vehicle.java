interface Vehi_cle {
    void rent();
    void returnVehicle();
}

class Car implements Vehi_cle {
    public void rent() {
        System.out.println("Car rented");
    }
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

class Bike implements Vehi_cle {
    public void rent() {
        System.out.println("Bike rented");
    }
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehi_cle v = new Car();
        v.rent();
        v.returnVehicle();
    }
}

