package com.themembers.common.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.themembers.member.Member;

@Mapper
@Repository
public interface MemberMapper {
	List<Member> findAll();
	
	List<HashMap<String,Object>> findAlltest();
	

	int create(HashMap map);
}
