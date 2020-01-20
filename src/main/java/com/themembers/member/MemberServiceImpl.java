package com.themembers.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.themembers.common.dto.MemberDTO;
import com.themembers.common.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public List<MemberDTO> findAll() {
		return memberMapper.findAll();
	}

	@Override
	public List<HashMap<String, Object>> findAlltest() {
		return memberMapper.findAlltest();
	}

	@Override
	public int create(HashMap map) {
		map.put("updUser", map.get("memId"));
		map.put("updDate", "DEFAULT");
		System.out.println(map);
		return memberMapper.create(map);
	}

}
