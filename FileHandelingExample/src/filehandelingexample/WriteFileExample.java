package filehandelingexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteFileExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//        FileOutputStream fos=new FileOutputStream("Demo.txt");
//        OutputStreamWriter osw=new OutputStreamWriter(fos);
//        BufferedWriter bw=new BufferedWriter(osw);
//        PrintWriter pw=new PrintWriter(bw);

        PrintWriter fos=new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("Demo.txt",true)
                        )
                )
        );
        BufferedReader fis = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("Demo.txt")
                )
        );  
        BufferedReader kin=new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        String str;
        
        System.out.println("Writing File ........................");
        
        System.out.println("Enter a Line : ");
        str=kin.readLine();
        while(!(str.equals("end")))
        { 
            fos.write(str+". \n");
            System.out.println("Enter a Line : ");
            str=kin.readLine();   
        }
        fos.close();
        
        System.out.println("Reading File ........................");
        str= fis.readLine();
        
        while(!(str==null))
        {
            System.out.println(str);
            str= fis.readLine();
        }
       fis.close();
        
    }

}
