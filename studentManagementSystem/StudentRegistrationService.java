package studentManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRegistrationService {
     HashMap<String,StudentInfo> studentMap = new HashMap<>();
     Scanner sc = new Scanner(System.in);
     // add student.
     public void addStudent() {
    	 StudentInfo studentInfo = new StudentInfo();
    	 System.out.println("enter the student id:");
    	 String id = sc.nextLine();
    	 if(studentMap.containsKey(id)) {
    	        System.out.println("Student ID already exists. Please use a different ID.");
    	        return;
    	    }
    	 studentInfo.setStudent_id(id);
    	 System.out.println("enter student name:");
    	 studentInfo.setStudent_name(sc.nextLine());
    	 System.out.println("enter the student marks:");
    	 studentInfo.setStudent_marks(sc.nextInt());
    	 sc.nextLine(); // new line
    	 // adding student details into hash map.
    	 studentMap.put(studentInfo.getStudent_id(),studentInfo);
    	 System.out.println("student registered successfully");
     }
     public void updateStudent() {
    	 System.out.println("enter the student id to update:");
    	 String studentId = sc.nextLine();
    	 if(studentMap.containsKey(studentId)) {
    		 StudentInfo s = studentMap.get(studentId);
    		 System.out.println("enter the student name:");
    		 s.setStudent_name(sc.nextLine());
    		 System.out.println("enter the student marks:");
    		 s.setStudent_marks(sc.nextInt());
    		 System.out.println("student updated");
    	 }
    	 else {
    		 System.out.println("student not found");
    	 }
     }
     public void deleteStudent() {
    	 System.out.println("enter the student id to delete:");
    	 String studentId = sc.nextLine();
    	 if(studentMap.remove(studentId)!= null) {
    		 System.out.println("student deleted Successfully");
    		 
    	}
    	 else {
    		 System.out.println("student not found");
    	 }
     }
     public void viewStudents() {
    	 if(studentMap.isEmpty()) {
    		 System.out.println("No students found..");
    		 return;
    	 }
    	 System.out.println("-----------All STUDENT DETAILS-------------");
    	 for(Map.Entry<String,StudentInfo>entry:studentMap.entrySet()) {
    		 String key = entry.getKey();
    		 StudentInfo values = entry.getValue();
    		 System.out.println("key:"+key+"  values:"+values);
    		 
    	 }
     }
	
}


