package com.themembers.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.themembers.common.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> findAll();
	public List<HashMap<String,Object>> findAlltest();

	public int create(HashMap map);
}
