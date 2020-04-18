package Java;

import java.util.Scanner;

import sun.awt.shell.Win32ShellFolder2.SystemIcon;

public class QuickStart {

	public static void main(String[] args) {

		//Day1 - Printing statements, Caleb Curry 30 days of java
		System.out.println("Hello World");
		System.out.println("Enter your name dummy:");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		//Day2 - Dataflow Caleb Curry 30 days of java
		if(s=="mitch"){
			System.out.println("Hi Bitch.... i mean Mitch!");
		}else {
			if(s=="sab"){
				System.out.println("Hi Sab!");
				}else {
					System.out.println("GO AWAY " + s + "!!!!");
		}
		}	

		for(int i=0;i<20;i++){ //change to 20 for git test
			System.out.println(i);
			System.out.println("Bitch!!!! test"); //added sysout for git test
		}

		//System.out.println(s);

		in.close(); //rmb to close scanner in, otherwise will have resource leak, therefor vs code wont compile
	}

}
