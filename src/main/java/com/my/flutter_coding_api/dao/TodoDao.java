package com.my.flutter_coding_api.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.flutter_coding_api.vo.Todo;

@Repository
public class TodoDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public int add(Todo todo) {
		return sqlSession.insert("todo.add",todo);
	}
	
	public List<Todo> findAll(){
		return sqlSession.selectList("todo.getAll");
	}
	
	public int updateComplete(Todo todo) {
		return sqlSession.update("todo.updateComplete",todo);
	}
	
	
}
