package com.themembers.member;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.themembers.common.jwt.TokenManager;

@RestController
@RequestMapping("/api")
public class MemberController {

	private Log log = LogFactory.getLog(MemberController.class);

	@Autowired
	MemberService memberService;

	@GetMapping(value = "/member")
	public Object findAll() {
		return memberService.findAll();
	}

	@GetMapping(value = "/test")
	public String test() {
		String token = TokenManager.createToken();
		log.info(token);
		try {
			TokenManager.getTokenFromJwtString(token);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "test";
	}
	
	
	
	
}
