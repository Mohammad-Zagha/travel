package test123;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  //System.in is a standard input stream  
		System.out.println("1> hello");  
		System.out.println("1> bye");
		String str;   //reads string before the space  
		while(true)
		{
			str= sc.next();
			if(str.equals("1")==true)
			{
				
				System.out.println("1");
			}
			if(str.equals("2"))
			{
				System.out.println("rrr");
				
			}
		}
			
		
	

	}

}
