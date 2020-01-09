package com.themembers.member;

import java.util.HashMap;
import java.util.List;

public interface MemberService {
	public List<Member> findAll();

	public int create(HashMap map);
}
