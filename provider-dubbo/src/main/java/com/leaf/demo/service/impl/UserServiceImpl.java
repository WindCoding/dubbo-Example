package com.leaf.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leaf.demo.service.UserService;


@Service
public class UserServiceImpl  implements UserService{

	
	public String getName() {
		return "hello";
	}

}
