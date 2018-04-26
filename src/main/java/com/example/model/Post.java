package com.example.model;

import java.util.Date;

public class Post {
	private int id;
	private String content;
	private Date dob;
	private int blog_id;
	
	public Post() {}
	public Post(int id, String content, Date dob, int blog_id) {
		this.id = id;
		this.content = content;
		this.dob = dob;
		this.blog_id = blog_id;
	}
	
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", content=" + content + ", dob=" + dob + "]" ;
	}
	
	
	
}
