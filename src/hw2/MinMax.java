package hw2;

public class MinMax {
public static void main(String[] args) {
		
		int[] i = {1,4,6,8,9,2,5,3,8,7};
		int min = i[0];
		for(int x = 0; x < i.length; x++){
		    if(min >i[x])
		        min = i[x];
		}
		int max = i[0];
		for(int x = 0; x < i.length; x++){
		    if(max < i[x])
		        max = i[x];
		}
		System.out.printf("min value = %d%nmax value = %d", min, max);
		//System.out.print(min + " " + max); //Checking
		
}
}