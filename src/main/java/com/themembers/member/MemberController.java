package com.themembers.member;

import java.util.HashMap;

import com.google.gson.Gson;
import com.themembers.common.JsonController;

import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemberController {

	private Log log = LogFactory.getLog(MemberController.class);
	private JsonController jsonController = new JsonController();

	@Autowired
	MemberService memberService;

	@GetMapping(value = "/member")
	public String findAll() {
		Gson gson = new Gson();
		log.info(gson.toJson(memberService.findAll()));
		return gson.toJson(memberService.findAll());
	}

	@PostMapping(value = "/member")
	public int create(@RequestBody HashMap map) {
		log.info("|INPUT|" + map);
		memberService.create(map);
		return 1;
	}
}
