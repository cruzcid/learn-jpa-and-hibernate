package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

// CommandLineRunner an interface that indicates that a bean should 
// run when it is contained within a SpringApplication
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn JDBC", "in28minutes"));
		repository.insert(new Course(2, "Learn AWS", "in28minutes"));
		repository.insert(new Course(3, "Learn Linux", "in28minutes"));
		
		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));
	}
	
}
