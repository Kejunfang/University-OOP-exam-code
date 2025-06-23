package hospital_management_system;

public class Doctor{
    
    private String doctor_name;
    private String availability;

    //constructor
    public Doctor(String doctor_name , String availability){
        this.doctor_name = doctor_name;
        this.availability = availability;
    }
    
    //view doctor availability
    public void viewDoctoravai(){
        System.out.println("\nAvailable Doctor: ");
        System.out.println("\nDoctor: "+ doctor_name);
        System.out.println("Availability: "+availability);
    }
    
    //getter of name
    public String getdoctorname(){
        return doctor_name;
    }
}