package com.demo.onlineexamportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.onlineexamportal.entity.Admin;

public interface ReportUsers extends JpaRepository<Admin,String> {

}
