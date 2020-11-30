package classProgram;
import java.util.Scanner;


public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
int i,a=0,j=0;
int[] sum= new int[5];
//		System.out.println("input size of array");
//		j=sc.nextInt();
		System.out.println("fill the array field with your no.");
		for(i=0;i<=j;i++) {
			for(j=0;j<=4;j++) {
			sum[j]=sc.nextInt();
			a=a+sum[j];
			
			
			}
			}
	
		System.out.println("Sum of array element is"+a);
		
	}

}
