package Assignment7;
import java.util.Scanner;

public class Q50 {
	public static void main(String args[]) {
	    try (Scanner sc = new Scanner(System.in)) {
			Employee[] e = new Employee[3];
   
			
			for(int i=0; i<3; i++) {
			System.out.println("Enter empid :");
			  int empID = sc.nextInt();
			System.out.println("Enter name:");
			  String name = sc.next();
				System.out.println("Enter salary :");
			  double salary = sc.nextDouble();
			   
			 Employee e1 = new Employee(empID,name,salary);
			 
			    e[i]=e1;
			
			}			  
				for(Employee a : e) {
					System.out.println("Emp details :" + a);
				}
				int count =0;
				for(int i=0; i<3; i++)
				{
					for (int j=i+1; j<3; j++) {
						   if(e[i].equals(e[j]))
							  {
								System.out.println("ID is already present : you Create duplicate Id= "+e[i].empID);
							count++;
							   }
					   }

				}
				System.out.println("Total duplicate values = "+count);

				System.out.println("Renter Details:");
				for(int k=0; k<count; k++) {
					System.out.println("Enter empid :");
					  int empID = sc.nextInt();
					System.out.println("Enter name:");
					  String name = sc.next();
						System.out.println("Enter salary :");
					  double salary = sc.nextDouble();
					   
					 Employee e1 = new Employee(empID,name,salary);
					 
					    e[k]=e1;
					
					}			  
						for(Employee a : e) {
							System.out.println("Emp details :" + a);
						}


	 }
}
	
}






 class Employee {

int empID;
   String name;
   double salary;
   

public Employee(int empID, String name, double salary) {
	super();
	this.empID = empID;
	this.name = name;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
}

@Override
public boolean equals(Object obj) {
	Employee t = (Employee) obj;
	  boolean isEqual = this.empID == t.empID;
	return isEqual;
	  
	  
}

}