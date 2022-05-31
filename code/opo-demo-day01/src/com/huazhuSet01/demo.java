package com.huazhuSet01;

import com.huazhuAPI.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(5);
        sets.add(10);
        sets.add(17);
        System.out.println(sets);

        Set<Student> students =new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(students);
    }
}
