package com.niit.timetable.service;

	import java.util.List;

	import com.niit.timetable.model.Timetable;

public interface TimetableService {

		public List <Timetable> getTimetables();
		
		public void saveTimetable(Timetable theTimetable);
		public Timetable getTimetable(int theId);
		public void deleteTimetable(int theId);

	}
