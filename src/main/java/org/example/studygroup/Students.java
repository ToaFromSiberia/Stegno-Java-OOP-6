package org.example.studygroup;

import java.util.Date;

public class Students extends Student { // Вместо того, чтобы менять сам класс Teacher, мы расширим его (extends) и добьемся решения поставленной задачи, не нарушая принцип OCP (Принцип открытости/закрытости (OCP))


    public Students(Date dateBirth, int ID) {
        super(dateBirth, ID);
    }

    public Students() {
    }

    public Students(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    @Override
    public String toString() {
        return "Students{" +
                "groupID=" + groupID +
                ", gradeStudents=" + grade +
                ", dateBirth=" + dateBirth +
                ", IDStudents=" + ID +
                '}';
    }
}



