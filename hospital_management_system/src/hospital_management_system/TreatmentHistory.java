package hospital_management_system;
import java.util.*;


public class TreatmentHistory{
    private List<Admission> admissions = new ArrayList<>();
    
    //initial information
    public void initial_infomation(){
        admissions.add(new Admission("Andrew Zhang","15","Male","head ache","4/1/2024","Hill Zhang"));
    }
    
    //add amission
    public void add_amission(Admission admission){
        admissions.add(admission);
        System.out.println("\nAdd success!");
    }
    
    public void view_admission(){
        System.out.println("\n-----------Admission List--------------");
        for(int i = 0; i < admissions.size();i++){
            System.out.println((i+1)+". "+admissions.get(i).getpatient_name()
            +"\nCase: "+admissions.get(i).getpatient_case());
        }
    }
    
    public List<Admission> getadmissionslist(){
        return admissions;
    }
    
    public void view_full_admission(Admission admission){
        admission.view_full_admission_before_edit();
    }
    
    public void edit_admission(Admission admission,String medicine, String plan, int bill){
        admission.edit_admission(medicine,plan,bill);
        System.out.println("\nSuccessful Add!!!");
    }
    
    public void view_full_admissioin_after(Admission admission){
        admission.view_full_admission_after_edit();
    }
    
}