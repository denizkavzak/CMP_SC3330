package edu.mu.basics;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int[] arr;
		arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a day number (1 to 7): ");
		int day = input.nextInt();
		System.out.println(day);
		input.close();		
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid input! Please enter a number between 1 and 7.");
		}

		try {
	        String content = Files.readString(
	                Path.of("src", "edu", "mu", "basics", "files", "data.txt"));
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
