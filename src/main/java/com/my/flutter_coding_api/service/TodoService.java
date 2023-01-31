package com.my.flutter_coding_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.flutter_coding_api.dao.TodoDao;
import com.my.flutter_coding_api.vo.Todo;

@Service
public class TodoService {
	
	
	
	@Autowired
	TodoDao todoDao;
	
	
	public int add(Todo todo) {
		return todoDao.add(todo);
	}
	
	
	public List<Todo> findAll(){
		return todoDao.findAll();
	}
	
	
	public int updateComplete(Todo todo) {
		return todoDao.updateComplete(todo);
	}
}










