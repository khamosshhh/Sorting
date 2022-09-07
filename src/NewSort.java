import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		int n, i, j, count, small, index=0, x;
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Input number of integers to sort: ");
	      n = sc.nextInt();
	      int[] arr = new int[n];
	      
	      System.out.print("Enter " +n+ " integers: ");
	      for(i=0; i<n; i++)
	         arr[i] = sc.nextInt();
	      
	      for(i=0; i<(n-1); i++)
	      {
	         count=0;
	         small = arr[i];
	         for(j=(i+1); j<n; j++)
	         {
	            if(small>arr[j])
	            {
	               small = arr[j];
	               count++;
	               index = j;
	            }
	         }
	         if(count!=0)
	         {
	            x = arr[i];
	            arr[i] = small;
	            arr[index] = x;
	         }
	      }
	      
	      System.out.println("Sorted list of numbers: ");
	      for(i=0; i<n; i++)
	         System.out.print(arr[i]+ " ");

	}

}