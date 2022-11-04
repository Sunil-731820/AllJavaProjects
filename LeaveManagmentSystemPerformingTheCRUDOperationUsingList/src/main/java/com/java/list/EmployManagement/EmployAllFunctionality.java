package com.java.list.EmployManagement;

// import jakarta.validation.OverridesAttribute.List;
import java.util.*;

import org.xml.sax.SAXException;

import javafx.scene.control.Label;
public class EmployAllFunctionality {

    public static List<Employ> showEmploy(){
        List<Employ> listOfEmploy = EmploySaveData.getListOfEmployData();
        System.out.println(listOfEmploy);
        return listOfEmploy;
    }

    public static String deleteEmployDataById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Leave Id");
        int leaveId = sc.nextInt();
        if(leaveId==0){
            System.out.println("Employ Does Not exist");
        }else{
             List<Employ> getAllEmployData =  EmploySaveData.getListOfEmployData();
             String[] myArray = new String[getAllEmployData.size()];
             getAllEmployData.toArray(myArray);
             System.out.println(myArray);
             Employ removeEmployData = getAllEmployData.remove(leaveId);
        }
        return "Employ Deleted Successfully";
    }

    public static String addEmploy(){
        List<Employ> getAddData = EmploySaveData.getListOfEmployData();
        Employ employ = new Employ(2000, "Abhisek", "abhisek@gmail.com", "66161626","2022-12-12", "CSE", 20, 20);
        getAddData.add(employ);
        System.out.println("The List Of Data After the Addition ");
        System.out.println(getAddData);
        return "Employ Added SuccessFully";
    }

    public static String updateEmploy(){
        List<Employ> gList = EmploySaveData.getListOfEmployData();
        
        return "Employ Data Are Updated SuccessFully";

    }

    public static void searchEmployDataById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Leave Id ");
        int leaveId = sc.nextInt();
        List<Employ> gList = EmploySaveData.getListOfEmployData();
       boolean found = gList.stream()
            .anyMatch(id -> id.getEmpId()==leaveId);
        if(found==true){
            System.out.println("Employ Data Are Present");
        }else{
            System.out.println("Employ Data Does Not Present");
        }
    }
    
}
