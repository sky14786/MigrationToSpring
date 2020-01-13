package com.themembers.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MemberService {
	public List<Member> findAll();
	public List<HashMap<String,Object>> findAlltest();

	public int create(HashMap map);
}
