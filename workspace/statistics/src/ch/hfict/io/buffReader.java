package ch.hfict.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class buffReader {
	public static void main(String[] args) throws FileNotFoundException {	
		try {
			BufferedReader buffR = new BufferedReader (new FileReader("new.txt"));
			for (String c : read(buffR)) {
				System.out.println(c);
			}
		}catch(IOException e) {
			e.printStackTrace(); //gibt an weshalb File nicht lesen kann
		}
	}
	public static String [] read(BufferedReader r) {
		String [] values = null;
		try {
			values = r.readLine().split(";");
			
			r.close();
		}catch (IOException e) {
			e.printStackTrace();//gibt an weshalb nicht File öffnen / finden kann
		}
		return values;
	}
}
