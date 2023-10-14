package session3;

import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Anvit\\Desktop\\duragasir\\abc.txt");
          int i=fr.read();
          while(i!=-1) {
        	  System.out.println((char) i);
        	    i=fr.read();
          }
	}

}
