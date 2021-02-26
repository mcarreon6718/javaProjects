//Maranatha Smith
//Java Programming
//May 2, 2020
//Edit: February 22, 2021
//Student sub class to person super class
public class Student extends Person {
    //Private variables for studentID, Major, and Level
    private int studentID;
    private String studentMajor;
    private String studentLevel;
    //Public methods to access the private variables of the student class.
    public int getStudentID() {
        return studentID;
    }
    public String getStudentMajor() {
        return studentMajor;
    }
    public String getStudentLevel() {
        return studentLevel;
    }
    public void setStudentID(int studID) {
        studentID = studID;
    }
    public void setStudentMajor(String studMaj) {
        studentMajor = studMaj;
    }
    public void setStudentLevel(String studLvl) {
        studentLevel = studLvl;
    }
    public void display(){
        System.out.println(super.getFirstName());
    }
}
