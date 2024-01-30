package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

// CommandLineRunner an interface that indicates that a bean should 
// run when it is contained within a SpringApplication
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn JDBC JPA", "in28minutes"));
		repository.save(new Course(2, "Learn AWS JPA", "in28minutes"));
		repository.save(new Course(3, "Learn Linux JPA", "in28minutes"));
		repository.save(new Course(4, "Learn Azure JPA", "codecamp"));
		repository.save(new Course(5, "Learn Azure JPA", "in28minutes"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println("-------- Course Name: ");
		System.out.println(repository.findByName("Learn Azure JPA"));
		
		System.out.println("-------- Author: codecamp");
		System.out.println(repository.findByAuthor("codecamp"));
	}
	
}
