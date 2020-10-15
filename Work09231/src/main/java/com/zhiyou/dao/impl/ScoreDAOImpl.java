package com.zhiyou.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.zhiyou.dao.ScoreDAO;

import com.zhiyou.model.Score;

@Repository
public class ScoreDAOImpl extends JdbcDaoSupport implements ScoreDAO {

	@Autowired
	public void setDatas(DataSource dataSource){
		super.setDataSource(dataSource);
	}

	public void add(Score Score) {
		String sql = "insert into Score values(null,?,?)";
		this.getJdbcTemplate().update(sql,Score.getName(),Score.getGrade());
		
	}

	public void delete(int id) {
		String sql = "delete from Score where id=?";
		this.getJdbcTemplate().update(sql,id);
	}

	public void update(Score Score) {
		String sql = "update Score set name=?,grade=? where id = ?";
		this.getJdbcTemplate().update(sql,Score.getName(),Score.getGrade(),Score.getId());
		
	}

	public List<Score> selectAll() {
		String sql  ="select * from Score";
		return this.getJdbcTemplate().query(sql, new ScoreMapper());
	}

	class ScoreMapper implements RowMapper<Score>{

		public Score mapRow(ResultSet rs, int rownum) throws SQLException {
			
			Score user = new Score();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setGrade(rs.getInt("grade"));
			
			
		
			return user;
		}
		
	}
	public Score byName(String name, Integer grade) {
		String sql = "select * from Score where name = ? and grade = ?";
		
		return this.getJdbcTemplate().queryForObject(sql, new ScoreMapper(),name,grade);         
	}

	public Score byId(Integer id) {
		String sql = "select * from Score where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, new ScoreMapper(),id);
	}

	

	

}
