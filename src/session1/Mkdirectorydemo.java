package session1;

import java.io.File;

public class Mkdirectorydemo {
	
	public static void main(String[] args) {
		File f=new File("durga123.txt");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}
