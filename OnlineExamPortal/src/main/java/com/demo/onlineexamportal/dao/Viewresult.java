package com.demo.onlineexamportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.onlineexamportal.entity.TestMgmt;

public interface Viewresult extends JpaRepository<TestMgmt,String>{
}
