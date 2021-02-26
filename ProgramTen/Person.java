//Maranatha Smith
//Java Programming
//May 2, 2020
//Person Class

public class Person {
    //Variables to create a person with a first name, last name, and email address.
    private String firstName;
    private String lastName; 
    private String emailAddress;
    //Get and set methods to access the private variables for the person object.
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setFirstName(String fName){
        firstName = fName;
    }
    public void setLastName(String lName){
        lastName = lName;
    }
    public void setEmailAddress(String emailAdd){
        emailAddress = emailAdd;
    }

}