package ch.hfict.io;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import ch.hfict.io.buffReader;

public class buffWriter {

	public static void main(String[] args) throws IOException{
		BufferedWriter buffW = new BufferedWriter(new FileWriter("new.txt"));
		//buffW.write("1;22;333;xyz");
		//buffW.newLine();
		//	buffW.write("4444;55555,666666");
		//buffW.newLine();
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String [] ayy = buffReader.read(r);
		for (String s : ayy) {	
			buffW.write(s);
			buffW.newLine();
		}
		//buffW.write(r.readLine());
		buffW.close();
	}

}
