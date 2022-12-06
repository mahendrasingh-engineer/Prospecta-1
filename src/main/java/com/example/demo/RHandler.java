package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RHandler {
	@Autowired
	EntryR rr;
	
	@GetMapping("/getbyTitle")
	List<Entry> fun1(@RequestParam("category") String cat) {
		
		return rr.findByCategory(cat);
		
	}
	
	@GetMapping("/Enter")
	String fun2(@RequestParam("title") String title,@RequestParam("category") String cat,@RequestParam("description") String desc) {
		
		rr.save(new Entry( title, cat, desc));
		
		return "successfully added";
		
	}
}
