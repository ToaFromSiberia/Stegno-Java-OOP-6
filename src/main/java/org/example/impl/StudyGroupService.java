package org.example.impl;

import org.example.studygroup.Student;
import org.example.studygroup.Students;
import org.example.studygroup.Teacher;
import org.example.studygroup.User;

import java.util.Date;
import java.util.List;

public class StudyGroupService implements DataService {


    @Override
    public User create(Student student) {
        return new Student(new Date(), "std_fio", 1);
    }


    @Override
    public User create(Students students) {
        return new Students(new Date(), 2);
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher(new Date(), "teach_fio", 1);
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
