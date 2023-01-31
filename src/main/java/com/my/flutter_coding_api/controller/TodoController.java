package com.my.flutter_coding_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.flutter_coding_api.service.TodoService;
import com.my.flutter_coding_api.vo.Todo;

@Controller
@RequestMapping(value="/todo")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@GetMapping("test")
	public @ResponseBody String test() {
		
		return "test-ok";
	}
	
	
	@PostMapping("add")
	public @ResponseBody String add(
				@RequestParam(value="type") String type,
				@RequestParam(value="title") String title
			) {
		
		Todo todo = new Todo();
		todo.setType(type);
		todo.setTitle(title);
		
		todoService.add(todo);
		
		return "ok";
	}
	
	
	@GetMapping("all")
	public @ResponseBody List<Todo> all(){
		
		
		List<Todo> list = todoService.findAll();
		
		return list;
	}
	
	
	
	@PostMapping("updateComplete")
	public @ResponseBody String updateComplete(
				@RequestParam(value="todo_idx") int todo_idx,
				@RequestParam(value="ny") String ny
			) {
		
		Todo todo = new Todo();
		todo.setTodo_idx(todo_idx);
		todo.setComplete_ny(ny);
		
		todoService.updateComplete(todo);
		
		return "ok";
	}
	
	
	
	
	
	
}
