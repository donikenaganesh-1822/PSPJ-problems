public class SmartLockerDecision {
    static int capacity(char size) {
        return switch (size) {
            case 'S' -> 5;
            case 'M' -> 15;
            case 'L' -> 25;
            default -> -1;
        };
    }

    static void checkParcel(char size, double weight) {
        int limit = capacity(size);

        if (limit == -1)
            System.out.println("Rejected: unknown size");
        else if (weight <= 0)
            System.out.println("Rejected: invalid weight");
        else if (weight <= limit)
            System.out.println("Accepted");
        else
            System.out.println("Rejected: overweight");
    }

    public static void main(String[] args) {
        checkParcel('M', 15.0);
    }
}
