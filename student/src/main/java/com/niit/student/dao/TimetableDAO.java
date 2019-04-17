package com.niit.timetable.dao;


import java.util.List;

import com.niit.timetable.model.Timetable;


public interface TimetableDAO {
	
public List <Timetable> getTimetables();
public void saveTimetable(Timetable theTimetable);
public Timetable getTimetable(int theId);
public void deleteTimetable(int theId);

}
