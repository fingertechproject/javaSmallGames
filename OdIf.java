package classProgram;
import java.util.Scanner;
import java.util.Random;

public class OdIf {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int bound,i,count;
			for(i=0;i<=10;i++) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input your number 1 to 5");
		int yrNum = sc.nextInt();
		Random rndm= new Random();
		int CmptrNum =rndm.nextInt(bound=6);
		if((yrNum+CmptrNum)%2==0) {
			System.out.println("Computer Wins!");
			
			
			
		}
		else {
			System.out.println("You  Wins!");
		}
		System.out.println("Computer Choice is "+CmptrNum);
			}
	}
			

}
