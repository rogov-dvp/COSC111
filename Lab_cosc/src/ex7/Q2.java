package ex7;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double[] index = new double	[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < index.length; i++) {
			index[i] = in.nextDouble();
		}

		System.out.println("The index of min is "+ indexOfMin(index));
		
		in.close();
		
	}
	
		public static int indexOfMin(double[] array) {				

			double min = array[0];
			int indexMin = 0;
			for (int i = 0; i < array.length; i++) {
				//nums= 3 5 2 7 4 11 5 2 23 17
				if (array[i]< min ) {
					indexMin = i;
					min = array[i];
				}
			}
			return indexMin;
		}
}
