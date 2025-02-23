// create a class student as data members as rollno , name , and marks of 3 subject and display student name , roll no and avg of 3 marks //
import java.util.*;
public class Student{
    int rollno;
    String name ;
    float mark1, mark2, mark3;
    
    public Student(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student:");
        name = sc.nextLine();

        System.out.println("Enter the roll no of the student :");
        rollno = sc.nextInt();

        System.out.println(("Enter the marks of 3 subjects:"));
        mark1 = sc.nextFloat();
        mark2 = sc.nextFloat();
        mark3 = sc.nextFloat();

    }
    void disp(){
        float avg = (mark1 + mark2 + mark3)/3;
        System.out.println("The name of student is :"+ name);
        System.out.println("The roll no of student is :"+ rollno);
        System.out.println("The average of 3 marks is :"+ avg);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.disp();
    }
    
}

