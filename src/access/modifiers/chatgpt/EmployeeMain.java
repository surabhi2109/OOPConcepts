package access.modifiers.chatgpt;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpName("John Wick");
        e1.setSalary(45000.00);

        System.out.println("e1 : empId - " + e1.getEmpId()+", name - "+e1.getEmpName()+", salary - "+e1.getSalary());
    }
}
