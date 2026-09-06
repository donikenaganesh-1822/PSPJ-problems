import java.util.Scanner;

public class SmartLockerBatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        // Created a named variable for capacity set to 25
        final int MAX_CAPACITY = 25; 

        do {
            System.out.print("Enter parcel weight: ");
            double weight = sc.nextDouble();

            // Using the variable instead of a hardcoded number
            if (weight <= MAX_CAPACITY) {
                System.out.println("Accepted");
            } else {
                System.out.println("Rejected: overweight");
            }

            System.out.print("Another parcel (Y/N)? ");
            choice = sc.next().toUpperCase().charAt(0);
        } while (choice == 'Y');

        sc.close();
    }
}
