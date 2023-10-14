package session1;

import java.io.File;

public class Fileexitdemo {
	public static void main(String[] args) throws Exception {
		File f = new File("abcDemo1.txt");
		System.out.println(f.exists());

	}
}
