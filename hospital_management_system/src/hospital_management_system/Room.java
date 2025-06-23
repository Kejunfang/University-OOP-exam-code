/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital_management_system;
import java.util.*;

/**
 *
 * @author zhangjunyi
 */
public class Room {
   private String number;
   private List<String> amenities = new ArrayList<>();
   
   public Room(String number){
       this.number = number;
   }
   public void add_amenities(String name){
       amenities.add(name);
   }
   public void view_amenities(){
       for(int i = 0; i < amenities.size();i++){
           System.out.println((i+1)+". "+amenities.get(i));
       }
   }
   public String getnumber(){
       return number;
   }
   
   public void remove_amenities(String name){
       amenities.remove(name);
   }
   public List<String> getamenities(){
       return amenities;
   }
}
