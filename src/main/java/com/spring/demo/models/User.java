package com.spring.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

@Entity
@Table(name = "mas_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@NotNull
	private String Name;
	
	private String Gender;
	private Integer Age;
	private Integer Marks;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public Integer getMarks() {
		return Marks;
	}
	public void setMarks(Integer marks) {
		Marks = marks;
	}
	
//	@Override
//	public String toString() {
//		return "User [Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + ", Marks=" + Marks + "]";
//	}
}
