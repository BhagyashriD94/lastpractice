package session4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\Anvit\\Desktop\\New folder\\abc1.txt");
		PrintWriter out=new PrintWriter(fw);
		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("shree");
		out.flush();
		out.close();
		

	}

}
