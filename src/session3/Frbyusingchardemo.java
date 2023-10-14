package session3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Frbyusingchardemo {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Anvit\\Desktop\\duragasir\\abc.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char ch1:ch){
			System.out.println(ch1);
		}

	}

}
