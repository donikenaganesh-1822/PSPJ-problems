public class UniFlowMenuTrace {
    public static void main(String[] args) {
        int choice = 9;

        switch (choice) {
            case 1:
                System.out.println("Register Student");
                 break;
            case 2:
                System.out.println("Academic Report");
                break;
            case 3:
                System.out.println("List Students");
                break;
            default:
                System.out.println("Unknown option");
        }      
        System.out.println("Menu completed");
    }
}