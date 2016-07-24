package hw2;

import java.util.Random;

public class ArrFifInd {

public static void main(String[] args) {
	
	Random r = new Random();
	int[] arr = new int[15];
	for(int i =0; i < 15; i++){
		arr[i]= r.nextInt();
		
	}
	int min = arr[0];
	int max = arr[0];
	int imin = 0;
	int imax = 0;
	for(int x = 0; x < arr.length; x++){
	   if(min >arr[x]){
	        min = arr[x];
	    	imin = x;
	   }
	   if(max < arr[x]){
	        max = arr[x];
			imax = x;
			}
		}
	System.out.printf("min value = %d by index [%d]%nmax value = %d by index [%d]", min, imin, max, imax);
}
}
