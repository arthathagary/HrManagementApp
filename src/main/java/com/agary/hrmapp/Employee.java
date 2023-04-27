/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agary.hrmapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author arthathagary
 */
public class Employee {
    private int epfNumber;
    private String name;
    private String designation;
    private String department;

    public Employee(int epfNo,String name,String desi,String dep) {
        this.epfNumber = epfNo;
        this.name = name;
        this.designation = desi;
        this.department = dep;
    }

    public Employee() {
    }
    
    //Getter

    public int getEpfNumber() {
        return epfNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setEpfNumber(int epfNumber) {
        this.epfNumber = epfNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public static void writeFile(ArrayList<Employee> employees, String fileName) {
        
            try {
                FileWriter fw = new FileWriter(fileName,true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Employee emp : employees){
                bw.write(String.valueOf(emp.getEpfNumber())+" "+ emp.getName()+" "+emp.getDepartment()+" "+emp.getDesignation() + "\n");
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Successfully wrote to the file.", "Register Form", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException e){
                System.out.println(e);
            }
        }   
    
    public void showEmployeeDetails(String searchEmpDetail){
                try {
                    HrManager hrMnr = new HrManager();
                    hrMnr.searchEmployee("/Users/arthathagary/Documents/ICBT Docs/Assesments/HrmAppTxtFiles/employeesDetails.txt", searchEmpDetail);
                } catch (IOException ex) {
                    Logger.getLogger(HrManagerPage.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    public ArrayList<String> getWholeEpfNum() {
        ArrayList<String> epfNums = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/arthathagary/Documents/ICBT Docs/Assesments/HrmAppTxtFiles/employeesDetails.txt"))) {
            String line,epf;
            String[] emp = null;
            while ((line = reader.readLine()) != null) {
                emp = line.split(" ");
                epf = emp[0];
                epfNums.add(epf);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading departments from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return epfNums;
    }
    
    
}
