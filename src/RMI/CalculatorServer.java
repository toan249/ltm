/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

import java.nio.channels.AlreadyBoundException;
import java.rmi.*;


public class CalculatorServer {
    public static void main(String[] args) throws AlreadyBoundException {
        try{
        //tao doi tuong CalculatorImpl
        CalculatorImpl cal= new CalculatorImpl();
        System.out.println("Exporting Calculator ! ");
        
        //dang ky doi tuong voi trinh quan ly rmi
        Naming.bind("rmi://localhost/cal", cal);
        System.out.println("Register Calculator!");
        } catch(Exception e)
        { System.out.println(e); }
    }
}