package hw2;

import java.util.Random;

public class Negative {
	public static void main(String[] args) {
		
		Random r = new Random();
		int[] arr = new int[10]; 
		for(int i =0; i < 10; i++){
			arr[i]= r.nextInt();}
		
		int neg = 0;
		for(int x = 0; x < arr.length; x++){
			if(arr[x] < 0){
				neg++;}
			
		}
		System.out.printf("В массиве %d отрицательных элемента(ов)" ,neg);
		}
	
	}

