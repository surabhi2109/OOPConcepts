package access.modifiers.chatgpt;

//Implement a class Student with private data members rollNumber, name, and marks. The marks should be an array of integers representing the marks obtained in different subjects. Provide public methods to calculate the total marks, average marks, and grade for the student.

public class Student1 {
    private int rollNumber;
    private String name;
    private int[] marks;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getTotalMarks(int[] marks){
        int totalMarks = 0;
        for(int m : marks){
            totalMarks+=m;
        }
        return totalMarks;
    }

    public float getAverageMarks(int[] marks){
        int totalMarks = 0;
        for(int m : marks){
            totalMarks+=m;
        }
        return totalMarks/marks.length;
    }

    public char getGrade(float marks){
        if(marks > 90)
            return 'A';
        else if (marks <=90 && marks >75)
            return 'B';
        else if (marks <=75 && marks >60)
            return 'C';
        else if (marks <=60 && marks >45)
            return 'E';
        else
            return 'F';
    }

}
