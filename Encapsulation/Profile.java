package Encapsulation;

public class Profile {

    //these fields are made private to prevent direct access to data
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public Profile(String firstName, String lastName, int age, String email){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setEmail(email);
    }

    //setter methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }   
    public void setAge(int age){
        this.age = age;
    }    
    public void setEmail(String email){
        this.email = email;
    }    

    //getter methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }   
    public int getAge(){
        return this.age;
    }    
    public String getEmail(){
        return this.email;
    }    
}
