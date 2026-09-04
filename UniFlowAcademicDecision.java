public class UniFlowAcademicDecision {
    static void classify(int credits) {
        if (credits == 4) System.out.println("Core Course");
    }

    static void result(int internal, int external) {
        if (internal >= 20 && internal <= 40 &&
            external >= 30 && external <= 60)
            System.out.println("Student Passed");
        else
            System.out.println("Student Failed");
    }

    static void verify(int id, String name, String dept) {
        if (id == 101) {
            if (name.equals("Sreeja")) {
                if (dept.equals("CSE"))
                    System.out.println("Record Found");
                else
                    System.out.println("Department mismatch");
            } else {
                System.out.println("Name mismatch");
            }
        } else {
            System.out.println("Student ID not found");
        }
    }

    public static void main(String[] args) {
        classify(4);
        result(20, 30);
        verify(101, "Sreeja", "CSE");
    }
}