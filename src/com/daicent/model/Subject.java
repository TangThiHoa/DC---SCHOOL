package com.daicent.model;

import java.util.Objects;

public class Subject {
    private int idSubject;
    private String nameSubject;
    private double score;


    public Subject() {
    }

    public Subject(int idSubject, String nameSubject, double score) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.score = score;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return idSubject == subject.idSubject && Double.compare(subject.score, score) == 0 && Objects.equals(nameSubject, subject.nameSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubject, nameSubject, score);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "idSubject=" + idSubject +
                ", nameSubject='" + nameSubject + '\'' +
                ", score=" + score +
                '}';
    }
}
