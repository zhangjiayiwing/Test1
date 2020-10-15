package com.zhiyou.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zhiyou.mapper.TeacherMapper;
import com.zhiyou.model.Teacher;

public class MainClass2 {

	@Test
	public void add() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		TeacherMapper mapper = session.getMapper(TeacherMapper.class);
		Teacher teacher = new Teacher(111,111, "111", "1");
		mapper.add(teacher);
		session.commit();
		session.close();
	}
	@Test
	public void delete() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		TeacherMapper mapper = session.getMapper(TeacherMapper.class);
		mapper.delete(111);
		session.commit();
		session.close();
	}
	@Test
	public void update() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		TeacherMapper mapper = session.getMapper(TeacherMapper.class);
		Teacher teacher = new Teacher(111,222, "222", "1");
		mapper.update(teacher);
		session.commit();
		session.close();
	}
	@Test
	public void all() throws IOException{
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml"));
		SqlSession session = factory.openSession();
		TeacherMapper mapper = session.getMapper(TeacherMapper.class);
		List<Teacher> all = mapper.all();
		System.out.println(all);
		session.commit();
		session.close();
	}
}
