package access.modifiers.demo.student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        //s.id = 1;                 -- private attributes - not accessible in other class
        s.name = "Surabhi";         // public attributes - can be accessed in different class same package
        s.marks = 98.0;             // protected attributes - can be accessed in different class same package
        s.address = "Navi Mumbai";  // default attributes - can be accessed in different class same package

        System.out.println(s.name+" : "+s.marks+" : "+s.address);

        //s.getMessagePrivate();    -- private methods - not accessible in other class
        s.getMessageDefault();      // default method - accessible in other class
        s.getMessageProtected();    // protected method - accessible in other class
        s.getMessagePublic();       // public method - accessible from other class
    }

}
