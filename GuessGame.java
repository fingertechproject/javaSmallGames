package classProgram;
import java.util.Scanner;
import java.util.Random;
class gg{
	int x,i,bound;
	public void gesgm() {
		Scanner sc=new Scanner(System.in);
		Random rndm = new Random();
		int ci = rndm.nextInt(bound=100);
		for(i=0;i<=20;i++) {
		System.out.println("Guess the no.");
		x=sc.nextInt();
		
		
		if(x<ci) {
			System.out.println("your no. is smaller then computer no.");
		}else if(x>ci) {
			System.out.println("your no. is greater then computer no.");
		}else
		{
			System.out.println("You Guess The Right No.\n\n\t\tCongratulations");
		}
		}
	}
}

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
gg g1=new gg();
g1.gesgm();
	}

}
