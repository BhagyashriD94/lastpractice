package session4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Filemerger {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("C:\\Users\\Anvit\\Desktop\\New folder\\abc2.txt");
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Anvit\\Desktop\\New folder\\abc1.txt"));
        String line=br.readLine();
        while(line!=null) 
        {
        	pw.println(line);
        	line=br.readLine();
        }
        br=new BufferedReader(new FileReader("C:\\Users\\Anvit\\Desktop\\New folder\\File.txt"));
        line=br.readLine();
        while(line!=null) 
        {
        	pw.println(line);
        	line=br.readLine();
        	}
        pw.flush();
        br.close();
        pw.close();
	}

}
