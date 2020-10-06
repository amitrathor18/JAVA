import java.util.*;

class Student{

    protected int rollNo;
    protected float percentage;

    Student(){
        rollNo = 0;
        percentage=0.0f;
    }

    // SUPER CLASS CONSTRUCTOR (CHAINED IN THE TWO SUB-CLASSES)
    Student(int rollNo, float percentage){
        this.rollNo=rollNo;
        this.percentage=percentage;
    }

    public void show(){
        // System.out.println("Student class show() method called");
        System.out.println("Roll No : "+this.rollNo);
        System.out.println("Percentage : "+this.percentage);
    }


}

class CollegeStudent extends Student{

    protected int semester;

    CollegeStudent(){
        super();
        semester = 1;//DEFAULT INITIALISATION
    }

    CollegeStudent(int rollNo, float percentage, int semester){
        super(rollNo, percentage);//CALL TO CONSTRUCTOR OF SUPER CLASS
        this.semester=semester;
    }

    public void show(){
        super.show();//CALL TO THE SHOW OF SUPER CLASS
        // System.out.println("CollegeStudent class show() method called");
        System.out.println("Semester : "+this.semester);
    }


}

class SchoolStudent extends Student{

    protected int className;

    SchoolStudent(){
        super();
        className = 1; //DEFAULT INITIALISATION
    }

    SchoolStudent(int rollNo, float percentage,int className){
        super(rollNo, percentage);//CALL TO CONSTRUCTOR OF SUPER CLASS
        this.className=className;
    }

    //OVER RIDDEN METHOD
    public void show(){
        super.show();//CALL TO THE SHOW OF SUPER CLASS
        System.out.println("Class  : "+this.className);
    }


}


class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //creating an array of student because the super can hold the ref variable of the sub class (UPCASTING)
        Student students[] = new Student[5];




        //TO ENTER THE OBJ AND THEIR DETAILS INTO AN ARRAY
        for(int i=0; i<students.length; i++){

            if(i < 2){

                System.out.println("\nEnter details for College Students : ");
        
                System.out.print("Enter Roll No : ");
                int rollNo = sc.nextInt();
                System.out.print("Enter Percentage : ");
                float percentage = sc.nextFloat();
                System.out.print("Enter Semester : ");
                int semester = sc.nextInt();
                Student cs = new CollegeStudent(rollNo,percentage,semester);
                students[i]=cs;
            }
            else{
                System.out.println("\nEnter details for School Students : ");
        
                System.out.print("Enter Roll No : ");
                int rollNo = sc.nextInt();
                System.out.print("Enter Percentage : ");
                float percentage = sc.nextFloat();
                System.out.print("Enter Class : ");
                int className = sc.nextInt();
                Student ss = new SchoolStudent(rollNo,percentage,className);
                students[i]=ss;
            }

        }

        System.out.println("\n\n\nTO PRINT THE DETAILS OF ARRAY \n");
        for(int i=0; i<students.length; i++){

            if(i < 2){
                System.out.println("Details for College Students : ");
                students[i].show();
            }
            else{
                System.out.println("Details for College Students : ");
                students[i].show();
            }
        }

        
        //TO SEARCH THE ROLL NO IN THE ARRAY
        System.out.println("\n\n\nSEARCHING ROLL NO IN ARRAY =>\n");
        System.out.println("Enter Roll no to search : ");
        int roll = sc.nextInt();
        for(int i=0; i<students.length; i++){

            if(students[i].rollNo == roll){
                System.out.println("Details for Roll No "+roll+" : ");
                students[i].show();
            }
            else
                continue;
        }

        //TO FIND THE NO OF STUDENTS WITH GRADE A (GRADE > 75)
        int studentCount=0;
        for(int i=0; i<students.length; i++){

            if(students[i].percentage > 75){
                studentCount++;
            }
            else
                continue;
        }
        System.out.println("\n\nNumber of Students with grade A : "+studentCount);

    }


}