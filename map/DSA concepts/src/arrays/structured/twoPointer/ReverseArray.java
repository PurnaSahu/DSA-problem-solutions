/*
 * 1. Reverse Array / String
 * Date: FEB-2026
 */

package arrays.structured.twoPointer;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. for String data processing \n 0. for Array data processing");
		
		byte flag =sc.nextByte();
		System.out.println("Starting the operation...");
		
		System.out.println(flag== 0 ? arrayReverse(sc) : stringReverse(sc));
		sc.close();
	}

	private static String stringReverse(Scanner sc) {
		// consumes all leftover data after the scanner call happened in previous method
		//sc.nextLine();
		
		
		//sc.nextLine();
		//return twoPointerApproach1(sc)==1? "\nDone..." : "OOPS!! looks like something went wrong.";
		return twoPointerApproach2(sc)==1? "\nDone..." : "OOPS!! looks like something went wrong.";
		
	}

	private static String stringreverse1() {
		String message= "Hi my name is...";
		
		String revmesg = null;
		for (int i=message.length()-1; i>=0; i--) {
			revmesg += message.charAt(i);
		}
		return revmesg;
	}
	
	private static String stringReverse2() {
		String mesg= "Hi all...";
		char[] charArray = mesg.toCharArray();
		char temp;
		int start=0, end=mesg.length()-1;
		for(;start<end; start++,end--) {
			temp=mesg.charAt(end);
			
		}
		
		return null;
	}
	
	private static byte twoPointerApproach2(Scanner sc) {
		//we will use the 2-pointer technique but with in-built methods
		
		
		return 1;
	}

	private static byte twoPointerApproach1(Scanner sc) {
		
		// we will use two pointer method only but traditionally fetching info from the String.
		
		System.out.println("Enter String data : ");
		
		sc.nextLine();
		String data = //"I love my India...";
				sc.nextLine();
		int size = data.length();
		
		//System.out.println(data);
		char[] arr = new char[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=data.charAt(i);
		}
		
		for(int i=0; i<size; i++){
			System.out.println("\t"+arr[i]);
		}
		
		int start=0, end= size-1;
		char temp;
		//for( ; start!=end; ) {
		while(start <= end) {
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			
			start++; end--;
		}
		
		System.out.println("Printing reversed data");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		return 1;
		
	}

	private static String arrayReverse(Scanner sc) {
		
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		
		int end= size-1, temp;
	
		for(int start=0; start!=end;start++, end--) {
			
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			System.out.println(arr[start]+" ->"+arr[end]);
			//start++; end--;
		}
		
		System.out.println("Printing reversed arr data");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+"\t");
		}
		
		return "Done";
	}

}
