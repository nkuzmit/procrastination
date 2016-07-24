package hw2;

public class Array {

	public static void main(String[] args) {
		
		float[] f = {1,4,6,8,9,2,5,3,8,7};
		float a = 0;
		float sum = 0;
		for(int x = 0; x < f.length; x++){
				System.out.print(f[x] + " | ");		
				sum += f[x];
		}
		System.out.println();
		a = (sum / f.length);
		System.out.println("Average value = " + a);		
	}
}	

