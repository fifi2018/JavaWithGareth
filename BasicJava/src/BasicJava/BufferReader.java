package BasicJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
	
	
	public static void main (String args[])throws Exception{
		
	    InputStreamReader r =new InputStreamReader(System.in);    
	    
	    BufferedReader br =new BufferedReader(r); 
	    
	    System.out.println("Enter your name");   
	    
	    String name=br.readLine();    
	    System.out.println("Welcome "+name);    
	}  
	
	}  
	
	
	
