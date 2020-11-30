package classProgram;
import java.util.Scanner;

public class Math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
double dbl;
System.out.println("enter a whole no. no.");
dbl=sc.nextDouble();
if(dbl%1==0) {
	System.out.println("this no. is an integer no.");
	
}else
{
	System.out.println("this no. is not an integer no.");
}
	}

}
