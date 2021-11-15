package com.demo.onlineexamportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.onlineexamportal.dao.EndTest;
import com.demo.onlineexamportal.dao.StartTest;
import com.demo.onlineexamportal.dao.Viewresult;
import com.demo.onlineexamportal.service.ExamModule;

@RestController
@RequestMapping("/ExamModule")
public class ExamController {
	@Autowired
    private ExamModule exammodule;
    @PostMapping(path="/StartTest")
    public ExamModule StartTest(@RequestBody StartTest starttest){
        return exammodule.StartTest(starttest);
}
    @PostMapping(path="/EndTest")
    public ExamModule EndTest(@RequestBody EndTest endtest){
        return exammodule.EndTest(endtest);
}
    @PostMapping(path="/ViewResult")
    public ExamModule ViewResult(@RequestBody Viewresult viewresult){
        return exammodule.ViewResult(viewresult);
}
}
    