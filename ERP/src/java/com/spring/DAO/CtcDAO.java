package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;           
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Model.Ctc;
import com.spring.Model.Employee;

@Repository
public class CtcDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	/*
	 public Ctc getDetails(String payname)
	  {
	    Ctc list  = this.sqlSessionTemplate.selectOne("Ctc.getDetails", payname);
	    return list;
	  }
	
	*/
	
	public void add1(Ctc ctcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Ctc.Insert1", params);
		sqlSession.close();
	}
	
	
	

	public void add(Ctc ctcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Ctc.Insert", params);
		sqlSession.close();
	}
	public Ctc getById(String pname)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Ctc singleuserdetails=sqlSession.selectOne("Ctc.getById",pname);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	public List<Ctc> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Ctc> userdetails=sqlSession.selectList("Ctc.getAll");
		sqlSession.close();
		return userdetails;
	}     
	
	
	public List<Ctc> getEarnings() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Ctc> userdetails=sqlSession.selectList("Ctc.getEarnings");
		sqlSession.close();
		return userdetails;
	}     
	
	
	public List<Ctc> getDeductions() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Ctc> regdetails=sqlSession.selectList("Ctc.getDeductions");
		sqlSession.close();
		return regdetails;
	}     
	

	public void remove(String name)
	{         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Ctc.deleteData",name);
		sqlSession.close();
	}

	
	public void updateData(Ctc ctc)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctc);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Ctc.updateData",params);
		sqlSession.close();
	}
}
