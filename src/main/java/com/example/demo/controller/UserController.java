package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.service.UserDao;
@Controller
public class UserController {
	@Autowired
	private UserDao u_dao;
	
	
	@RequestMapping("/insertuser")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User a=new User();
		a.setName(request.getParameter("name"));
		a.setPassword(request.getParameter("pass"));
		a.setEmail(request.getParameter("email"));
		a.setCountry(request.getParameter("country"));
		a.setLogin(Integer.parseInt(request.getParameter("login")));

		User ap= u_dao.insert(a);
		if(ap!=null) {
			String s="SignUp/Login Successful!";
			mv.addObject("s",s);
	
		mv.setViewName("userlogin1.jsp");
			}
		return mv;
	}
	
	@RequestMapping("/loginuser")
	public ModelAndView loginControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User a=new User();
		a.setName(request.getParameter("usnm"));
		String name=a.getName();
		a.setPassword(request.getParameter("pass"));
		String pass=a.getPassword();
		String pass1=u_dao.userPwd(name);
		String cname=u_dao.FindtheName(name);
		
		if(pass1!=null) {
	
			if(pass.equals(pass1)) {
				String msg="Welcome "+cname+" to medicine ..order your medicine ";
				mv.addObject("cname",cname);
				mv.addObject("msg",msg);
				mv.setViewName("showmedicinetouser1.jsp");
			}
			else {
				String msg="Check credential and try again..Incorrect Password!!";
				mv.setViewName("userlogin1.jsp");
				mv.addObject("msg",msg);
			}
		}
		else {
			String msg="Not registered!!Sign Up first!!";
			mv.setViewName("userlogin1.jsp");
			mv.addObject("msg",msg);
		}
		return mv;
	}
	
	@RequestMapping("/displayalluser")
	public ModelAndView shwusr(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<User> list=u_dao.getall();
	mv.setViewName("usernamelist.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	@RequestMapping("/deleteuser")
	public ModelAndView dltusr(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User a =new User();
		a.setId(Integer.parseInt(request.getParameter("id")));
		String ss=u_dao.delete(a);
		if(ss!=null) {
			String msg="removed the user successfully";
			mv.addObject("msg",msg);
			mv.setViewName("medicine1.jsp");
		}
		return mv;
}
}