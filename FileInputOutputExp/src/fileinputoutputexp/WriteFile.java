package fileinputoutputexp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) throws IOException {
//        InputStreamReader isr= new InputStreamReader(System.in);        //char stream
//        BufferedReader br=new BufferedReader(isr);                      //string

        BufferedReader kinput = new BufferedReader(
                new InputStreamReader(System.in)
        );

//        FileOutputStream fos=new FileOutputStream("Demo.txt",true);
//        OutputStreamWriter osr=new OutputStreamWriter(fos);
//        BufferedWriter bw=new BufferedWriter(osr);
//        PrintWriter pr=new PrintWriter(bw);
        PrintWriter foutput = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("Demo.txt", true)
                        )
                )
        );

        System.out.println("Enter Name ");
        String str = kinput.readLine();

        while (!(str.equals("end"))) {
            foutput.write(str + "\n");
            str = kinput.readLine();
        }
        foutput.close();

    }
}
