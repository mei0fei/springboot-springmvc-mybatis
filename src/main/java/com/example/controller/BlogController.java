package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mapper.BlogMapper;
import com.example.model.Blog;
import com.example.model.City;
import com.example.service.CityService;

@Controller
public class BlogController {
	@Autowired
    BlogMapper blogMapper;
	
	@GetMapping("/showBlogs")
    public String findBlogById() {
        
		Blog blog =  blogMapper.findBlogById(1);
        System.out.println(blog);
        return "";
    }
}
