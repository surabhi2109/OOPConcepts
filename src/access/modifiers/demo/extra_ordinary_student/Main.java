package access.modifiers.demo.extra_ordinary_student;

import access.modifiers.demo.student.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        //s.id = 1;                     -- private attribute - can not be accessed in different package
        // s.address = "Navi Mumbai";   -- default attribute - can be accessed in different class same package
        // s.marks = 98.0;              -- protected attribute - can not be accessed in different package
        s.name = "Surabhi";             // public attribute - can be accessed in different package

        // s.getMessagePrivate();       -- private methods not accessible
        // s.getMessageDefault();       -- default method - not accessible in other package
        // s.getMessageProtected();     -- protected method - can not be accessed from different package
        s.getMessagePublic();           // public method - accessible from different package
    }
}
