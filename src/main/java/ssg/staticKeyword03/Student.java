package staticKeyword03;

public class Student {
    int number;
    String name;
    static String college = "ITS";
    Student(int r, String n, String college){
        this.name = n;
        this.number = r;
        this.college = college;
    }
    public static void main(String args[]){

       // Student s1 = new Student(111,"Karan", "MIT");
       // Student s2 = new Student (222,"Aryan", "Harvard");
       // System.out.println(s1.number);//111
       // System.out.println(s2.number);//222
       // System.out.println(s1.name);//karan
       // System.out.println(s2.name);//aryan
       // System.out.println(s1.college);//Harvard
       // System.out.println(s2.college);//Harvard

    }


}
