package com.themembers.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.themembers.common.dto.MemberDTO;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class MemberController {

	private Log log = LogFactory.getLog(MemberController.class);

	@Autowired
	MemberService memberService;

	@GetMapping(value = "/member")
	public List<MemberDTO> findAll() {
		return memberService.findAll();
	}

	@GetMapping(value = "/member/test")
	public List<HashMap<String, Object>> findAlltest() {
		return memberService.findAlltest();
	}

	@PostMapping(value = "/member")
	public int create(@RequestBody HashMap<String, Object> map) {
		memberService.create(map);
		return 1;
	}

	@PostMapping(value = "/member/test")
	public int createTest(@RequestBody MemberDTO member) {
		memberService.createTest(member);
		return 1;
	}

	@PutMapping(value = "/member/testUp")

	public int updateTest(@RequestBody MemberDTO member) {
		memberService.updateTest(member);
		return 1;
	}

	@DeleteMapping(value = "/member/testDe")
	public int delelteTest(@RequestBody MemberDTO member) {
		memberService.deleteTest(member);
		return 1;
	}
}
