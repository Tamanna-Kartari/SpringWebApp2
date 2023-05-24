package org.nlt.services;
import java.util.ArrayList;

import org.nlt.model.Persons;
import org.springframework.stereotype.Service;

@Service
public class HomeServices {

	public HomeServices() {
		System.out.println("Home Services Object Created");
	}
	

	public ArrayList<Persons> getPersons()
	{
		ArrayList<Persons> personArrayList=new ArrayList<>();
		
		personArrayList.add(new Persons(101, "Shubham", 21, 1234566, 1, "Male"));
		personArrayList.add(new Persons(102, "Shubham2", 21, 1234566, 1, "Male"));
		personArrayList.add(new Persons(103, "Shubham3", 21, 1234566, 1, "Male"));
		personArrayList.add(new Persons(104, "Shubham4", 21, 1234566, 1, "Male"));
		personArrayList.add(new Persons(105, "Shubham5", 21, 1234566, 1, "Male"));
		return personArrayList;
	}
}
