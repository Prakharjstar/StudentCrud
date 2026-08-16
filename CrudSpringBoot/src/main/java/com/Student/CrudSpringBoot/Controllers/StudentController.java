package com.Student.CrudSpringBoot.Controllers;

import com.Student.CrudSpringBoot.Entity.Student;
import com.Student.CrudSpringBoot.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
       Student createdStudent= studentService.createStudent(student);
       return ResponseEntity.ok(createdStudent);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id ){
      Student St =  studentService.findById(id);
      return ResponseEntity.ok(St);

    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Student>> findAll(){
        List<Student> st = studentService.findAll();
        return ResponseEntity.ok(st);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> update( @RequestBody Student student ,@PathVariable Long id){
        Student updated = studentService.updateStudent(student , id);
        return ResponseEntity.ok(updated);



    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "Students are deleted";


    }


    }





