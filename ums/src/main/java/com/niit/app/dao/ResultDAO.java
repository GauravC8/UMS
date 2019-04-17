package com.niit.app.dao;


import java.util.List;

import com.niit.app.model.Result;





public interface ResultDAO {
	
public List <Result> getResults();
public Result saveResult(Result theResult);
public Result getResult(int theId);
public void deleteResult(int theId);

}
