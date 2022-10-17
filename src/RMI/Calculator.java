/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMI;

import java.rmi.*;

/**
 *
 * @author ADMIN
 */
public interface Calculator extends UnicastRemoteObject implements CalInf
        
{
       public int addNum(int a,int b) throws RemoteException;


}
