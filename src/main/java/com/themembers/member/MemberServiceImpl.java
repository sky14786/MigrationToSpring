package com.themembers.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.themembers.common.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public List<Member> findAll() {
		return memberMapper.findAll();
	}

	@Override
	public List<HashMap<String,Object>> findAlltest() {
		return memberMapper.findAlltest();
	}

	@Override
	public int create(HashMap map) { 
		map.put("UPD_USER", map.get("ID"));
		map.put("UPD_DATE", "DEFAULT");
		return memberMapper.create(map);
	}

}
