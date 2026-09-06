import java.util.Scanner;

public class UniFlowBatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accepted = 0;
        
        
        for (int i = 1; i <= 5; i++) { 
            System.out.print("Course " + i + " credits: ");
            int credits = sc.nextInt();
            
            if (credits >= 1 && credits <= 4) {
                accepted++;
                System.out.println("Registered");
            } else {
                System.out.println("Rejected: credits must be 1..4");
            }
        }
        System.out.println("Accepted = " + accepted);
        sc.close();
    }
}