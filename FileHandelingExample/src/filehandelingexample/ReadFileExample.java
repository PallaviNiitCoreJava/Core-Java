package filehandelingexample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFileExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {

//        System.out.println("Enter Name of File : ");
//        String x=new Scanner (System.in).next();
        
//        FileInputStream fis = new FileInputStream("Demo.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
        
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("Demo.txt")
                )
        );

        String str=null;
        str= br.readLine();
        
        while(!(str==null))
        {
            System.out.println(str);
            str= br.readLine();
        }
       br.close();
    }

}
