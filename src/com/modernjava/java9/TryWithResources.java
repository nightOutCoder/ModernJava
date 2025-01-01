package com.modernjava.java9;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {
	public static void main(String arg[]) throws IOException {
		
		// Try-with-Resources example
		
		/* old way in java 8*/
		Reader inputString = new StringReader("hi");
		BufferedReader bufferedReader = new BufferedReader(inputString);
		
		try(BufferedReader bufferedReaderRef = bufferedReader){
			System.out.println("BufferedReader.readLine() = "+ bufferedReaderRef.readLine());
		}
		
		/* New way in java 9*/
		Reader inputString1 = new StringReader("Bye");
		BufferedReader bufferedReader1 = new BufferedReader(inputString1);
		
		try(bufferedReader1){
			System.out.println("BufferedReader.readLine() = "+ bufferedReader1.readLine());
		}
		
		
		
		/* Example 2 */
		
		 try (
		          BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		           FileWriter writer = new FileWriter("output.txt")
		        ) {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                writer.write(line + "\n");
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	}
}
