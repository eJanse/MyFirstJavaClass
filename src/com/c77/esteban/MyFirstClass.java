package com.c77.esteban;

import java.io.*;

/** 
* Class MyFirstClass
* 
* It has a string that can be modified and printed in console
* 
* @author Esteban
*/	
public class MyFirstClass {
	
	private String line;
	
	/** 
	 * Class constructor.
	 */	
	public MyFirstClass(){
		this.line="Hello World!!";
	}
		
	/** 
	 * Saves a new string
	 * 
	 * @param 	the new string to be saved
	 */	
	public void setLine(String nuevaLinea){
		this.line=nuevaLinea;
	}
	
	/** 
	 * Returns the string
	 * 
	 * @return 	the last saved string
	 */	
	public String getLine(){
		return (this.line);
	}
	
	/** 
	 * Prints on console the saved string
	 */
	public void printLine(){
		System.out.println (this.getLine());
	}

	public static void main(String[] arg){
		
		MyFirstClass first;
		first = new MyFirstClass();
		String s = "linea default";
		boolean end = true;		
        do {
			first.printLine();
			System.out.println("Ingrese una nueva linea");
			InputStreamReader ir = new InputStreamReader(System.in);
	        BufferedReader in = new BufferedReader(ir);
			try {
				s = in.readLine();
            } catch (Exception ex) {}
            if (s != null) {
            	first.setLine(s);
        	}
			if ("exit".equalsIgnoreCase(first.getLine())) {
				end = false;
			}
		} while (end) ;
	}
}