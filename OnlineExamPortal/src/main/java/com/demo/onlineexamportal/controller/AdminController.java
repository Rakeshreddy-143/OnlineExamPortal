package com.demo.onlineexamportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.onlineexamportal.dao.AdminLogin;
import com.demo.onlineexamportal.dao.ReportUsers;
import com.demo.onlineexamportal.dao.TestCreation;
import com.demo.onlineexamportal.dao.UpdateTest;
import com.demo.onlineexamportal.service.AdminService;
@RestController
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
    private AdminService adminservice;
    @PostMapping(path="/adminlogin")
    public AdminService adminlogin(@RequestBody AdminLogin adminlogin){
        return adminservice.adminlogin(adminlogin);
}
    @PostMapping(path="/createtest")
    public AdminService createtest(@RequestBody TestCreation testcreation){
        return adminservice.createtest(testcreation);
}
    @PostMapping(path="/updatetest")
    public AdminService updatetest(@RequestBody UpdateTest testupdate ){
        return adminservice.updatetest(testupdate);
}
    @PostMapping(path="/reportusers")
    public AdminService reportusers(@RequestBody ReportUsers reportusers ){
        return adminservice.reportusers(reportusers);
}
}