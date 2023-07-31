package access.modifiers.demo.perfect_student;

import access.modifiers.demo.student.Student;

public class Main extends Student{
    public static void main(String[] args) {
        Student s = new Student();
        //s.id = 1;                     -- private attribute - can not be accessed in different package
        //s.address = "Navi Mumbai";    -- default attribute - can be accessed in different class same package
        //s.marks = 98.0;               -- protected attribute - can not be accessed in different package
        s.name = "Surabhi";             // public attribute - can be accessed in different package

        //s.getMessagePrivate();           private method - not accessible in other package
        //s.getMessageDefault();           default method - not accessible in other package
        //s.getMessageProtected();         protected method - not accessible in other package (other than child class)
        s.getMessagePublic();           // public method - accessible from other package

        Main ps = new Main();

        //s.id = 1;                     -- private attribute - can not be accessed from child class in different package
        //s.address = "Navi Mumbai";    -- default attribute - can be accessed from child class in different package
        ps.marks = 97.00;               // protected - can be accessed from child class in different package
        ps.name="Surabhi - 1 ";         // public - can be accessed from child class in different package

        //ps.getMessageDefault();          private method - not accessible from child class in different package
        //ps.getMessageDefault();          default method - not accessible from child class in different package
        ps.getMessageProtected();       // protected method - can be accessed from child class in different package
        ps.getMessagePublic();          // public method - can be accessed from child class in different package

        System.out.println(ps.name+" : "+ps.marks);
    }
}
