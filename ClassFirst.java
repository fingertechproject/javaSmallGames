package classProgram;
class employee{
	 int salary;
	 String name;
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
		
	}
	public void setName(String s) {
		name=s;
	}
	
}

public class ClassFirst {

	public static void main(String[] args) {
		
        employee e1 = new employee();
        e1.name="jhon";
        e1.salary=5000;
    	
    	System.out.println(e1.getSalary());
    	e1.setName("khalid");
    	System.out.println(e1.getName());
    	System.out.println(e1.getName());
	


	}

}
