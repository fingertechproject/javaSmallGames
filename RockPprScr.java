package classProgram;
import java.util.Scanner;
import java.util.Random;


public class RockPprScr {
	

	public static void main(String[] args) {
		int bound,i;
		for(i=0;i<=100;i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your no.:) 0->Rock  1->Paper  2->Scissor");
		int YourInput = sc.nextInt();
		if (YourInput>=3) {
			System.out.println("Please input only 0, 1 or 2");
		}
		
		Random random=new Random();
		
	
		
		if (YourInput==ComputerInput) {
			System.out.println("Draw!");
		}
		else if(YourInput==1 && ComputerInput== 0 || YourInput== 0 && ComputerInput==2 || YourInput==2&&ComputerInput==1 ) {
			System.out.println("You Win!");
		}
		else {
			System.out.println("You lose!");
		}
		if(ComputerInput==0) {
			System.out.println(" Computer Choice -> Rock");
		}
		

	if(ComputerInput==1) {
		System.out.println("Computer Choice -> Paper");
	}

if(ComputerInput==2) {
	System.out.println("Computer Choice -> Scissor");
}
		}

	}

}

