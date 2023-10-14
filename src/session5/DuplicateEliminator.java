package session5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class DuplicateEliminator {
	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter("C:\\Users\\Anvit\\Desktop\\New folder\\output1.txt");
		BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\Anvit\\Desktop\\New folder\\input1.txt"));
		String line=br1.readLine();
		while(line!=null) 
		{
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("C:\\Users\\Anvit\\Desktop\\New folder\\output1.txt"));
			String target=br2.readLine();
			while(target!=null) 
			{
				if(line.equals(target)) 
				{
					available=true;
					break;
				}
				target=br2.readLine();
			}
			if(available==false) 
			{
				pw.println(line);
				pw.flush();
			}
			line=br1.readLine();
		}
	}

}
