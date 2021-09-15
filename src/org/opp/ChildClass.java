package org.opp;

public class ChildClass extends Parentclass {

	public void empID() {
		System.out.println("id : 123");
	}
	public void empNamE() {
		System.out.println("name : raj");
	}
	public void empPhn() {
		System.out.println("phone : 9080786900");
	}
	@Override
	public void empPhone() {
		System.out.println("phone : 8900786899");
	}
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		c.empId();
		c.empName();
		c.empPhone();
		c.empID();
		c.empNamE();
		c.empPhn();	
	
	}
}
