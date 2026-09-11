import java.util.Scanner;
public class ParcelIntake {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String command = "NEXT";
    int accepted = 0;
    while (command.equals("NEXT")) {
      System.out.print("Parcel ID and weight: ");
      String parcelId = sc.next();
      double weight = sc.nextDouble();
      if (!parcelId.isBlank() && weight > 0 && weight <= 25) {
        accepted++;
        System.out.println("Accepted");
      } else {
        System.out.println("Rejected");
      }
      System.out.print("NEXT or STOP: ");
      command = sc.next().trim().toUpperCase();
    }
    System.out.println("Accepted = " + accepted);
    sc.close();
  }
}