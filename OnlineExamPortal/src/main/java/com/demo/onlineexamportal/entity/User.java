package com.demo.onlineexamportal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "User")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int user_id;
private String email;
private char username;
private String address;

public User(int user_id, String email, char username, String address) {
super();
this.user_id = user_id;
this.email = email;
this.username = username;
this.address = address;
}
@OneToOne(targetEntity=Question.class,cascade=CascadeType.ALL)
@ManyToOne(targetEntity=Admin.class,cascade=CascadeType.ALL)
public int getId() {
return user_id;
}
public void setId(int user_id) {
this.user_id = user_id;
}


public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public char getUsername() {
return username;
}
public void setUsername(char username) {
this.username = username;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
@Override
public String toString() {
return "User [id=" + user_id + ", email=" + email + ", username=" + username + ", address=" + address + "]";
}

}