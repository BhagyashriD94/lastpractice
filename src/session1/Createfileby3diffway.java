package session1;

import java.io.File;
import java.io.IOException;

public class Createfileby3diffway {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("shree123");
		f.mkdir();
		
		File f1=new File("shree123","newdemo.txt");
		
		File f2=new File(f,"newdemmo.txt");
		f2.createNewFile();
		
		

	}

}
