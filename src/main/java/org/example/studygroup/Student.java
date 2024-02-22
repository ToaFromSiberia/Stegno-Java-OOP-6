package org.example.studygroup;

import java.util.Date;
import java.util.List;

public class Student extends User{ // Вместо того, чтобы менять сам класс Teacher, мы расширим его (extends) и добьемся решения поставленной задачи, не нарушая принцип OCP (Принцип открытости/закрытости (OCP))

    int groupID;
    List<Integer> grade;

    public Student(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    public Student(Date date, int id) {

    }

    @Override
    public String toString() {
        return "Students{" +
                "groupID=" + groupID +
                ", grade=" + grade +
                ", dateBirth=" + dateBirth +
                ", fio Student='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }

    public Student() {
    }
}
