package com.java.list.EmployManagement;

import java.util.ArrayList;
import java.util.List;

public class EmploySaveData {
    public static List<Employ> getListOfEmployData(){
      List<Employ> listOfEmploy = new ArrayList<>();
      listOfEmploy.add(new Employ(1, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(10, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(100, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(101, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(102, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(103, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(104, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(105, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
      listOfEmploy.add(new Employ(1100, "SUnil", "Sunil@gmail.com", "1234567890", "2022-10-10", "Infinite", 10, 10));
        return listOfEmploy;
    }
    
}
