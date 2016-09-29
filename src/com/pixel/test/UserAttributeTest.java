package com.pixel.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.internal.Classes;

import com.pixel.domain.User;
import com.pixel.utils.MyBatisUtil;

public class UserAttributeTest {
	
	@Test
	public void testGetClass() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.pixel.mapping.UserAttributeMapping.getUserAttribute";
		User clazz = sqlSession.selectOne(statement, "efb52f21-1ab6-4365-8068-9aa1cad50433");
		sqlSession.close();
		System.out.println(clazz);
	}

	@Test
	public void testGetClass2() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.pixel.mapping.UserAttributeMapping.getUserAttribute2";
		// 执行查询操作，将查询结果自动封装成Classes对象返回
		Classes clazz = sqlSession.selectOne(statement, "efb52f21-1ab6-4365-8068-9aa1cad50433");// 查询class表中id为1的记录
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(clazz);
	}
}
