package lab_11;

import java.util.ArrayList;
import java.util.List;

enum EmployeeType {
	PERMANENT, CONTRACT, INTERN
}

class Employee {
	// attributes
	private int empId;
	private String empName;
	private EmployeeType empType;
	private double baseSalary;

	public Employee(int empId, String empName, EmployeeType empType, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empType = empType;
		this.baseSalary = baseSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public EmployeeType getEmpType() {
		return empType;
	}

	public void setEmpType(EmployeeType empType) {
		this.empType = empType;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

}

interface SalaryCalculator {
	// function to calculate the salary
	double calculateSalary(Employee emp);
}

class PermanentEmployeeSalaryCaculator implements SalaryCalculator {
	private double PERMANENT_EMPLOYEE_PERCENT = 0.30;

	@Override
	public double calculateSalary(Employee emp) {
		double baseSalary = emp.getBaseSalary();

		double salary = baseSalary + (baseSalary * PERMANENT_EMPLOYEE_PERCENT);
		return salary;
	}
}

class ContractEmployeeSalaryCalculator implements SalaryCalculator {
	private double CONTRACT_PERCENT = 0.10;

	@Override
	public double calculateSalary(Employee emp) {
		double baseSalary = emp.getBaseSalary();
		double salary = baseSalary + (baseSalary * CONTRACT_PERCENT);
		return salary;
	}
}

class InternSalaryCalculator implements SalaryCalculator {

	@Override
	public double calculateSalary(Employee emp) {
		double baseSalary = emp.getBaseSalary();
		double salary = baseSalary;
		return salary;
	}
}

class SalaryCalculatorFactory {
	public SalaryCalculator getSalaryCalculator(EmployeeType type) throws Exception {
		switch (type) {
		case PERMANENT:
			return new PermanentEmployeeSalaryCaculator();

		case CONTRACT:
			return new ContractEmployeeSalaryCalculator();
		case INTERN:
			return new InternSalaryCalculator();
		default:
			throw new Exception("Invalid employee type");
		}

	}
}

interface Database {
	void saveToDatabase(Employee emp, double salary);
}

class InMemoryDatabase implements Database {
	private List<String> database = new ArrayList<String>();

	@Override
	public void saveToDatabase(Employee emp, double salary) {
		String record = "-------------\n";
		record += "Name: " + emp.getEmpName() + "\n";
		record += "Salary: " + salary + "\n";
		record = "-------------\n";
		database.add(record);
	}
}

class ReportManager {
	public void generateReport(Employee emp, double salary) {
		System.out.println("------Employee Salary Report-----");
		System.out.println("ID: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Type: " + emp.getEmpType());
		System.out.println("Salary: " + salary);
		System.out.println("----------------------");
	}
}

public class EmployeeManager {
	public static void main(String args[]) throws Exception {
		Employee emp = new Employee(1, "Ali Akbar", EmployeeType.PERMANENT, 8000.5);
		SalaryCalculatorFactory scf = new SalaryCalculatorFactory();
		SalaryCalculator sc = scf.getSalaryCalculator(EmployeeType.PERMANENT);
		double salary = sc.calculateSalary(emp);
		Database db = new InMemoryDatabase();
		db.saveToDatabase(emp, salary);
		ReportManager rm = new ReportManager();
		rm.generateReport(emp, salary);
	}
}
