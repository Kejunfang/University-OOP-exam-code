package hospital_management_system;

import java.util.*;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        Doctor doctor = new Doctor("Hill Zhang", "yes");
        AmenitManager amenitmanager = new AmenitManager("Fan LinXiang");
        TreatmentHistory treatment_history = new TreatmentHistory();
        Pharmacy pharmacy = new Pharmacy();
        List<String> patients = new ArrayList<>();
        
        amenitmanager.initial_room();
        pharmacy.initial_medicines();
        treatment_history.initial_infomation();
        
        while(running){
        System.out.println("\n------------Hospital System---------------");
        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.println("3. Amenit Manager");
        System.out.println("4. Exit");
        System.out.print("Select : ");
        String usertype = sc.nextLine();
        switch(usertype){
            case"1"://Doctor
                System.out.print("\nEnter username: ");
                String typing_doctorname = sc.nextLine();
                if(doctor.getdoctorname().equals(typing_doctorname)){
                    boolean doctor_active = true;
                    while(doctor_active){
                        System.out.println("\n----------Doctor Page--------------");
                        System.out.println("1. Edit Admission");
                        System.out.println("2. Add Medicine");
                        System.out.println("3. Exit");
                        System.out.print("\nSelect: ");
                        String doctor_behavior = sc.nextLine();
                        switch(doctor_behavior){
                            case"1"://edit admission
                                treatment_history.view_admission();
                                System.out.print("Which admission you want to edit: ");
                                int select_admission_index = sc.nextInt() - 1;
                                sc.nextLine();
                                if(select_admission_index >= 0 && select_admission_index < treatment_history.getadmissionslist().size()){
                                    Admission selected_admission = treatment_history.getadmissionslist().get(select_admission_index);
                                    treatment_history.view_full_admission(selected_admission);
                                    pharmacy.view_allmedicine();
                                    System.out.print("\nPresribed Medicine: ");
                                    String medicine_need = sc.nextLine();
                                    System.out.print("Treatment plan: ");
                                    String given_plan = sc.nextLine();
                                    System.out.print("Total Bill: ");
                                    int total_bill = sc.nextInt();
                                    sc.nextLine();
                                    treatment_history.edit_admission(selected_admission, medicine_need, given_plan, total_bill);
                                    treatment_history.view_full_admissioin_after(selected_admission);
                                }
                                else{
                                    System.out.println("\nInvalid Input, try again");
                                }
                                break;
                            case"2"://add medicine
                                System.out.print("Enter medicine name: ");
                                String new_medicine_n = sc.nextLine();
                                System.out.print("Enter Price: ");
                                String new_medicine_p = sc.nextLine();
                                System.out.print("Availability: ");
                                String new_medicine_a = sc.nextLine();
                                System.out.print("Stock: ");
                                int new_medicine_s = sc.nextInt();
                                sc.nextLine();
                                pharmacy.add_medicine(new Medicine(new_medicine_n, new_medicine_p,new_medicine_a,new_medicine_s));
                                break;
                            case"3"://Exit
                                doctor_active = false;
                                break;
                            default:
                                System.out.println("\nInvalid input");
                        }
                    }
                }
                else{
                    System.out.println("\nYou are not doctor, try again later");
                }
                break;
            case"2"://Patient
                System.out.print("\nEnter username: ");
                String patient_name = sc.nextLine();
                Patient patient = new Patient(patient_name);
                patients.add(patient_name);
                boolean patient_active = true;
                while(patient_active){//patient
                   System.out.println("\n----------Patients Page--------------");
                   System.out.println("1. View Doctor availability");
                   System.out.println("2. Make appointment");
                   System.out.println("3. Check Medicine details");
                   System.out.println("4. Exit");
                   System.out.print("\nSelect: ");
                   String user_behavior = sc.nextLine();
                   switch(user_behavior){
                       case"1":
                           doctor.viewDoctoravai();
                           break;
                       case"2":
                           System.out.print("What is your name: ");
                           String assign_p_name = sc.nextLine();
                           System.out.print("How old are you: ");
                           String assign_p_age = sc.nextLine();
                           System.out.print("Gender: ");
                           String assign_p_gender = sc.nextLine();
                           System.out.print("What is your case: ");
                           String assign_p_case = sc.nextLine();
                           doctor.viewDoctoravai();
                           System.out.print("\nAssign Doctor: ");
                           String assign_p_doctorname = sc.nextLine();
                           System.out.print("Admission Date: ");
                           String assign_p_admissiondate = sc.nextLine();
                           treatment_history.add_amission(new Admission(assign_p_name,assign_p_age,assign_p_gender,assign_p_case,assign_p_admissiondate,assign_p_doctorname));
                           
                           break;
                       case"3":
                           pharmacy.view_allmedicine();
                           break;
                       case"4":
                           patient_active = false;
                           break;
                       default:
                           System.out.println("\nInvalid Input, try again");
                    }
                }
                break;
            case"3"://Amenit Manager
                System.out.print("Enter username: ");
                String amenit_username = sc.nextLine();
                if(amenitmanager.getusername().equals(amenit_username)){
                    boolean amenit_active = true;
                    while(amenit_active){
                        System.out.println("-------------Admenit Manager------------");
                        System.out.println("1. Assign amenity to room");
                        System.out.println("2. Remove amenity to room");
                        System.out.println("3. List amenity");
                        System.out.println("4. Exit");
                        System.out.print("Select: ");
                        String amenit_behavior = sc.nextLine();
                        switch(amenit_behavior){
                            case"1":
                                amenitmanager.view_the_room();
                                System.out.print("\nSelect a room to add amenit: ");
                                int Select_room = sc.nextInt()-1;
                                sc.nextLine();
                                if(Select_room>= 0 && Select_room<amenitmanager.getrooms().size()){
                                    Room select_room = amenitmanager.getrooms().get(Select_room);
                                    System.out.print("What amenit you want to add: ");
                                    String add_amenit = sc.nextLine();
                                    amenitmanager.add_amenit(select_room,add_amenit );
                                }
                                else{
                                    System.out.println("\nInvalid Input");
                                }
                                break;
                            case"2":
                                amenitmanager.view_the_room();
                                System.out.print("\nSelect a room to remove amenit: ");
                                int Select_remove_room = sc.nextInt()-1;
                                sc.nextLine();
                                if(Select_remove_room>= 0 && Select_remove_room<amenitmanager.getrooms().size()){
                                    Room select_remove_room = amenitmanager.getrooms().get(Select_remove_room);
                                    System.out.print("What amenit you want to add: ");
                                    String remove_amenit = sc.nextLine();
                                    amenitmanager.remove_amenit(select_remove_room, remove_amenit);
                                }
                                else{
                                    System.out.println("\nInvalid Input");
                                }
                                break;
                            case"3":
                                amenitmanager.view_the_room_full();
                                break;
                            case"4":
                                amenit_active = false;
                                break;
                            default:
                                System.out.println("\nInvalid input!");
                        }
                    }
                }
                else{
                    System.out.println("\nInvalid input, try again");
                }
                break;
            case"4":
                System.out.println("\n----------See you again-----------");
                running = false;
                break;
            default:
                System.out.println("\nWrong input , try again");
        }  
        }
    }
}