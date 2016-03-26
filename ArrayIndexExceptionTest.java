package com.acadglid.java.core.session7.assignment1;

import java.util.Scanner;

public class ArrayIndexExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= new int[5];
		System.out.println("Enter the Values of ");
		for(int i=0;i<=a.length;i++){
			System.out.println("a["+i+"]");
			try{
				Scanner scanner = new Scanner(System.in);
				a[i]=scanner.nextInt();
				scanner.close();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Check the for loop, you trying to enter value in invalid index "+ i);
			}
			
		}
		
	}

}
