package com.general.sys.service.impl;

import com.general.sys.entity.Test;
import com.general.sys.mapper.TestMapper;
import com.general.sys.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhb
 * @since 2019-12-12
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

	@Autowired
	TestMapper mapper;
	
	@Override
	@Transactional
	public void test() {
		// TODO Auto-generated method stub
		Date time = new Date();
		//首先我们插入十万条数据。
		List<Test> list = new ArrayList<Test>();
		Test t = null;
		for (int i = 0; i < 1000; i++) {
			t = new Test();
			t.setName("张三"+i);
			mapper.insert(t);
		}
		System.out.println("-----------------------");
		System.out.println(time);
		System.out.println(new Date());
	}

}
