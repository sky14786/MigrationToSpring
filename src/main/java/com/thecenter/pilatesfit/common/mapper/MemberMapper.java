package com.thecenter.pilatesfit.common.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper {
	List<Map<String,Object>> findAll();
}
