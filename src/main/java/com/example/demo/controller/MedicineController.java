package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Medicine;
import com.example.demo.service.MedicineDao;

@Controller
public class MedicineController {
	@Autowired
private MedicineDao mdao;
	
	
	@RequestMapping("/insertmedicine")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Medicine a=new Medicine();
		a.setM_id(Integer.parseInt(request.getParameter("m_id")));
		a.setM_name(request.getParameter("m_name"));
		a.setDescription(request.getParameter("description"));
		a.setCategory(request.getParameter("category"));
	    a.setPrice(Integer.parseInt(request.getParameter("price")));
		Medicine ap=mdao.insert(a);
		if(ap!=null) {
			mv.setViewName("medicine1.jsp");
		}
	
		return mv;
	}
	@RequestMapping("/showmedicineadmin")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Medicine> list=mdao.getall();
	mv.setViewName("showmedicinetoadmin.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
	
	@RequestMapping("/deleteMedicine")
	public ModelAndView dltMedicine(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Medicine s=new Medicine();
		s.setM_id(Integer.parseInt(request.getParameter("m_id")));
		String ss=mdao.delete(s);
		if(ss!=null) {
			String msg="deleted Successfully";
			mv.addObject("msg",msg);
			mv.setViewName("medicine1.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/showmedicineuser")
	public ModelAndView shwusrMedicine(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Medicine> list=mdao.getall();
	
	mv.addObject("list",list);
   
	mv.setViewName("showmedicinetouser.jsp");
		return mv;
	}

	@RequestMapping("/updatemedicine")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Medicine s=new Medicine();
		s.setM_id(Integer.parseInt(request.getParameter("m_id")));
		s.setM_name(request.getParameter("m_name"));
		s.setDescription(request.getParameter("description"));
		s.setCategory(request.getParameter("category"));
		s.setPrice(Integer.parseInt(request.getParameter("price")));
		Medicine ss=mdao.updateByName(s);
		if(ss!=null) {
			mv.setViewName("medicine1.jsp");
		}
		return mv;
		}

	@RequestMapping("/searchmedicine")
    public ModelAndView  searchmedicine(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String keyword=request.getParameter("keyword");
		List<Medicine> list=mdao.findBykeyword(keyword);
		
		mv.addObject("list",list);
		
		mv.setViewName("showmedicinetouser2.jsp");
		return mv;
}
}
