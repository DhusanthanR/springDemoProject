package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
