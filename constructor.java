import java.util.*;
public class constructor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int roll;
       String name;
       System.out.println("enter name & roll :");
         name = sc.nextLine();
         roll = sc.nextInt();
        Student s1 = new Student();
      
      Student s2 = new Student(name);
     
      Student s3 = new Student(roll);
    
    }
}
    class Student{
       String name;
       int roll;
        Student(){
            System.out.println("constructor is called");
        }
        Student(String name){
            this.name = name;
            System.out.println(name);
        }
        Student(int roll){
            this.roll = roll;
            System.out.println(roll);
        }
    } 

