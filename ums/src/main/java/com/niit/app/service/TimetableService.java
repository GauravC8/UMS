package com.niit.app.service;

import java.util.List;

import com.niit.app.model.Timetable;

public interface TimetableService {

	public List<Timetable> getTimetables();
	
	  
	  public void saveTimetable(Timetable theTimetable); 
	  public Timetable getTimetable(int theId); 
	  public void deleteTimetable(int theId);
	  
	 
}
