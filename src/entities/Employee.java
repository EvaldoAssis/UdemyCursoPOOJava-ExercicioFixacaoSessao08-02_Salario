package entities;

public class Employee {

	public String nameEmployee;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void IncreaseSalary(double porcentagem) {
		grossSalary += grossSalary * porcentagem / 100.0;
	}

	public String toString() {
		return nameEmployee + ", $ " + String.format("%.2f", netSalary());
	}

}
