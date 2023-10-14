package session3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\Anvit\\Desktop\\duragasir\\abc.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch1= {'a','b','c','d'};
        bw.write(ch1);
        bw.newLine();
        bw.write("durga");
        bw.newLine();
        bw.write("software solution");
        bw.flush();
        bw.close();
        
        
	}

}
