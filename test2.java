
import static java.lang.System.out;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;

public class test2 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("random.txt");
		for(int i = 0; i<1000; i+=1) {
			String a = Integer.toString((int)( Math.random()*99999+1));
			System.out.println(a);
			fw.write(a);
			fw.flush();
		}
		fw.close();
		

	}
}
