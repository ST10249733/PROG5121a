/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture10_bills;


public class bill {
    private String strCustomer; 
    private double dblMinutes; 
    private double dblCost; 
    
    //constructor recieving variables 
    public bill(String strName, double dblMinutes, double dblCostPerMinute, double dblMinutesTalked){
        strCustomer = strName; 
        dblMinutes = dblMinutesTalked; 
        dblCost = dblCostPerMinute;
        
    }
    public String getName(){
        return strCustomer;
    }
    public double getTotalBiills (){
        return (dblMinutes * dblCost);
    }
}
