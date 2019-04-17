package com.niit.app.service;

	import java.util.List;

	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.niit.app.dao.ResultDAO;
import com.niit.app.model.Result;




	@Service
	public class ResultServiceImpl  implements ResultService {
		@Autowired
		private ResultDAO resultDAO;
		
		@Override
		@Transactional
		public List<Result> getResults() {
			return resultDAO.getResults();
		}

		@Override
		@Transactional
		public Result saveResult(Result theResult) {
			return resultDAO.saveResult(theResult);
		}

		@Override
		@Transactional
		public Result getResult(int theId) {
			return resultDAO.getResult(theId);
		}

		@Override
		@Transactional
		public void deleteResult(int theId) {
			resultDAO.deleteResult(theId);
		}
	}
