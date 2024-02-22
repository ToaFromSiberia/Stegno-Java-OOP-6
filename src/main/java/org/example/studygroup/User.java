package org.example.studygroup;

import java.util.Date;

// model
public abstract class User { //зависимости внутри системы строятся на основе абстракций (Принцип инверсии зависимостей (DIP)) Модули верхнего уровня не зависят от модулей нижнего уровня.
    Date dateBirth;
    String fio;
    int ID;

    public User(Date dateBirth, String fio, int ID) {
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "dateBirth=" + dateBirth +
                ", fio User='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }

    public User() {
    }
}
