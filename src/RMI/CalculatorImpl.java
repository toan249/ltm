/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

import java.rmi.*;

public class CalculatorImpl implements Calculator {
    public int add(int a,int b) throws RemoteException {
    System.out.println("Client request to calculate");
    return (a+b);
    }
    
   
    @Override
    public int addNum(int a, int b) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}