package interviewprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFile43 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("E:"));
		ArrayList<String> str = new ArrayList<>();
		String line = "";
		while((line=reader.readLine())!=null){
				str.add(line);
		}
		reader.close();
		Collections.sort(str);
		FileWriter writer = new FileWriter("new file");
		for(String s: str){
				writer.write(s);
				writer.write("\r\n");
		}
		writer.close();


		
		
		
		
		
	}

}
