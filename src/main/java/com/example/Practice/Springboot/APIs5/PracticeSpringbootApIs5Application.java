package com.example.Practice.Springboot.APIs5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringbootApIs5Application {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSpringbootApIs5Application.class, args);

        // task 26
        UpdateDemo demo = new UpdateDemo();
        demo.updateStudent();

        //task 27
        Student student = new Student(101, "Wala", "A");
        System.out.println("Original Student details: ");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Student grade : " + student.getGrade());

        //update student name using setter method
        student.setStudentName("Sara");
        System.out.println("Updated Student details :");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Student grade : " + student.getGrade());

    }

}
