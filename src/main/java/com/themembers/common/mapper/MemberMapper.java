package com.themembers.common.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.themembers.member.Member;

@Mapper
@Repository
public interface MemberMapper {
	List<Member> findAll();

	int create(HashMap map);
}
