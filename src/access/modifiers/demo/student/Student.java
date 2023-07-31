package access.modifiers.demo.student;

public class Student {
    private int id;
    public String name;
    protected double marks;
    String address;

    public int getId() {
        return id;                      // private attributes - accessible within the class
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;                    // public attributes - accessible within the class
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;                   // protected attributes - accessible within the class
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;                 // default attributes - accessible within the class
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void getMsgPrivate(){
        System.out.println("From Student - private method");
    }

    void getMessageDefault(){
        System.out.println("From Student - default method");
    }

    protected void getMessageProtected(){
        System.out.println("From Student - Protected method");
    }

    public void getMessagePublic(){
        System.out.println("From Student - Protected method");
    }

    public Student() {
    }

    public Student(int id, String name, double marks, String address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }
}
