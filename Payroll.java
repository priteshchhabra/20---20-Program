import java.util.Scanner;

class Employee
{
	Scanner sc  = new Scanner(System.in);
	String EmpName;
	int EmpWage;
	public void empName() 
	{
		System.out.println("Enter the employee name: ");
		EmpName = sc.next();
	}
	public int empWage()
	{
		System.out.println("Enter the employee's hourly wage: ");
		EmpWage = sc.nextInt();
		return EmpWage;
	}
}
class Employees
{
	int NoOfEmps;
	public void employees() 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		NoOfEmps = sc.nextInt();
		for(int i = 0; i<NoOfEmps; i++)
		{
		Employee obj1 = new Employee();
		obj1.empName();
		obj1.empWage();
		}
	}
}
class TimeCard
{
	int NoOfTCs, NoOfMinsWorked;
	public void timeCard() 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of time cards: ");
		NoOfTCs = sc.nextInt();
		for(int j = 0; j<NoOfTCs; j++) {
			System.out.println("Enter the employee name and the number of minutes worked: ");
			String EmpName = sc.next();
			NoOfMinsWorked = sc.nextInt();
		}
		
	}
}
public class Payroll
{

	public static void main(String[] args) 
	{
		Employees obj2 = new Employees();
		obj2.employees();
		TimeCard obj3 = new TimeCard();
		obj3.timeCard();
		
	}

}
