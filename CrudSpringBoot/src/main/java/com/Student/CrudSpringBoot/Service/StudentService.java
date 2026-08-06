package com.Student.CrudSpringBoot.Service;

import com.Student.CrudSpringBoot.Entity.Student;

import com.Student.CrudSpringBoot.Repository.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private final Repository studentRepo;

    public StudentService(Repository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student createStudent(Student studentreq){
         return studentRepo.save(studentreq);


    }


    public Student findById(Long id) {
        return studentRepo.findById(id).orElseThrow(()-> new RuntimeException("Student not found with id " + id));
    }
}
