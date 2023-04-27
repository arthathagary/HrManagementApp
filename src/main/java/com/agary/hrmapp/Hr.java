/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agary.hrmapp;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arthathagary
 */
public class Hr {
    public void searchEmployee(String fileName,String searchVia) throws FileNotFoundException, IOException{
        
        
        try{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        boolean found = false;
        
        while ((line = bufferedReader.readLine()) != null) {
                // Split the line into individual fields
                String[] fields = line.split(" ");

                
                

                // Check if the search term matches any of the fields
                for (String field : fields) {
                    if (field.equalsIgnoreCase(searchVia)) {
                        JOptionPane.showMessageDialog(null, line);
                        System.out.println(line);
                        found = true;
                        break;
                    }
                }
            }
    }catch(HeadlessException | IOException ex){
            System.err.println(ex);
    }}
    
    public void viewEmployees(){
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        tableModel.addColumn("EPF Number");
        tableModel.addColumn("Employee Name");
        tableModel.addColumn("Department");
        tableModel.addColumn("Designation");
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/arthathagary/Documents/ICBT Docs/Assesments/HrmAppTxtFiles/employeesDetails.txt"))) {
            String line;
            int num = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                tableModel.insertRow(num, values);
                num++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      JFrame f = new JFrame();
      f.setSize(550, 350);
      f.add(new JScrollPane(table));
      f.setLocationRelativeTo(null);
      f.setVisible(true);
   }
}

