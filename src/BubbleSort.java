import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int n, swap;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of integers to sort");
		n = sc.nextInt();
		int array[] = new int[n];
		
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) 
		      array[i] = sc.nextInt();
		for (int j = 0; j < ( n - 1 ); j++) {
			for (int k = 0; k < n - j - 1; k++) {
				if (array[k] > array[k+1]) 
				/* For descending order use < */ {
					swap       = array[k];
					array[k]   = array[k+1];
					array[k+1] = swap;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		for (int l = 0; l < n; l++) 
		      System.out.println(array[l]);

	}

}