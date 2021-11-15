package com.demo.onlineexamportal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
private int Q_Id;
private int Q_B_Id;
@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
public int getQ_Id() {
	return Q_Id;
}
public void setQ_Id(int q_Id) {
	Q_Id = q_Id;
}

public Question(int q_Id, int q_B_Id) {
	super();
	Q_Id = q_Id;
	Q_B_Id = q_B_Id;
}
public int getQ_B_Id() {
	return Q_B_Id;
}
public void setQ_B_Id(int q_B_Id) {
	Q_B_Id = q_B_Id;
}

	

}
