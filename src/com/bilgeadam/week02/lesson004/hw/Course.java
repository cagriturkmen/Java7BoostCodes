package com.bilgeadam.week02.lesson004.hw;

public class Course {
	
	public String lessonCode;
	public String description;
	
	
	public Course(String lessonCode, String description) {
		this.lessonCode = lessonCode;
		this.description = description;
	}


	@Override
	public String toString() {
		return "Course [lessonCode=" + lessonCode + ", description=" + description + "]";
	}
	
	
	
}
