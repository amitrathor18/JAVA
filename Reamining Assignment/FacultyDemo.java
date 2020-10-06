import java.util.*;


class FacultyDemo{
    public static void main(String[] args) {
     
        FullTimeFaculty f = new FullTimeFaculty();
        f.input();
        f.printSalary();  
        System.out.println("Enter Details for Part Time Faculty : ");
        PartTimeFaculty p = new PartTimeFaculty();
        p.input();
        p.printSalary();      
    }
}




class Faculty{
    protected int facultyId;
    protected float salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Faculty ID : ");
        int id = sc.nextInt();
        this.facultyId = id;
    }


    public void printSalary(){
        System.out.println("Salary : "+this.salary);
    }

}


class FullTimeFaculty extends Faculty{

    protected float basicSalary;
    protected float allowance;


    public void input(){

        Scanner sc = new Scanner(System.in);
        //calling the super class input method
        super.input();
        System.out.print("Enter Basic Salary : ");
        float basicSalary = sc.nextFloat();
        this.basicSalary = basicSalary;
        System.out.print("Enter Allowance : ");
        float allowance = sc.nextFloat();

        //value of sal is not input but calculated
        this.allowance = allowance;
        this.salary = basicSalary + allowance;

    }

}


class PartTimeFaculty extends Faculty{

    protected float workingHours;
    protected float ratePerHour;


    public void input(){

        Scanner sc = new Scanner(System.in);
        //calling the super class input method
        super.input();

        System.out.print("Enter Workign Hours : ");
        float workingHours = sc.nextFloat();
        this.workingHours = workingHours;
        System.out.print("Enter Rate per Hour : ");
        float ratePerHour = sc.nextFloat();
        this.ratePerHour = ratePerHour;

        //value of sal is not input but calculated
        this.salary = workingHours * ratePerHour;

    }

}



















