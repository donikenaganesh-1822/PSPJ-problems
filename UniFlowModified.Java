import java.util.Scanner;

public class UniFlowModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter course credits (1 to 4): ");
            int credits = sc.nextInt();

            // Checks credit limits step-by-step
            if (credits >= 1 && credits <= 4) {
                System.out.println("Registered Successfully");
            } else {
                System.out.println("Rejected: credits must be 1..4");
            }

            System.out.print("Enter another course (Y/N)? ");
            choice = sc.next().toUpperCase().charAt(0);
        } while (choice == 'Y');

        System.out.println("Session closed.");
        sc.close();
    }
}
