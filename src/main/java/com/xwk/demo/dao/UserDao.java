package com.xwk.demo.dao;

import com.xwk.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    public void save(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    public void update(User user);

    @Delete("delete from user where id=#{id}")
    public void delete(Integer id);

    @Select("select * from user")
    public List<User> getAll();

    @Select("select * from user where id=#{id}")
    public User findOne(Integer id);


}
