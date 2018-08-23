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

public class ReadConsole_InputStreamReader {
    public static void main(String as[]) throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            char c;
            System.out.println("Enter characters, enter 'q' to quit.");
            do{
                c = (char)cin.read();
                System.out.println(c);
            } while (c != 'q');
        }
        finally {
            if(cin != null)
                cin.close();
        }
    }
}
