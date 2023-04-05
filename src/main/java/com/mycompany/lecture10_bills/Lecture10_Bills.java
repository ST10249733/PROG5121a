/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10_bills;
import javax.swing.*; 

public class Lecture10_Bills {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customer name: ");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog
            (null, "Enter the amount of minutes talked: "));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog
            (null, "Enter the cost per minute: "));
        
        //sends variables to constructor in the bills class
        bill b = new bill(strName, dblMinutesTalked, dblCostPerMinute);
        
        JOptionPane.showMessageDialog(null, "Customer name: " 
               + b.getName().toUpperCase()+"/n" 
            +"Total due: R" +b.getTotalBiills());
    }
}

