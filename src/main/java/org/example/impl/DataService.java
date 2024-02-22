package org.example.impl;

import org.example.studygroup.Student;
import org.example.studygroup.Students;
import org.example.studygroup.Teacher;
import org.example.studygroup.User;

import java.util.List;

public interface DataService { // На каждый объект возлагается одна обязанность, полностью инкапсулированная в класс. (Принцип единственной ответственности (SRP))
    User create(Student student);//^Такой классы всегда будет просто изменять, если это понадобится, потому что понятно, за что класс отвечает, а за что — нет.

    User create(Students students);

    User create(Teacher teacher);

    List<User> read(List<User> users);
}
