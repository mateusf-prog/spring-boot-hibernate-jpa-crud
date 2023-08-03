package br.com.mateus.cruddemo.dao;

import br.com.mateus.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(int id);

    List<Student> findAll();
}
