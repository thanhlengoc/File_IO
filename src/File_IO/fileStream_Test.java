/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_IO;

/**
 *
 * @author ThanhLe
 */
import java.io.*;

public class fileStream_Test {
    public static void main(String as[]) throws IOException {
        try {
            byte bWrite[] = {34,56,67,89,30,50};
            OutputStream os = new FileOutputStream("test.txt");
            for(int i=0; i<bWrite.length; i++)
                os.write(bWrite[i]);
            os.close();
            
            InputStream is= new FileInputStream("test.txt");
            int size = is.available();
            
            for(int j=0; j<size; j++) {
                System.out.print((char)is.read()+" ");
            }
            is.close();
        }
        catch(IOException e) {
            System.out.println("Exception");
        }
    }
}
