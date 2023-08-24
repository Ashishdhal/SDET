package DSA;

public class employee {
	
	private String name;
	private int age;

	public employee(String name, int age) {
		
		//System.out.println("["+name+"]"+","+"["+age+"]");
		this.name=name;
		this.age=age;	
		
	}
	public String addName() {
		
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	 for (employee emp : employeeArray) {
         System.out.println("Name: " + emp.getName() + " Age: " + emp.getAge());
	
	

}
