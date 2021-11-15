package com.demo.onlineexamportal.service;

import java.util.ArrayList;

import com.demo.onlineexamportal.dao.UserLogin;
import com.demo.onlineexamportal.dao.UserRegistration;
import com.demo.onlineexamportal.dao.UserViewPassword;
import com.demo.onlineexamportal.entity.User;

public interface UserService {

	static ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	UserService login(UserLogin userlogin);

	UserService register(UserRegistration userregistration);

	static void changePassword(String userPassword, int user_Id) {
		// TODO Auto-generated method stub
		
	}

	UserService viewpassword(UserViewPassword userviewpassword);

	
	
}
