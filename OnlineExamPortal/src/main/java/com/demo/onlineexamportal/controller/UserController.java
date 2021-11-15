package com.demo.onlineexamportal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.onlineexamportal.dao.UserLogin;
import com.demo.onlineexamportal.dao.UserRegistration;
import com.demo.onlineexamportal.dao.UserViewPassword;
import com.demo.onlineexamportal.entity.User;
import com.demo.onlineexamportal.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
   
	private UserService userService;
	@GetMapping("/getAllUsers")
	public ArrayList<User> getAllEmp(){
		return UserService.getAllUsers();
	}
   
	@PostMapping(path="/login")
    public UserService login(@RequestBody UserLogin userlogin){
        return userService.login(userlogin);
}
   
	@PostMapping(path = "/Registration")
    public UserService register(@RequestBody UserRegistration userregistration  ){
        return userService.register(userregistration);
    }
   
	@PostMapping(value="/user/changePassword/{user_Id}")
	@ResponseBody
	public void changePassword(@RequestParam String userPassword,@PathVariable int user_Id) {
		UserService.changePassword(userPassword,user_Id);
		
	}	
   
	@PostMapping(path="/readpassword")
    public UserService viewpassword(@RequestBody UserViewPassword userviewpassword){
        return userService.viewpassword(userviewpassword);
}
}
    