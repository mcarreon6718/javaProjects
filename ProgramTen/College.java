//Maranatha Smith
//Java Programming
//May 2, 2020
//Edit: February 22, 2021
//College Class program to create person objects 
import java.util.*;
public class College {
    //declaration of scanner object inorder to get input.
    static Scanner keyboard = new Scanner(System.in);
    // declare fiels of userChoice to be used in program. edit 2/2021
    private static int userChoice;

    public static void main(final String[] args) {
        //Main method; declare variable for the users choice of account to create.
        // int userChoice; edit 2/2021



      // Switch statement to call methods to create one of the sub classes of the Person Class.
         while(true){
             printInstructions(); // while loop and printInstructions method edit 2/2021
            switch(userChoice) {
                case  1:
                getStudentAttributes();
                break;
                case 2:
                getInstructorAttributes();
                break;
                case 3:
                getEmployeeAttributes();
                break;
                case 4:
                System.out.println("Ending the Program.");
                System.exit(0);
                default:
                System.out.println("Pleas Enter a choice of 1, 2, 3, or 4.");
                break;
                }
            }
        // Welcome message for the program
        // Keyboard used to get choice of which account to created in the person super class.
        // System.out.println("Welcome to the College Directory Program.");
        // System.out.println("You are able to create a new entry in the directory with the program.");
        // System.out.println("What category of account will this be: ");
        // System.out.println("(1) Student ");
        // System.out.println("(2) Instructor ");
        // System.out.println("(3) Employee or ");
        // System.out.println("(4) Exit.");
        // userChoice = keyboard.nextInt();
        
            

        
    }

public static int printInstructions() {

    System.out.println("Welcome to the College Directory Program.");
    System.out.println("You are able to create a new entry in the directory with the program.");
    System.out.println("What category of account will this be: ");
    System.out.println("(1) Student ");
    System.out.println("(2) Instructor ");
    System.out.println("(3) Employee or ");
    System.out.println("(4) Exit.");
    return userChoice = keyboard.nextInt();

}


//     public static void getUserChoice(int userChoice) {
//          while(true){
//              printInstructions(); // while loop and printInstructions method edit 2/2021
//             switch(userChoice) {
//                 case  1:
//                 getStudentAttributes();
//                 break;
//                 case 2:
//                 getInstructorAttributes();
//                 break;
//                 case 3:
//                 getEmployeeAttributes();
//                 break;
//                 case 4:
//                 System.out.println("Ending the Program.");
//                 System.exit(0);
//                 default:
//                 System.out.println("Pleas Enter a choice of 1, 2, 3, or 4.");
//                 break;
//                 }
//             }
//
//
//     }

    public static void getStudentAttributes() {
        //Creation of a new student object.
        Student newStudent = new Student();
        //Gathering the user input for the super class Person through the subclass Student through inheritence.
        System.out.println("Please Enter the First Name: ");
        newStudent.setFirstName(keyboard.next());
        System.out.println("Please Enter the Last Name: ");
        newStudent.setLastName(keyboard.next());
        System.out.println("Please Enter the Email Address: ");
        newStudent.setEmailAddress(keyboard.next());
        //getthing the user input for the Student specific data.
        System.out.println("Please Enter the Student ID: ");
        newStudent.setStudentID(keyboard.nextInt());
        System.out.println("Please Enter the Student's Major: ");
        newStudent.setStudentMajor(keyboard.next());
        System.out.println("Please Enter the Student's Level (Freshman, Sophomore, Junior, or Senior): ");
        newStudent.setStudentLevel(keyboard.next());
        System.out.println("Thank you. Creating Student Account.");
        //Printing out the Student account information.
        System.out.println("Student ID: " + newStudent.getStudentID());
        System.out.println("Name: " + newStudent.getFirstName() + " " + newStudent.getLastName());
        System.out.println("Email: " + newStudent.getEmailAddress());
        System.out.println("Major: " + newStudent.getStudentMajor());
        System.out.println("Level: " + newStudent.getStudentLevel());
    }
    public static void getInstructorAttributes() {
        //Creation of a new Instructor Object under the Person Super class
        Instructor newInstructor = new Instructor();
        //Gathering input of the Person super class through the sub class inheritence.
        System.out.println("Please Enter the First Name: ");
        newInstructor.setFirstName(keyboard.next());
        System.out.println("Please Enter the Last Name: ");
        newInstructor.setLastName(keyboard.next());
        System.out.println("Please Enter the Email Address: ");
        newInstructor.setEmailAddress(keyboard.next());
        //Gathering the Sub class specific information for the Instructor Class
        System.out.println("Please Enter the Instructor ID: ");
        newInstructor.setInstructorID(keyboard.nextInt());
        System.out.println("Please Enter the Instructor's Subject Area: ");
        newInstructor.setSubjectArea(keyboard.next());
        System.out.println("Please Enter the Instructor's Tenure: ");
        newInstructor.setYearsTenure(keyboard.nextInt());
        System.out.println("Thank you. Creating Instructor Account.");
        //Prints out the gathered Instructor account information.
        System.out.println("Instructor ID: " + newInstructor.getInstructorID());
        System.out.println("Name: " + newInstructor.getFirstName() + " " + newInstructor.getLastName());
        System.out.println("Email: " + newInstructor.getEmailAddress());
        System.out.println("Subject Area: " + newInstructor.getSubjectArea());
        System.out.println("Years Tenured: " + newInstructor.getYearsTenure());

    }
    public static void getEmployeeAttributes() {
        //Creates a new Employee object under the Person Class.
        Employee newEmployee = new Employee();
        //Gathers the information forthe employee sub class under the person super class.
        System.out.println("Please Enter the First Name: ");
        newEmployee.setFirstName(keyboard.next());
        System.out.println("Please Enter the Last Name: ");
        newEmployee.setLastName(keyboard.next());
        System.out.println("Please Enter the Email Address: ");
        newEmployee.setEmailAddress(keyboard.next());
        //Gathers the information for the Employee specific class details.
        System.out.println("Please Enter the Employee ID: ");
        newEmployee.setEmployeeID(keyboard.nextInt());
        System.out.println("Please Enter the Employee's Department: ");
        newEmployee.setEmployeeDepartment(keyboard.next());
        System.out.println("Please Enter the Employee's years of Sevice: ");
        newEmployee.setYearsOfService(keyboard.nextInt());
        //Prints out the information for the employee object.
        System.out.println("Thank you. Creating Employee Account");
        System.out.println("Employee ID: " + newEmployee.getEmployeeID());
        System.out.println("Name: " + newEmployee.getFirstName() + " " + newEmployee.getLastName());
        System.out.println("Email: " + newEmployee.getEmailAddress());
        System.out.println("Department: " + newEmployee.getEmployeeDepartment());
        System.err.println("Years Served: " + newEmployee.getYearsOfService());
    }
}
