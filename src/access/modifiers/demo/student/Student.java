package access.modifiers.demo.student;

public class Student {
    private int id;
    public String name;
    protected double marks;
    String address;

    public Student() {
    }

    public Student(int id, String name, double marks, String address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }
}
