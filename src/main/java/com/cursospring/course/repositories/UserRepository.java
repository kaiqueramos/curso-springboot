package com.cursospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
