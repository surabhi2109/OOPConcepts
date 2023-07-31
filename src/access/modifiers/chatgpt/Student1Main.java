package access.modifiers.chatgpt;

public class Student1Main {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setRollNumber(1);
        s1.setName("John Doe");
        s1.setMarks(new int[]{90,50,85,76,97});

        System.out.println("Student : roll_number - "+s1.getRollNumber()+", name - "+s1.getName());
        System.out.println("Total Marks = "+s1.getTotalMarks(s1.getMarks()));
        System.out.println("Average Marks = "+s1.getAverageMarks(s1.getMarks()));
        System.out.println("Grade = "+s1.getGrade(s1.getAverageMarks(s1.getMarks())));
    }
}
