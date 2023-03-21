package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminDao;
@Controller
public class AdminController {
	@Autowired
	AdminDao ad_dao;
	
	@RequestMapping("/insertadmin")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Admin a=new Admin();
		a.setUsername(request.getParameter("adusnm"));
		String user=a.getUsername();
		a.setPassword(request.getParameter("adpass"));
		String pass=a.getPassword();
		String pass1=ad_dao.getPassword(user);
		if(pass1!=null) {
			if(pass.equals(pass1)) {
				System.out.println(pass);
				mv.setViewName("medicine.jsp");
			}
			else {
				String msg="Incorrect password..";
				mv.addObject("msg",msg);
				mv.setViewName("adminlogin1.jsp");
			}
			
		}
		else {
			String msg="Not a registered admin!!Try Again..";
			mv.addObject("msg",msg);
			mv.setViewName("adminlogin1.jsp");
		}
		return mv;
	}
	@RequestMapping("/updateadmpass")
	public ModelAndView editadpass(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Admin a=new Admin();
		a.setUsername(request.getParameter("adusnm"));
		String user=a.getUsername();
		int ad_id=ad_dao.getId(user);
		a.setAd_id(ad_id);
		a.setPassword(request.getParameter("adpass"));
		Admin aa=ad_dao.updatePass(a);
		if (aa!=null) {
			String msg="Updated Successfully";
			mv.addObject("msg",msg);
			mv.setViewName("adminlogin1.jsp");
		}
		return mv;		
}
}
