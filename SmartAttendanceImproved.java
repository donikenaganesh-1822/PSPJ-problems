import java.util.Scanner;

public class SmartAttendanceImproved {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int processed = 0, skipped = 0;
    
    while (true) {
      System.out.print("Student ID (-1 to stop): ");
      int id = sc.nextInt();
      if (id == -1) break;
      
      System.out.print("Status (P/A/ML): ");
      String status = sc.next().trim().toUpperCase();
      
      // === ADDED VALIDATION FOR UNKNOWN STATUS ===
      if (!status.equals("P") && !status.equals("A") && !status.equals("ML")) {
        System.out.println("Invalid status entered. Record ignored.");
        continue; // Bypasses counters and restarts the loop for the next ID
      }
      // ===========================================
      
      if (status.equals("ML")) {
        skipped++;
        System.out.println("Medical leave skipped");
        continue;
      }
      
      processed++;
      System.out.println("Recorded " + id + " as " + status);
    }
    
    System.out.println("Processed=" + processed + ", Skipped=" + skipped);
    sc.close();
  }
}