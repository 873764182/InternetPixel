package com.pixel.utils;

import java.io.InputStream;

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
		InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream("MyBatisConfig.xml");
		return new SqlSessionFactoryBuilder().build(is);
	}

	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}

	public static SqlSession getSqlSession(boolean isAutoCommit) {
		return getSqlSessionFactory().openSession(isAutoCommit); // 是否提交
	}

}
