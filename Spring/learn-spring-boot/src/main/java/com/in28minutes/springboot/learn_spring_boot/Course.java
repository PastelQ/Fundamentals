package com.in28minutes.springboot.learn_spring_boot;

public class Course {
	// Field
	private long id;
	private String name;
	private String author;
	
	
	// Constructor
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	
	// Method
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}