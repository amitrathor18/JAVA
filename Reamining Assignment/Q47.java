 import java.util.*;

class Student{

    protected int rollNo;
    protected float percentage;

    Student(){
        System.out.println("\n[*] DEFAULT Student Super Class Constructor Called for STUDENT");
    }

    // SUPER CLASS CONSTRUCTOR (CHAINED IN THE TWO SUB-CLASSES)
    Student(String name){
        System.out.println("\n\n[*] PARAM Super Class Constructor Called for STUDENT with val "+name);
    }


}

class CollegeStudent extends Student{

    protected int semester;

    CollegeStudent(){
        super();
        System.out.println("[*] DEFAULT Sub Class Constructor Called for COLLEGE STUDENT");
    }

    CollegeStudent(String name){
        super(name);//CHAINED TO CONSTRUCTOR OF SUPER CLASS
        System.out.println("[*] PARAM Sub Class Constructor Called for COLLEGE STUDENT with val : "+name);
    }

}

class Q47{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Student s1 =  new CollegeStudent();
        Student s2 = new CollegeStudent("Akshay");        
    }
}