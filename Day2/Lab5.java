import java.util.Scanner;
class Emp{
	private String eno;
	private String ename;
	private String salary;
 
	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	void showData()           
	{
	    System.out.print("\n\t" + eno + "\t" +ename + "\t" +salary);
	}

}

public class Lab5 {

	public static void main(String[] args) {
	 
		Emp obj[] = new Emp[5] ;
		for(int i=0;i<5;i++)
            obj[i] =  new Emp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp details:");
		for(int i=0;i<5;i++)
		{
			String eno=sc.next();
			String ename=sc.next();
		    String  salary=sc.next();
			obj[i].setEno(eno);
			obj[i].setEname(ename);
			obj[i].setSalary(salary);
		}

		System.out.println("Emp details:");
		for(int i=0;i<5;i++)
		{
            obj[i].showData();
		}

	}
}
