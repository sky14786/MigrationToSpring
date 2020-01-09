package com.themembers.member;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.themembers.common.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public Object findAll() {
		return memberMapper.findAll();
	}

	@Override
	public int create(HashMap map) {
		map.put("UPD_USER",map.get("ID"));
		map.put("UPD_DATE","DEFAULT");
		return memberMapper.create(map);
	}

}