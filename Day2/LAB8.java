import java.util.Scanner;
class Emp {

	private int empno;
	private String empname;
	private double salary;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpName(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Emp(int empNo, String empName, double salary) {
		 
		this.empno = empNo;
		this.empname = empName;
		this.salary = salary;
	}
}
class EmpManager {
	 int count = 10;
	 int index = 0;
	private Emp empArray[] = new Emp[count];

	void createEmp(Emp e) {

		empArray[index] = e;
		index++;

	}

	void updateEmp(int eno, Emp e) {

		for (int i = 0; i < index; i++) {

			if (empArray[i].getEmpno() == eno) {
				empArray[i] = e;
			 }

		}

		 
	}

	void deleteEmp(int eno) {

		int Index = -1;
		for (int i = 0; i < index; i++) {

			if (empArray[i].getEmpno() == eno) {

			Index = i;
			}

		}

		if (Index == -1) {

			System.out.println("Not Found");
			return;
		}

		for (int k = Index; k < index - 1; k++) {

			empArray[k] = empArray[k + 1];
		}
 
		index--;

	}

	void print() {

		for (int i = 0; i < index; i++) {
			System.out.println(empArray[i]);
		}

	}
}

public class LAB8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmpManager empm = new EmpManager();
		String ch;

		do {

			System.out.println("1.Add Employee \n2.Update Employee Details \n3.Delete Employee Details  \n4.List Employees");
			System.out.println("Enter your choice ");
			int n = sc.nextInt();

			switch (n) {

			case 1:
				System.out.println("Enter Eno,Name and Salary");
				Emp e = new Emp(sc.nextInt(), sc.next(), sc.nextDouble());
				empm.createEmp(e);
				break;

			case 2:
				System.out.println("Enter Employee No");
				int eno = sc.nextInt();

				System.out.println("Enter name and salary of the emp");
				Emp e1 = new Emp(eno, sc.next(), sc.nextDouble());
				empm.updateEmp(eno, e1);
				break;

			case 3:
				System.out.println("Enter Employee No");
				int en = sc.nextInt();

				empm.deleteEmp(en);
				break;

			case 4:
				empm.print();
				break;

			}

			System.out.println("Continue[YES/NO]");
			ch = sc.next();

		} while (ch == "yes" || ch == "YES");

	}

}
