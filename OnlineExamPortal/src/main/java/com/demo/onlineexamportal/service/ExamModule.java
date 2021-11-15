package com.demo.onlineexamportal.service;

import com.demo.onlineexamportal.dao.EndTest;
import com.demo.onlineexamportal.dao.StartTest;
import com.demo.onlineexamportal.dao.Viewresult;

public interface ExamModule {

	ExamModule StartTest(StartTest starttest);

	ExamModule EndTest(EndTest endtest);

	ExamModule ViewResult(Viewresult viewresult);

	

	
}
