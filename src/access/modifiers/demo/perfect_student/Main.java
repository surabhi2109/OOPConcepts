package access.modifiers.demo.perfect_student;

import access.modifiers.demo.student.Student;

public class Main extends Student{
    public static void main(String[] args) {
        Student s = new Student();
        //s.id = 1;  -- 'id' has private access in 'access.modifiers.demo.student.Student'
        s.name = "Surabhi";         //public - can be accessed in different package
        //s.marks = 98.0;             //protected - can not be accessed in different package
        //s.address = "Navi Mumbai";  //default - can be accessed in different class same package

        Main ps = new Main();
        ps.name="Surabhi - 1 ";     //public - can be accessed in different package
        ps.marks = 97.00;           //protected - can be accessed in different package only in subclass

        System.out.println(ps.name+" : "+ps.marks);
    }
}
