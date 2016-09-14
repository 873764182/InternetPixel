package com.pixel.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pixel.domain.User;

public interface UserMapperInterface {

	@Insert("insert into users(_id,account,nickname,password) values(#{_id},#{account},#{nickname},#{password})")
	public int add(User user);

	@Delete("delete from users where _id=#{_id}")
	public int deleteById(String _id);

	@Update("update users set account=#{account},nickname=#{nickname},password=#{password} where _id=#{_id}")
	public int update(User user);

	@Select("select * from users where _id=#{_id}")
	public User getById(String _id);

	@Select("select * from users")
	public List<User> getAll();

}
