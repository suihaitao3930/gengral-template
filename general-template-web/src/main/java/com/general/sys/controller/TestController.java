package com.general.sys.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.general.sys.entity.Test;
import com.general.sys.service.TestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhb
 * @since 2019-12-12
 */
@RestController
@RequestMapping("/sys/test")
@Api(value="测试插入一百万条数据")
public class TestController {

	@Autowired
	private TestService testService;
	
	@PostMapping("/hello")
	@ApiOperation(value = "hello")
	private String helloWorld() {
		testService.test();
		return "hello world";
	}
}
