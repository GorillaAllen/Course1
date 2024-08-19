class OverSalaryRaiseException extends Exception {
	public OverSalaryRaiseException() {
	}

	public OverSalaryRaiseException(String s) {
		super(s);
	}
}

class Employees {
	String Name;
	float Salary;

	public Employees() {
		Name = "";
		Salary = 0.0f;
	}

	public Employees(String TheName, float TheSalary) {
		Name = TheName;
		Salary = TheSalary;
	}

	public float RaiseSalary(float Percent) throws OverSalaryRaiseException {
		if (Percent > 0.05f) {
			throw new OverSalaryRaiseException("不得超過 5% !!!");
		}
		return Salary *= (1.0f + Percent);
	}
}

public class EmployeesTest {
	public static void main(String[] args) {
		Employees Robert = new Employees("Robert", 50000.0f);
		try {
			Robert.RaiseSalary(0.06f);
		} catch (OverSalaryRaiseException e) {
			System.out.println("OverSalaryRaiseException: " + e.getMessage());
		}
		System.out.println("Salary of " + Robert.Name + "is raised to: " + Robert.Salary);
	}
}
