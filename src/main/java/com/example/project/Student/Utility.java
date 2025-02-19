package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
    
    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i=0;i<list.size()-1;i++){
                String str1 = list.get(i).getLastName();
                String str2 = list.get(i+1).getLastName();
                if(str1.compareTo(str2) > 0){
                    sorted = false;
                    Student temp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                }else if(str1.compareTo(str2) == 0){
                    
                    String fn1 = list.get(i).getFirstName();
                    String fn2 = list.get(i+1).getFirstName();
                    if(fn1.compareTo(fn2) > 0){
                        sorted = false;
                        Student temp = list.get(i);
                        list.set(i,list.get(i+1));
                        list.set(i+1,temp);
                    }else if( fn1.compareTo(fn2) == 0){
                        double gpa1 = list.get(i).getGpa();
                        double gpa2 = list.get(i+1).getGpa();
                        if(gpa1 < gpa2){
                           Student temp = list.get(i);
                           list.set(i,list.get(i+1));
                           list.set(i+1,temp); 
                        }
                    }
                }
                System.out.println(list);
            }
        }
        return list;
    }


}
