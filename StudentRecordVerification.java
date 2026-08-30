public class StudentRecordVerification {
    static void verify(int enteredId, String enteredName,
                       String enteredDept) {
        int knownId = 101;
        String knownName = "Sreeja";
        String knownDept = "CSE";

        if (enteredId == knownId) {
            if (enteredName.equals(knownName)) {
                if (enteredDept.equals(knownDept)) {
                    System.out.println("Record Found");
                } else {
                    System.out.println("Department mismatch");
                }
            } else {
                System.out.println("Name mismatch");
            }
        } else {
            System.out.println("Student ID not found");
        }
    }

    public static void main(String[] args) {
        verify(101, "Sreeja", "ECE");
    }
}


