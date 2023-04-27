/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agary.hrmapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author arthathagary
 */
public class Department {
    private int depNo;
    private String name;

    
    public Department(int depNo, String name){
        this.depNo = depNo;
        this.name = name;
    }
    
    public Department(){
    }
    
    //Getter
    
    public int getDepNo(){
        return depNo;
    }
    public String getDepName(){
        return name;
    }
    
    public static void writeFile(ArrayList<Department> departments, String fileName) {
        
            try {
                FileWriter fw = new FileWriter(fileName,true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Department dep : departments){
                bw.write(String.valueOf(dep.getDepNo())+" "+ dep.getDepName()+ "\n");
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Successfully wrote to the file.", "Register Form", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException e){
                System.out.println(e);
            }
        } 
    
//    public ArrayList<String> getWholeDepartment() {
//        ArrayList<String> departments = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/arthathagary/Documents/ICBT Docs/Assesments/HrmAppTxtFiles/departmentDetails.txt"))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                departments.add(line);
//            }
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, "Error reading departments from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        return departments;
//    }
    
}
