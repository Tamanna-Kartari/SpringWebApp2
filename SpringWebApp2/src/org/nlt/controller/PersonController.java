package org.nlt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController extends ParentController
{
	public PersonController() 
	{
		System.out.println("Person Controller Object Created");
	}	
	
	@RequestMapping(value="/addPerson",method=RequestMethod.POST)
	public ModelAndView addPerson(HttpServletRequest req,HttpServletResponse resp)
	{
		Map m=new HashMap();
		
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String phone=req.getParameter("phone");
		
		m.put("NameValue", name);
		m.put("AgeValue", age);
		m.put("PhoneValue", phone);
		
		if(name.isEmpty())
		{
			m.put("NameError","*Name Required");
		}
		else if(age.isEmpty())
		{
			m.put("AgeError","*Age Required");
		}
		else if(phone.isEmpty())
		{
			m.put("PhoneError","*Phone Required");
		}
		else
		{
			m.put("SuccessMessage","Record Submitted Successfully");
			m.put("NameValue", "");
			m.put("AgeValue", "");
			m.put("PhoneValue", "");
		}
		
		m.put("Action", "./addPerson");
		m.put("ButtonValue", "SUBMIT");
		m.put("Title", "NLT Infotech Pvt Ltd");
		m.put("PersonList", homeService.getPersons());
		return new ModelAndView("index",m);
	}
}
