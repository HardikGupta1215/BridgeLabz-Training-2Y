import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double threshold = 40.0;

        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        System.out.print("Enter current temperature: ");
        double currentTemp = sc.nextDouble();

       
        if (isHighTemperature.test(currentTemp)) {
            System.out.println("ALERT: Temperature has crossed the safe threshold!");
        } else {
            System.out.println("Temperature is within normal range.");
        }

        sc.close();
    }
}
