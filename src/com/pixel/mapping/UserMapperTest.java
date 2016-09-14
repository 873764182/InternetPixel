package com.pixel.mapping;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.pixel.domain.User;
import com.pixel.utils.MyBatisUtil;

public class UserMapperTest {

	// --------------------------------------------------------------传统的数据库操作执行策略

	@Test
	public void testAdd() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(false);
		String statement = "com.pixel.mapping.UserMapper.addUser";
		User user = new User();
		user.set_id(UUID.randomUUID().toString());
		user.setAccount("873764182");
		user.setNickname("pixel");
		user.setPassword("123456");
		int retResult = sqlSession.insert(statement, user);
		sqlSession.commit();
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testUpdate() throws UnsupportedEncodingException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.pixel.mapping.UserMapper.updateUser";
		User user = new User();
		user.set_id("1fe9989b-f96e-4e8e-aa19-f0f391079011");
		user.setAccount("123456789");
		user.setNickname("testUpdate");
		user.setPassword("123321");
		int retResult = sqlSession.update(statement, user);
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testDelete() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.pixel.mapping.UserMapper.deleteUser";
		int retResult = sqlSession.delete(statement, "1fe9989b-f96e-4e8e-aa19-f0f391079011");
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testGetAll() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.pixel.mapping.UserMapper.getAllUsers";
		List<User> lstUsers = sqlSession.selectList(statement);
		sqlSession.close();
		System.out.println(lstUsers);
	}

	// --------------------------------------------------------------基于注解的数据库操作执行策略

	@Test
	public void testAnnotationAdd() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
		UserMapperInterface mapper = sqlSession.getMapper(UserMapperInterface.class);
		User user = new User();
		user.set_id(UUID.randomUUID().toString());
		user.setAccount("873764182");
		user.setNickname("pixel");
		user.setPassword("123456");
		int add = mapper.add(user);
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(add);
	}

	@Test
	public void testAnnotationUpdate() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
		UserMapperInterface mapper = sqlSession.getMapper(UserMapperInterface.class);
		User user = new User();
		user.set_id("2377fa88-1db8-41e3-958a-506d463cbc73");
		user.setAccount("873764182");
		user.setNickname("testAnnotationUpdate");
		user.setPassword("123456");
		// 执行修改操作
		int retResult = mapper.update(user);
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testAnnotationDelete() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
		UserMapperInterface mapper = sqlSession.getMapper(UserMapperInterface.class);
		// 执行删除操作
		int retResult = mapper.deleteById("2377fa88-1db8-41e3-958a-506d463cbc73");
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testAnnotationGetUser() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
		UserMapperInterface mapper = sqlSession.getMapper(UserMapperInterface.class);
		// 执行查询操作，将查询结果自动封装成User返回
		User user = mapper.getById("3aea1686-2f4b-470f-9b05-209c2b323c5e");
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(user);
	}

	@Test
	public void testAnnotationGetAll() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
		UserMapperInterface mapper = sqlSession.getMapper(UserMapperInterface.class);
		// 执行查询操作，将查询结果自动封装成List<User>返回
		List<User> lstUsers = mapper.getAll();
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(lstUsers);
	}
}
