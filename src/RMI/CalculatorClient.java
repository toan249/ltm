/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

import java.rmi.*;
public class CalculatorClient {
    public static void main(String[] args){
    try{
    System.out.println("Finding Object … ");
    // tim doi tuong tu xa theo ten dang ky
    Calculator cal= (Calculator)Naming.lookup ("rmi://localhost/cal");
    
    
    // trieu goi phuong thuc tu xa
    System.out.println(cal.addNum(10,20));
    } catch(Exception e) { System.out.println(e); }
    }
}
