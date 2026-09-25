package edu.mu.inheritance.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = {
	            new SalariedEmployee(
	                1, "Alice", 5000
	            ),
	            new HourlyEmployee(
	                2, "Bob", 20, 160
	            )
	        };

	        for (Employee employee : employees) {

	            System.out.println(
	                employee.getName()
	                + ": $"
	                + employee.calculatePay()
	            );
	        }
	}

}
