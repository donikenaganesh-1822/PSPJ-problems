import java.util.Scanner;
public class LockerDoWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char another;
    int allocated = 0;
    do {
      System.out.print("Parcel weight: ");
      double weight = sc.nextDouble();
      if (weight > 0 && weight <= 15) {
        allocated++;
        System.out.println("Locker allocated");
      } else {
        System.out.println("Parcel deferred");
      }
      System.out.print("Another parcel (Y/N): ");
      another = sc.next().trim().toUpperCase().charAt(0);
    } while (another == 'Y');
    System.out.println("Allocated = " + allocated);
    sc.close();
  }
}