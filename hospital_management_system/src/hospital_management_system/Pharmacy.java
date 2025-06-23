package hospital_management_system;
import java.util.*;

public class Pharmacy{
    private List<Medicine> medicines = new ArrayList<>();
    
    //initial medicines details
    public void initial_medicines(){
        medicines.add(new Medicine("Paracetamol","Rm10 per pack","yes",50));
        medicines.add(new Medicine("Amoxicillin","Rm25 per pack","yes",50));
        medicines.add(new Medicine("Cough Syrup","Rm15 per pack","yes",50));
    }
    
    //getter of medicines
    public List<Medicine> getmedicines(){
        return medicines;
    }
    
    public void view_medicine(Medicine medicine){
        medicine.display_medicine();
    }
    
    public void view_allmedicine(){
        System.out.println("\n------------Medicine list:------------");
        for(int i = 0 ; i < medicines.size();i++){
            System.out.println((i+1)+". "+medicines.get(i).getname()
            +"\nPrice: "+medicines.get(i).getpricing()
            +"\nAvaibility: "+medicines.get(i).getavailability()
            +"\nStock: "+ medicines.get(i).getstock());
        }
    }
    
    public void add_medicine(Medicine medicine){
        medicines.add(medicine);
        System.out.println("\nAdd Success");
    }
}