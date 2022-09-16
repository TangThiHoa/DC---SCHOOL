package com.daicent.model;

import java.util.Objects;

public class Student {
    private int idStudent;
    private String nameStudent;

    public Student(int idStudent, String nameStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
    }

    public Student() {
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent && Objects.equals(nameStudent, student.nameStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, nameStudent);
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                '}';
    }
}
