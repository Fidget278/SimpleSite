package com.SimpleSite.biz;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SimpleSite.service.MemberService;

@SpringBootTest
class SimpleSiteApplicationTests {

	@Autowired
	MemberService service;
	
	@Test
	void contextLoads() {
		//assertNotNull(service);
		System.out.println(service.test());
	}

}
