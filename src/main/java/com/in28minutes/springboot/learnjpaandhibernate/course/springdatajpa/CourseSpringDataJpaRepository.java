package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
 
// ID is Long type
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	List<Course> findByAuthor(String name);
	
	List<Course> findByName(String name);
}
