package fileinputoutputexp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileInputOutputExp {
    public static void main(String[] args) throws IOException {
        /*
        InputStreamReader isr= new InputStreamReader(System.in);        //char stream
        BufferedReader br=new BufferedReader(isr);                      //string
        System.out.println("Enter Name ");
        String str=br.readLine();
        System.out.println(str);
        */
//        
//        FileInputStream fis=new FileInputStream("demo.txt");    //binary stream
//        InputStreamReader ir=new InputStreamReader(fis);        //char stream
//        BufferedReader fin=new BufferedReader(ir);              //char buffer or string
//     
        BufferedReader finput=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("demo.txt")
                )
        );
        
//        FileReader fr=new FileReader("demo.txt");
//        
//        String dataa=(String.valueOf(fr.read()));
//        System.out.println(dataa);

        String data=finput.readLine();
        while(data!=null)
        {
            System.out.println(data);
            data=finput.readLine();
        }
        
        finput.close();
    }
    
}
