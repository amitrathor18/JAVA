import java.util.Scanner;
	interface Taxable
	{
		float salesTax=7;
		float incomeTax=10.5f;
		void calcTax();
	}

	class Employee implements Taxable
	{
		int empId;
		String name;
		float salary;
		Employee(int empId,String name,float salary)
		{
			this.empId=empId;
			this.name=name;
			this.salary=salary;
		}
		public void calcTax()   // making public is must as interface methods are by default public, so we cant narrow the access!!!
		{
			float tax=salary*incomeTax*12/100;
			System.out.println("Income tax on yearly salary: "+tax);
		}
	}

	class Product implements Taxable
	{
		int pid;
		int quantity;
		float price;
		Product(int pid,int quantity,float price)
		{
			this.pid=pid;
			this.quantity=quantity;
			this.price=price;
		}
		public void calcTax()
		{
			float tax=price*quantity*salesTax/100;
			System.out.println("Sales tax on unit product: "+tax);
		}
	}

	class Q49
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Empoyee ID, Name and Salary:");
			int empId=sc.nextInt();
			String name=sc.next();
			float salary=sc.nextFloat();
			
			Taxable T1=new Employee(empId,name,salary);
			T1.calcTax();
			
			System.out.println("\n Enter Product ID, Quantity and price:");
			int pid=sc.nextInt();
			int quantity=sc.nextInt();
			float price=sc.nextFloat();
			
			Taxable T2=new Product(pid,quantity,price);
			T2.calcTax();
		}
	}
