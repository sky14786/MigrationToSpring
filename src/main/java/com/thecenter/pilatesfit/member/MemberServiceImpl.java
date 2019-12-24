package com.thecenter.pilatesfit.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thecenter.pilatesfit.common.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public Object findAll() {
		return memberMapper.findAll();
	}
	
}
