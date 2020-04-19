package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import sun.awt.shell.Win32ShellFolder2.SystemIcon;
import sun.tools.java.ScannerInputReader;

public class QuickStart {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		//Day1 - Printing statements, Caleb Curry 30 days of java
		System.out.println("Hello World");
		System.out.println("Enter your name dummy:");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		//end of day1
		*/ 
		
		/*
		//Day2 - Dataflow Caleb Curry 30 days of java
		if(s.equals("mitch")){
			System.out.println("Hi Bitch.... i mean Mitch!");
		}else if(s.equals("sab")){
				System.out.println("Hi Sab!");
				}else {
					System.out.println("GO AWAY " + s + "!!!!");
		}
		//end of day2
		*/

		/*
		//Day 3 - File collections and Arrays
		File test_File = new File("C:\\Users\\mitch\\vs_projects\\mitch_git_test\\Java\\test_app\\test_file.txt");
		Scanner sc = new Scanner(test_File);
		List<String> students = new ArrayList<String>();
		while(sc.hasNextLine()) {
			students.add(sc.nextLine());
			//System.out.println(sc.nextLine());
		}
		for(int i=0; i<students.size(); i++){
			System.out.println("name: "+students.get(i));
		}

		/*	this section is for arrays
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = in.nextInt();
		int[] grades = new int[size];
		System.out.println("Enter"+ size + " numbers:");
		
		for (int i = 0; i < size; i++) {
			grades[i]=in.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.println(grades[i]);
		}

		sc.close(); //this is for day 3 arrays/collections, for reading from file
		*/
		
		//end of day3
		*/

		/*
		for(int i=0;i<20;i++){ //change to 20 for git test
			System.out.println(i);
			System.out.println("Bitch!!!! test"); //added sysout for git test
		}
		*/
		
		
		

		//in.close(); //rmb to close scanner in or sc, otherwise will have resource leak, therefor vs code wont compile
	}

}
