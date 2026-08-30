public class SelectionBasics {
    static void classifyCourse(int credits) {
        System.out.println("Course: PSPJ");
        if (credits == 4) {
            System.out.println("Core Course");
        }
        System.out.println("Registration step");
    }

    static void validateMobile(int mobileDigits) {
        if (mobileDigits == 10) {
            System.out.println("Approved");
        } else {
            System.out.println("Rejected");
        }
    }

    public static void main(String[] args) {
        classifyCourse(3);
        validateMobile(10);
    }
}