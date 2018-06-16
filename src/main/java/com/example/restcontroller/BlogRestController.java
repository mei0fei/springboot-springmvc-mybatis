package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.BlogMapper;
import com.example.model.Blog;


@RestController
public class BlogRestController {
	@Autowired
    BlogMapper blogMapper;
	
	@GetMapping(value="/blogs", produces="application/json")
    public List<Blog> blogs() {
		return blogMapper.findAllBlogs();
    }
	
	@GetMapping(value="/blogs/{id}", produces="application/json")
    public Blog blogById(@PathVariable int id) {
		return blogMapper.findBlogById(id);
    }
	
	@PostMapping(value="/blogs", consumes="application/json", produces="application/json")
    public void insertBlog(@RequestBody Blog blog) {
		 blogMapper.insertBlog(blog);
    }
	
	@PutMapping(value="/blogs", consumes="application/json", produces="application/json")
    public void updateBlog(@RequestBody Blog blog) {
		 blogMapper.updateBlog(blog);
    }
	
	@DeleteMapping(value="/blogs/{id}", produces="application/json")
    public void deleteBlog(@PathVariable int id) {
		 blogMapper.deleteBlog(id);
    }
	
}


