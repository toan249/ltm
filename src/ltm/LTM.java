
package ltm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class LTM {

    /**
      * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ServerSocket httpServer = new ServerSocket(8080);
        System.out.println("..... running 8080");
        while(true){
            Socket req = httpServer.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
            String line = br.readLine();
            while(!line.isEmpty()    ){
                System.out.println(line);
                line=br.readLine();
            }
            
            OutputStream out = req.getOutputStream();
            String str = "HTTP/1.1 200 OK \r\n\r\n";
            str+= "ASD";
            out.write(str.getBytes());
            
            
            br.close();
            out.close();
            req.close();
        }
        
    }
}
