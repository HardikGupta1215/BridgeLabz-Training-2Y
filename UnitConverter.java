interface Unit_Converter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

public class UnitConverter {
    public static void main(String[] args) {
        double km = 10;
        double miles = Unit_Converter.kmToMiles(km);
        System.out.println(km + " km = " + miles + " miles");

        double kg = 5;
        double lbs = Unit_Converter.kgToLbs(kg);
        System.out.println(kg + " kg = " + lbs + " lbs");
    }
}
