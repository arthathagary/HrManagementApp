/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agary.hrmapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arthathagary
 */
public class HrManager extends Hr{
    private int hrId;
    private String userName;
    private String password;
    private String type;
    
    public HrManager(int hrId, String userName, String password, String hrType){
        this.hrId = hrId;
        this.userName = userName;
        this.password = password;
        this.type = hrType;
    }
    
    public HrManager(String fileName,String searchTerm) throws IOException{
        super.searchEmployee(fileName, searchTerm);
    }

   
    
    public HrManager() {
        
    }
    
    public HrManager(String type){
        System.err.println(type);
        super.viewEmployees();
    }
    
    
    
    
    //Getter
    
    public int getHrId(){
        return hrId;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    public String getType(){
        return type;
    }
    
    //Setter
    public void setHrId(int hrId){
        this.hrId = hrId;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public void setType(String type){
        this.type = type;
    }
    
    public ArrayList<Department> addDepartment(int depNo,String depName){
        Department department = new Department(depNo,depName);
        ArrayList <Department> departments = new ArrayList<>();
        departments.add(department);
        return departments;
    }
    
    public ArrayList<Designation> addDesignation(int desiNo,String desiName){
        Designation designation = new Designation(desiNo,desiName);
        ArrayList <Designation> designations = new ArrayList<>();
        designations.add(designation);
        return designations;
    }
    
    public ArrayList<Employee> addEmployee(int epfNo,String empName,String empDepartment,String empDesignation){
        Employee employee = new Employee(epfNo,empName,empDepartment,empDesignation);
        ArrayList <Employee> employees = new ArrayList<>();
        employees.add(employee);
        return employees;
    }
    

    public void deleteDepartment(String filename, String searchTerm) {
        try {
            // Open the file for reading
            BufferedReader br = new BufferedReader(new FileReader(filename));
            
            // Open a temporary file for writing
            File tempFile = new File("/Users/arthathagary/Documents/ICBT Docs/Assesments/HrmAppTxtFiles/temp.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            
            // Read each line from the original file and write it to the temporary file
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                // If the current line contains the search term, do not write it to the temporary file
                if (!currentLine.contains(searchTerm)) {
                    bw.write(currentLine);
                    bw.newLine();
                }
            }
            
            // Close the readers and writers
            br.close();
            bw.close();
            
            // Delete the original file and rename the temporary file to the original file name
            File originalFile = new File(filename);
            if (originalFile.delete()) {
                tempFile.renameTo(originalFile);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public void deleteDesignation(String filename, String searchTerm) {
        try {
            // Open the file for reading
            BufferedReader br = new BufferedReader(new FileReader(filename));
            
            // Open a temporary file for writing
            File tempFile = new File("/Users/arthathagary/Documents/ICBT Docs/Assesments/HrmAppTxtFiles/temp2.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            
            // Read each line from the original file and write it to the temporary file
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                // If the current line contains the search term, do not write it to the temporary file
                if (!currentLine.contains(searchTerm)) {
                    bw.write(currentLine);
                    bw.newLine();
                }
            }
            
            // Close the readers and writers
            br.close();
            bw.close();
            
            // Delete the original file and rename the temporary file to the original file name
            File originalFile = new File(filename);
            if (originalFile.delete()) {
                tempFile.renameTo(originalFile);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public void deleteEmployee(String filename, String searchTerm) {
        try {
            // Open the file for reading
            BufferedReader br = new BufferedReader(new FileReader(filename));
            
            // Open a temporary file for writing
            File tempFile = new File("/Users/arthathagary/Documents/ICBT Docs/Assesments/HrmAppTxtFiles/temp3.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            
            // Read each line from the original file and write it to the temporary file
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                // If the current line contains the search term, do not write it to the temporary file
                if (!currentLine.contains(searchTerm)) {
                    bw.write(currentLine);
                    bw.newLine();
                }
            }
            
            // Close the readers and writers
            br.close();
            bw.close();
            
            // Delete the original file and rename the temporary file to the original file name
            File originalFile = new File(filename);
            if (originalFile.delete()) {
                tempFile.renameTo(originalFile);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }


    
   
   
    
}
