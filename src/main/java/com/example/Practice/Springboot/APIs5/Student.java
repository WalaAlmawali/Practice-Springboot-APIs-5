package com.example.Practice.Springboot.APIs5;

public class Student {

    private int StudentID;
    private String StudentName;
    private String Grade;

    // Constructor

    public Student(int studentID, String studentName, String grade) {
        StudentID = studentID;
        StudentName = studentName;
        Grade = grade;
    }

    // getter

    public int getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getGrade() {
        return Grade;
    }

    // Setter

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}
