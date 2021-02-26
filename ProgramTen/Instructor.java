//Maranatha Smith
//Java Programming
//May 2, 2020
//Instructor sub class to person super class
public class Instructor extends Person {
    //Private varialbes for the instructorID, Subject Area, and Years teaching. 
    private int instructorID;
    private String subjectArea;
    private int yearsTenure;
    //Public methods to access the private variables in the Instructor Class.
    public int getInstructorID() {
        return instructorID;
    }
    public String getSubjectArea() {
        return subjectArea;
    }
    public int getYearsTenure() {
        return yearsTenure;
    }
    public void setInstructorID(int instructID) {
        instructorID = instructID;
    }
    public void setSubjectArea(String subArea) {
        subjectArea = subArea;
    }
    public void setYearsTenure(int yearsTen) {
        yearsTenure = yearsTen;
    }
}