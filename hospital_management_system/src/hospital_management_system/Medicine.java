package hospital_management_system;

public class Medicine{
    private String name;
    private String pricing;
    private String availability;
    private int stock;
    
    public Medicine(String name, String pricing,String availability, int stock){
        this.name = name;
        this.pricing = pricing;
        this.availability = availability;
        this.stock = stock;
    }
    
    public void display_medicine(){
        System.out.println("\nName: "+ name);
        System.out.println("Price: "+ pricing);
        System.out.println("Stock"+ stock);
    }
    
    public String getname(){
        return name;
    }
    public String getpricing(){
        return pricing;
    }
    public String getavailability(){
        return availability;
    }
    public int getstock(){
        return stock;
    }
    

}