package session1;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws Exception {
		File f=new File("abcDemo.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}

}
