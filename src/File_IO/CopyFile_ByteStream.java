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

public class CopyFile_ByteStream {
    public static void main(String as[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("input.txt");
            out =new FileOutputStream("output.txt");
            int c;
            while((c = in.read()) != -1) {
            out.write(c);
            }
        }
        catch(FileNotFoundException f) {
            f.printStackTrace();
        }
        finally {
            if(in != null)
                in.close();
            if(out != null)
                out.close();
        }
    }
}
