package kr.or.lifeisgift.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GuestBookController {
	@GetMapping(path="/list")
	public String list() {
		return "list";
	}
	
	@PostMapping(path="/write")
	public String write(@RequestParam(name="name", required=true)String name, @RequestParam(name="content", required=true)String content) {
		return "list";
	}
	

}
