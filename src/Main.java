import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int choice;

        while (true) {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    hospital.addPatient(name, age);
                    break;
                case 2:
                    hospital.viewPatients();
                    break;
                case 3:
                    System.out.print("Enter Patient ID: ");
                    int upId = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    String newName = sc.next();
                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    hospital.updatePatient(upId, newName, newAge);
                    break;
                case 4:
                    System.out.print("Enter Patient ID: ");
                    int delId = sc.nextInt();
                    hospital.deletePatient(delId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}