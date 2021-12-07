package com.SimpleSite.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("memberMapper")
@Mapper
public interface MemberMapper {
	public String test();
}
