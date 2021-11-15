package com.demo.onlineexamportal.service;

import com.demo.onlineexamportal.dao.AdminLogin;
import com.demo.onlineexamportal.dao.ReportUsers;
import com.demo.onlineexamportal.dao.TestCreation;
import com.demo.onlineexamportal.dao.UpdateTest;

public interface AdminService {

	AdminService adminlogin(AdminLogin adminlogin);

	AdminService createtest(TestCreation testcreation);

	AdminService updatetest(UpdateTest testupdate);

	AdminService reportusers(ReportUsers reportusers);

	
	
	
	

	
}
