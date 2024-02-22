package org.example.studygroup;

import java.util.Date;
import java.util.List;

public class Teacher extends User { // Вместо того, чтобы менять сам класс Teacher, мы расширим его (extends) и добьемся решения поставленной задачи, не нарушая принцип OCP (Принцип открытости/закрытости (OCP))
    private int exp;
    private List<Integer> group;

    public Teacher(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    public Teacher(Date dateBirth, String fio, int ID, int exp, List<Integer> group) {
        super(dateBirth, fio, ID);
        this.exp = exp;
        this.group = group;
    }

    public Teacher(int exp, List<Integer> group) {
        this.exp = exp;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "exp=" + exp +
                ", group=" + group +
                ", dateBirth=" + dateBirth +
                ", fio Teacher='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }

    public Teacher() {
    }
}
