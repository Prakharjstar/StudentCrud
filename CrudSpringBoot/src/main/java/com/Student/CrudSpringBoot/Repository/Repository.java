package com.Student.CrudSpringBoot.Repository;

import com.Student.CrudSpringBoot.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student , Long> {



}
