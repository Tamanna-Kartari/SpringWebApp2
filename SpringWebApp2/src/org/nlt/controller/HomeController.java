package org.nlt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends ParentController {

	public HomeController() {
		System.out.println("Home Controller Object Created");
	}
	
	@RequestMapping(value="/")
	public ModelAndView home()
	{
		System.out.println(cityService);
		System.out.println(homeService);
		System.out.println(personService);
		System.out.println(stateService);
		
		Map m=new HashMap();
		System.out.println("Home method");
		m.put("Title", "NLT Infotech Pvt Ltd");
		m.put("Action", "./addPerson");
		m.put("ButtonValue", "SUBMIT");
		m.put("PersonList", homeService.getPersons());         
		return new ModelAndView("index",m);
	}
}
