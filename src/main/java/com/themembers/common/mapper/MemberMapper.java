package com.themembers.common.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.themembers.common.dto.MemberDTO;


@Mapper
public interface MemberMapper {
	List<MemberDTO> findAll();
	
	List<HashMap<String,Object>> findAlltest();
	
	int create(HashMap map);
	
	int createTest(MemberDTO member);
}
