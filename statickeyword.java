public class statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "abc";

        Student s2 = new Student();
        System.out.println(s2.schoolname);
    }
}

class Student{
    String name;
    int roll;
    static String schoolname;
    void setname(){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}