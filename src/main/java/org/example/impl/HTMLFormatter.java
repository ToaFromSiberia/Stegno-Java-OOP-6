package org.example.impl;

import org.example.studygroup.Student;

import java.util.List;

public class HTMLFormatter implements Formatter{ //пользователь сам решает какой формат и какой интерфейс использовать, а какой нет. (Принцип разделения интерфейса (ISP))
    @Override
    public String format(List<Student> studentList) {
        return "HTMLFormatter" + studentList.toString();
    }
}