package com.example.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Account;

@Controller
@RequestMapping(value="account")
public class AccountController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "redirect:/account/login";
	}
	
	@GetMapping(value="login")
	public String login(ModelMap model, HttpSession session, HttpServletRequest request) {
		Account acc = checkCookie(request);
		
		if(acc==null) {
			model.put("account", new Account());
			return "account/login";
		}else {
			if(do_login(acc.getUsername(), acc.getPassword())) {
				session.setAttribute("username", acc.getUsername());
				return "account/welcome";
			}else {
				model.put("error", "账号不正确！");
				model.put("account", new Account());
				return "account/login";
			}
		}
		
	}
	
	@PostMapping(value="login")	
	public String login(@ModelAttribute(value="account") Account account, 
			ModelMap model, HttpSession session, HttpServletRequest request, HttpServletResponse response ) {
		
		if(do_login(account.getUsername(), account.getPassword())) {
			session.setAttribute("username", account.getUsername());
			if(request.getParameter("remember")!=null) {
				Cookie ckUsername = new Cookie("username", account.getUsername());
				ckUsername.setMaxAge(3600);
				response.addCookie(ckUsername);
				
				Cookie ckPassword = new Cookie("password", account.getPassword());
				ckPassword.setMaxAge(3600);
				response.addCookie(ckPassword);
			}
			return "account/welcome";
		}else {
			model.put("account", new Account());
			return "account/login";
		}
		
	}
	
	@GetMapping(value="logout")	
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		session.removeAttribute("username");
		for(Cookie ck: request.getCookies()) {
			if(ck.getName().equals("username")) {
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
			if(ck.getName().equals("password")) {
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
		}
		return "redirect:/account/login";
	}
	
	public Account checkCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		Account account = null;
		String username="", password="";
		for(Cookie ck: cookies) {
			if(ck.getName().equals("username"))
				username = ck.getValue();
			if(ck.getName().equals("password"))
				password = ck.getValue();
		}
		
		if( !username.isEmpty() && !password.isEmpty())
			account = new Account(username, password);
		return account;
	}
	
	private boolean do_login(String username, String password) {
		return username.equals("abc") && password.equals("123");
		
	}
	
}
