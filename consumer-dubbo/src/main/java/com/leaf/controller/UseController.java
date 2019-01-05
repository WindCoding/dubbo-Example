package com.leaf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leaf.demo.service.UserService;

@RestController
public class UseController {

	@Reference
	private UserService userServiceImpl;
	
	
	@RequestMapping("/getName")
	public String getName() {
		return this.userServiceImpl.getName();
	}
}
