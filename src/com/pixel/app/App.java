package com.pixel.app;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.pixel.domain.User;

public class App {

	@Test
	public void batisTest() {
		String resource = "MyBatisConfig.xml";
		InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		String statement = "com.pixel.mapping.UserMapper.getUser";
		User user = session.selectOne(statement, "550E8400-E29B-11D4-A716-446655440000");
		System.out.println(user);
	}

}
