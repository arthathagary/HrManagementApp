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
import javax.swing.JOptionPane;

/**
 *
 * @author arthathagary
 */
public class FileManagement {
    public static void writeFile(ArrayList<HrManager> hrManagers, String fileName) {
        
            try {
                FileWriter fw = new FileWriter(fileName,true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (HrManager hr : hrManagers){
                bw.write(String.valueOf(hr.getHrId())+" "+ hr.getUserName()+ " " + hr.getPassword() +" "+hr.getType()+ "\n");
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Successfully wrote to the file.", "Register Form", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException e){
                System.out.println(e);
            }
        }   
    
    public boolean checkAvailability(String filename,String getInput) {

        boolean idFound = false;

        try {
            String[] words = null;

            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String FindLine;
            

            outerLoop:
            while ((FindLine = bufferedReader.readLine()) != null) {

                words = FindLine.split(" ");
                for (String Word : words) {
                    if (Word.equals(getInput)) {
                        idFound = true;
                    }
                }
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred Saving data" + e);
        }

        return idFound;
    }
}
