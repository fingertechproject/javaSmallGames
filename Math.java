package classProgram;
import java.util.Scanner;
public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double db,whl,fr;

Scanner sc = new Scanner(System.in);
System.out.println("enter a double number");
db= sc.nextDouble();

fr=db%1;
whl=db-fr;
System.out.println("Whole no. is "+whl);
System.out.println("fractional part is"+fr);

	}
	

}
