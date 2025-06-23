package hospital_management_system;

public class Admission{
    private String patient_name;
    private String patient_age;
    private String patient_gender;
    private String patient_case;
    private String admission_date;
    private String assign_doctor;
    private String prescribed_medicine;
    private String treatment_plan;
    private int total_bill;
    
    public Admission(String patient_name, String patient_age, String patient_gender, String patient_case , String admission_date, String assign_doctor ){
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_gender = patient_gender;
        this.patient_case = patient_case;
        this.admission_date = admission_date;
        this.assign_doctor = assign_doctor;
    }
    
    public String getpatient_name(){
        return patient_name;
    }
    public String getpatient_case(){
        return patient_case;
    }
    
    public String getpatient_age(){
        return patient_age;
    }
    public String getpatient_gender(){
        return patient_gender;
    }
    public String getadmissioin_date(){
        return admission_date;
    }
    public String getassign_doctor(){
        return assign_doctor;
    }
    public String getprescribed_medicine(){
        return prescribed_medicine;
    }
    public String gettreatment_plan(){
        return treatment_plan;
    }
    public int gettotal_bill(){
        return total_bill;
    }
    
    public void view_full_admission_before_edit(){
        System.out.println("\n----------------Details-----------------");
        System.out.println("Name: "+patient_name);
        System.out.println("Age: "+ patient_age);
        System.out.println("Gender: "+patient_gender);
        System.out.println("Case: "+patient_case);
        System.out.println("Admission Date: "+ admission_date);
        System.out.println("Assigned Doctor: "+ assign_doctor);
        
    }
 
    public void edit_admission(String medicine, String plan, int bill){
        prescribed_medicine = medicine;
        treatment_plan = plan;
        total_bill = bill;
    }
    
    public void view_full_admission_after_edit(){
        System.out.println("\n----------------Details-----------------");
        System.out.println("Name: "+patient_name);
        System.out.println("Age: "+ patient_age);
        System.out.println("Gender: "+patient_gender);
        System.out.println("Case: "+patient_case);
        System.out.println("Admission Date: "+ admission_date);
        System.out.println("Assigned Doctor: "+ assign_doctor);
        System.out.println("Presribed Medicine"+ prescribed_medicine);  
        System.out.println("Treatment Plan: "+treatment_plan);
        System.out.println("Total Bill: "+ total_bill);
    }
    
}