package hospital_management_system;
import java.util.*;

public class AmenitManager{
    private String username;
    private List<Room> rooms = new ArrayList<>();
    
    public AmenitManager(String username){
        this.username = username;
    }
    
    public void initial_room(){
        rooms.add(new Room("0001"));
        rooms.add(new Room("0002"));
        rooms.add(new Room("0003"));
        rooms.add(new Room("0004"));
        rooms.add(new Room("0005"));
    }
    
    public void add_amenit(Room room,String amenity){
        room.add_amenities(amenity);
        System.out.println("\nAdd success");
    }
    
    public void remove_amenit(Room room , String amenity){
        room.remove_amenities(amenity);
        System.out.println("\nDelete success");
    }
    
    public List<Room> getrooms(){
        return rooms;
    }
    
    public String getusername(){
        return username;
    }
    
    public void view_the_room(){
        for(int i = 0; i < rooms.size();i++){
            System.out.println((i+1)+". "+rooms.get(i).getnumber());
        }
    }
    
    public void view_the_room_full(){
        System.out.println("\n------------Room List--------------");
        for(int i = 0; i < rooms.size();i++){
            System.out.println((i+1)+". "+rooms.get(i).getnumber()
            +"\nAmenit: "+rooms.get(i).getamenities());
        }
    }

}