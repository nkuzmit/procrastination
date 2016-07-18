package hw1;

import java.util.Scanner;

public class Compare102 {
	
	public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	
		System.out.print("Введи x\n");
		Scanner first = new Scanner(System.in); 
		int x = first.nextInt();
		
		System.out.print("Введи y\n");
		Scanner second = new Scanner(System.in); 
		int y = second.nextInt();
		
		System.setProperty("console.encoding","cp866");		
		if(x < y) System.out.println("x меньше y");
		
		if(x == y) System.out.println("x равен y");
		
		if(x > y) System.out.println("x больше y");
		first.close();
		second.close();
	}
}