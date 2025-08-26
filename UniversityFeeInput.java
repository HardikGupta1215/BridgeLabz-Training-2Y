import java.util.Scanner;

public class UniversityFeeInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Student Fee (INR): ");
            double fee = input.nextDouble();

            System.out.print("Enter Discount Percent: ");
            double discountPercent = input.nextDouble();

            double discount = (fee * discountPercent) / 100;
            double finalFee = fee - discount;

            System.out.println("The discount amount is INR " + discount 
                               + " and final discounted fee is INR " + finalFee);
        }
    }
}

