package day1.com;

import java.util.Scanner;

public class StringManipulation {
	 public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: " );
		String str =scan.next();
		System.out.println(" Enter the Characters:  ");
		char ch= scan.next().charAt(0);
		int n=0;
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
				if(arr[i]==ch)
					 n++;
			        
			      }	 
			 System.out.println(n);
			  }
}

