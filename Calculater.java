package classProgram;
import java.util.Scanner;


class add{
	 int a,b,c;
	 Scanner sc= new Scanner(System.in);
	 public void aadd() {
		System.out.println("Input two no."); 
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("answer = "+c);
		c=a-b;
		System.out.println("answer = "+c);
		c=a*b;
		System.out.println("answer = "+c);
		c=a/b;
		System.out.println("answer = "+c);
		c=a%b;
		System.out.println("answer = "+c);
	 }
	 }
public class Calculater {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 add ad=new add();
 ad.aadd();
	}

}
