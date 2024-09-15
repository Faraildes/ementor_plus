package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.Teacher;

public class TeacherService {
	
	public List<Teacher> findAll(){
		List<Teacher> list = new ArrayList<>();		
		list.add(new Teacher(1, "Joao", "12345678998", "987456321", new Date(), 5000.00, "não", "não"));
		list.add(new Teacher(2, "Joa", "12345523198", "9874568971", new Date(), 8000.00, "sim", "não"));
		list.add(new Teacher(3, "Joana", "25345678998", "987454721", new Date(), 6000.00, "não", "sim"));
		return list;		
	}

}
