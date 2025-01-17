package com.waa.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private double gpa;
    private List<Course> coursesTaken = new ArrayList<>();

    public Student(String firstName, String lastName, String email, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
    }

    public void addCourse(Course course) {
        coursesTaken.add(course);
    }

    public void removeCourse(Course course) {
        coursesTaken.remove(course);
    }
}
