package com.niit.app.dao;


import java.util.List;

import com.niit.app.model.Timetable;


public interface TimetableDAO {
	
public List <Timetable> getTimetables();
public void saveTimetable(Timetable theTimetable);
	
	  public Timetable getTimetable(int theId); public void deleteTimetable(int
	  theId);
	 

}
