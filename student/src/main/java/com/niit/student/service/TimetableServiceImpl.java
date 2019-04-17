package com.niit.timetable.service;

	import java.util.List;

	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.niit.timetable.dao.TimetableDAO;
import com.niit.timetable.model.Timetable;


	@Service
	public class TimetableServiceImpl  implements TimetableService {
		@Autowired
		private TimetableDAO timetableDAO;
		
		@Override
		@Transactional
		public List<Timetable> getTimetables() {
			return timetableDAO.getTimetables();
		}

		@Override
		@Transactional
		public void saveTimetable(Timetable theTimetable) {
			timetableDAO.saveTimetable(theTimetable);
		}

		@Override
		@Transactional
		public Timetable getTimetable(int theId) {
			return timetableDAO.getTimetable(theId);
		}

		@Override
		@Transactional
		public void deleteTimetable(int theId) {
			timetableDAO.deleteTimetable(theId);
		}
	}
