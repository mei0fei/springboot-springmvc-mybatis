package com.example.mapper;

import java.util.List;

import com.example.model.Blog;
import com.example.model.Blog;


public interface BlogMapper {
	List<Blog> findAllBlogs();
	Blog findBlogById(int id);
	void insertBlog(Blog Blog);
	void updateBlog(Blog Blog);
	void deleteBlog(int id);
	
}
