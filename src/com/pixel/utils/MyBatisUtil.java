package com.pixel.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * @author Administrator
 *
 */
public class MyBatisUtil {

	public static SqlSessionFactory getSqlSessionFactory() {
		return new SqlSessionFactoryBuilder()
				.build(MyBatisUtil.class.getClassLoader().getResourceAsStream("MyBatisConfig.xml"));
	}

	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}

	public static SqlSession getSqlSession(boolean isAutoCommit) {
		return getSqlSessionFactory().openSession(isAutoCommit); // 是否提交
	}

}
