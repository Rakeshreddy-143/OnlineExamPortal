package com.demo.onlineexamportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.onlineexamportal.entity.TestMgmt;

public interface StartTest extends JpaRepository<TestMgmt,String>{

}
