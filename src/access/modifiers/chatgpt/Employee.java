package access.modifiers.chatgpt;

//Create a class Employee with private data members empId, empName, and salary. Provide public methods to get and set the empName and salary. Make the empId read-only, i.e., provide only a getter method for it.

public class Employee {
    private int empId=21314;
    private String empName;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
