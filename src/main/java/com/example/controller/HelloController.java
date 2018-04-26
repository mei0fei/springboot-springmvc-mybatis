package com.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Student;

@Controller
public class HelloController {
	@RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("name", "world");
        return "index";
    }
	//@RequestMapping映射用户请求到控制器
	@RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePath() {
	    return "Get some Foos";
	}
	//@RequestMapping与http头
	@RequestMapping(
	  value = "/ex/foos2", 
	  headers = { "key1=val1", "key2=val2" }, method = RequestMethod.GET)
	@ResponseBody
	public String getFoosWithHeaders() {
	    return "Get some Foos with Header";
	}
	//Accept=application/json
	@RequestMapping(
	  value = "/ex/foos3", 
	  method = RequestMethod.GET, 
	  headers = "Accept=application/json")
	@ResponseBody
	public String getFoosAsJsonFromBrowser() {
	    return "Get some Foos with Header Old";
	}
	//@RequestMapping的produces 
	@RequestMapping(
		value = "/ex/foos4", 
		method = RequestMethod.GET, 
		produces = "application/json"
	)
	@ResponseBody
	public Student getFoosAsJsonFromREST() {
		return new Student("smith", 10);
	}
	
	//single @PathVariable
	@RequestMapping(value = "/ex/foos/{numericId:[\\d]+}", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariable(
	@PathVariable("id") long id) {
		return "Get a specific Foo with id=" + id;
	}

	//multi @PathVariable
	@RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariables
	  (@PathVariable long fooid, @PathVariable long barid) {
	    return "Get a specific Bar with id=" + barid + 
	      " from a Foo with id=" + fooid;
	}
	
	// @PathVariable与正则表达式
	@RequestMapping(value = "/ex/foos6/{numericId:[\\d]+}", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariable2(
	@PathVariable("numericId") long id) {
		return "Get a specific Foo with id=" + id;
	}
	//请求参数
	@RequestMapping(value = "/ex/bars", method = RequestMethod.GET)
	@ResponseBody
	public String getBarBySimplePathWithRequestParam(
	  @RequestParam("id") long id) {
	    return "Get a specific Bar with id=" + id;
	}
	//多个请求参数
	@RequestMapping(
	  value = "/ex/bars2", 
	  params = { "id", "second" }, 
	  method = RequestMethod.GET)
	@ResponseBody
	public String getBarBySimplePathWithExplicitRequestParams(
	  @RequestParam("id") long id) {
	    return "Narrow Get a specific Bar with id=" + id;
	}
	//多个映射URL
	@RequestMapping(
	  value = { "/ex/advanced/bars", "/ex/advanced/foos" }, 
	  method = RequestMethod.GET)
	@ResponseBody
	public String getFoosOrBarsByPath() {
	    return "Advanced - Get some Foos or Bars";
	}
	//多个http请求方法
	@RequestMapping(
	  value = "/ex/foos/multiple", 
	  method = { RequestMethod.PUT, RequestMethod.POST }
	)
	@ResponseBody
	public String putAndPostFoos() {
	    return "Advanced - PUT and POST within single method";
	}
	//响应任何没有定义的请求
	@RequestMapping(value = "*", 
			method = { RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public String getFallback() {
	    return "Fallback for GET Requests";
	}
	//@RequestBody
	@PostMapping(value="/request",
			consumes="application/json",
			produces="application/json"
			)
	@ResponseBody
	public Student postController(
	  @RequestBody Student student) {
	    
	    return student;
	}
	
	
	

	
}
