public class DaysElapsed {
    public static void main(String[] args) {
        int month = 13;
        int day = 15;
        int total = day;
        boolean valid = true;

        switch (month) {
            case 12: total += 30; // November
            case 11: total += 31; // October
            case 10: total += 30; // September
            case 9:  total += 31; // August
            case 8:  total += 31; // July
            case 7:  total += 30; // June
            case 6:  total += 31; // May
            case 5:  total += 30; // April
            case 4:  total += 31; // March
            case 3:  total += 28; // February
            case 2:  total += 31; // January
            case 1:  break;
            default: valid = false;
        }

        if (valid) System.out.println("Day number = " + total);
        else System.out.println("Invalid month");
    }
}
