package com.zhiyou.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zhiyou.mapper.ScoreMapper;
import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.Score;
import com.zhiyou.model.User;

public class MainClass {
 
	@Test
	public void  add() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User("111", "111", 12, 111);
		mapper.add(user);
		session.commit();
		session.close();
		
	}
	@Test
	public void  update() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User("111", "111", 12, 32);
		mapper.update(user);
		session.commit();
		session.close();
		
	}
	@Test
	public void  all() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.all();
		System.out.println(list);
		session.commit();
		session.close();
		
	}
	@Test
	public void  delete() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User("111", "111", 12, 111);
		mapper.delete(32);
		session.commit();
		session.close();
		
	}
	@Test
	public void  add2() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		ScoreMapper mapper = session.getMapper(ScoreMapper.class);
		Score score =new Score(111, "111", 111);
		mapper.add(score);
		session.commit();
		session.close();
		
	}
	@Test
	public void  update2() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		ScoreMapper mapper = session.getMapper(ScoreMapper.class);
		Score score =new Score(111, "222", 2222);
		mapper.update(score);
		session.commit();
		session.close();
		
	}
	@Test
	public void  all2() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		ScoreMapper mapper = session.getMapper(ScoreMapper.class);
		List<Score> list = mapper.selectAll();
		System.out.println(list);
		session.commit();
		session.close();
		
	}
	@Test
	public void  delete2() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		ScoreMapper mapper = session.getMapper(ScoreMapper.class);
		mapper.delete(111);
		session.commit();
		session.close();
		
	}
	
}
