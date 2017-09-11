package com.mvc.victor.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.mvc.victor.pojo.UserDO;

@Repository
public class UserDAO {
	
	@Resource
	protected SqlSessionFactory sqlSessionFactory ;
	
	public SqlSession getSession(){
		return sqlSessionFactory.openSession();
	}
	@Cacheable(value="user",key="#userId + 'getUser'")
	public UserDO getUser(String userId){
		
		return (UserDO)getSession().selectOne("com.mvc.victor.UserMapper.selectUser",userId);
	}
	
	public int saveUser(UserDO user){
		return getSession().insert("com.mvc.victor.UserMapper.insertUser",user);
	}
	
	
}
