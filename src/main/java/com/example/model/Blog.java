package com.example.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Blog{
	private int id;
	private String title;
	private String content;
	private Date dob;
	private String state; //active , non-active
	private Author author;
	private List<Post> posts;
	
	public Blog() {}
	public Blog(int id, String title, String content, Date dob, String state) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.dob = dob;
		this.state = state;
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		
		String str = "Blog [id=" + id + ", title=" + title + ", content=" + content + ", dob=" + dob + ", state=" + state +
				 "]";
		str += "\n"+ author.toString();
		for(Post p: posts) {
			str += "\n"+ p.toString();
		}
		return  str;
		
	}
	
	
	
}
