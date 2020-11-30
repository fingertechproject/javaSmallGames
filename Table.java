package classProgram;
import java.util.Scanner;

class tble{
	int x,i,y;
	Scanner sc=new Scanner(System.in);
	public void tbl() {
		System.out.println("Input any no");
		x=sc.nextInt();
		System.out.println("table of "+x);
		for(i=1;i<=10;i++) {
		y=x*i;
		
		System.out.println(" "+y);
		}
	}
}

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tble tb=new tble();
tb.tbl();
	}

}
