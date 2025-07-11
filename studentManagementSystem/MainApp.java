package studentManagementSystem;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentRegistrationService service = new StudentRegistrationService();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Student Management System ---");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");

      int choice;

        do {
        	System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1: service.addStudent(); 
                        break;
                case 2: service.viewStudents();
                         break;
                case 3: service.updateStudent();
                          break;
                case 4: service.deleteStudent(); 
                           break;
                case 5: System.out.println("Exiting...");
                         break;
                default: System.out.println("Invalid choice.Please entter the proper choice number");
            }
        } while (choice != 5);
        sc.close();
    }
}
