package com.multi.animul.cs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ask_replyController {

	@Autowired
	Ask_replyService service;
	
	@RequestMapping("cs/ask_reply_insert")
	public void insert(Ask_replyVO vo, Model model) {
		System.out.println(vo);
		int result = service.insert(vo);
		model.addAttribute("result", result);
	}
	
	
	
}
