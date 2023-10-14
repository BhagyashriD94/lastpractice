package session2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\Anvit\\Desktop\\duragasir\\abc.txt");
		fw.write(100);
		fw.write("urga\nSoftwaresolutions");
		fw.write('\n');
		char[]ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();
		fw.close();

	}

}
