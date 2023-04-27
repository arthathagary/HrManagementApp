/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agary.hrmapp;

import java.io.IOException;

/**
 *
 * @author arthathagary
 */
public class HrAssistant extends Hr{
    
    public HrAssistant(String fileName,String searchTerm) throws IOException{
        super.searchEmployee(fileName, searchTerm);
    }
    
    public HrAssistant() {
        super.viewEmployees();
    }
    
}
