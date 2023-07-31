package access.modifiers.demo.student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        //s.id = 1;  -- 'id' has private access in 'access.modifiers.demo.student.Student'
        s.name = "Surabhi";         //public - can be accessed in different class same package
        s.marks = 98.0;             //protected - can be accessed in different class same package
        s.address = "Navi Mumbai";  //default - can be accessed in different class same package

        System.out.println(s.name+" : "+s.marks+" : "+s.address);
    }

}
