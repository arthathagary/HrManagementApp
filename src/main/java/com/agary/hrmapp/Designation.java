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
public class Designation {
    private int desiNo;
    private String desiName;
    
    public Designation(int desiNo,String desiName){
        this.desiNo = desiNo;
        this.desiName = desiName;
    }
    
    public int getDesiNo(){
        return desiNo;
    }
    public String getDesiName(){
        return desiName;
    }
    
    public static void writeFile(ArrayList<Designation> designations, String fileName) {
        
            try {
                FileWriter fw = new FileWriter(fileName,true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Designation desi : designations){
                bw.write(String.valueOf(desi.getDesiNo())+" "+ desi.getDesiName()+ "\n");
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Successfully wrote to the file.", "Register Form", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException e){
                System.out.println(e);
            }
        }   
}
