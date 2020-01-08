package com.themembers.common.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper {
	List<HashMap<String,Object>> findAll();
	int create(HashMap map);
}
