package com.demo.onlineexamportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.onlineexamportal.entity.User;

public interface UserRegistration extends JpaRepository<User,String>{
}
