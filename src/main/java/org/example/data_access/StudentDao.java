package org.example.data_access;

import org.example.models.Student;

import java.util.List;

public interface StudentDao {

    Student find(int id);
    Student save(Student student);
    List<Student> findAll();
    void delete(int id);
}
