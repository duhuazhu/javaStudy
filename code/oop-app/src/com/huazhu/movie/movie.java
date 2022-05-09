package com.huazhu.movie;

public class movie {
    private String name;
    private double grade;
    private String director;

    public movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public movie(String name, double grade, String director) {
        this.name = name;
        this.grade = grade;
        this.director = director;
    }
}
