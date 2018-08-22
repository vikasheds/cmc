package com.javagf.cmc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Student {
	@Id
	private String stu_id;
	private String stu_name;
	private int roll_no;

	public Student(String stu_id, String stu_name, int roll_no) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.roll_no = roll_no;
	}

}
