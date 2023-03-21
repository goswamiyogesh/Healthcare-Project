package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.BankDetails;
import com.example.demo.entity.Purchase;
import com.example.demo.service.BankDao;
import com.example.demo.service.PurchaseDao;

@Controller
public class BankController {
@Autowired
 private BankDao bdao;
@Autowired
private PurchaseDao pdao;

@RequestMapping("/proceedpay")
public ModelAndView payment(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	int price=Integer.parseInt(request.getParameter("mprice"));
	BankDetails bd=new BankDetails();
	bd.setBid(Integer.parseInt(request.getParameter("bid")));
	int bid=bd.getBid();
	long balance1=bdao.getBalance(bid);
	int balance=(int)balance1;
	if(balance>price) {
		Purchase p=new Purchase();
		p.setMedicinename(request.getParameter("mname"));
		p.setMedicinepr(request.getParameter("mprice"));
		Purchase pp=pdao.insert(p);
		mv.setViewName("paysuccess.jsp");
	}
	else {
		mv.setViewName("payfail.jsp");
	}
	return mv;
}
}