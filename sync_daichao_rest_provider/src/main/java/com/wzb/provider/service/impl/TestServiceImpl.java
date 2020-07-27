package com.wzb.provider.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wzb.provider.entity.Tb1;
import com.wzb.provider.mapper.Tb1Mapper;
import com.wzb.service.TestService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.dubbo.config.annotation.Service;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Satsuki
 * @time 2019/8/27 15:35
 * @description: 模拟数据库事务实现
 */
@Service(version = "1.0.0", interfaceClass = TestService.class)
//@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

	@Autowired
	private Tb1Mapper tb1Mapper;

	@Override
	public void ins() {
		System.out.println("insert");
	}

	@Override
	public void del() {
		System.out.println("delete");
	}

	@Override
	public void upd() {
		System.out.println("update");
	}

	@Override
	public void sel() {
		System.out.println("select");
	}

	@Override
	public String query() {

		List<Tb1> list = tb1Mapper.selectList(new EntityWrapper<>());
		String aListJson = JSON.toJSONString(list);
		return aListJson;
	}

	@Override
	public String page(int offset, int limit) {
		RowBounds rowBounds = new RowBounds((offset-1)*limit,limit);
		List<Map<String, Object>> list = tb1Mapper.selectMapsPage(rowBounds, new EntityWrapper<>());
		String aListJson = JSON.toJSONString(list);
		return aListJson;
	}

//	list map 转list java对象
//	class User{
//	    Long id;
//	    String userName;
//	    String password;
//	    String order;
//	    String name;
//	}
//	List<Map<String, Object>> listMap = new HashMap<>(10);
//
//	JSONArray jsonArray = new JSONArray();
//	jsonArray.addAll(listMap);
//	List<User> list = jsonArray.toJavaList(User.class);
}
