/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class Sclient {
    public static void main(String[] args) throws IOException{
        Socket req = new Socket("localhost",8080);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(req.getOutputStream()));
        String strReq = "";
        strReq += "GET / HTTP/1.1\r\n";
        strReq += "Host: localhost:8080\r\n";
        strReq += "User-Agent: Mozilla/5.0 \r\n";
        strReq += "Accept: text/*\r\n\r\n";
        
        bw.write(strReq);
        bw.newLine();
        bw.flush();
        
        InputStream is = req.getInputStream();
        byte[] data = new byte[1024];
        is.read(data);
        System.out.println(new String(data).trim());
        
        req.close();
    }
}
