package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Model.Calc;
import com.spring.Model.Ctc;
import com.spring.Model.EmployeeMaster;



@Repository
public class CalcDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;     
	
	
	
	/*public List<Calc> getPayNameData(Calc table) {   
		SqlSession sqlSession = sqlSessionFactory.openSession();	
		String payname = table.payname;
		List<Calc> paySlipData=sqlSession.selectList("Calc.getPayNameData", payname);
		sqlSession.close();
		return paySlipData;     
	}   
	*/
	public Calc getById(String name)
	{
		
		Calc singleuserdetails=this.sqlSessionTemplate.selectOne("Calc.getById",name);
		
		return singleuserdetails;
		
	}
	  
	
	
	public List<Calc> getPayname() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Calc> userdetails1=sqlSession.selectList("Calc.getPayname");
		sqlSession.close();
		return userdetails1;
	}	
	
	
	
	
	
	public void add(Calc calcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", calcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Calc.Insert", params);
		sqlSession.close();
	}
	
	
    
	public List<Calc> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Calc> userdetails=sqlSession.selectList("Calc.getAll");
		sqlSession.close();
		return userdetails;
	}
	
	
	public List<Calc> getAll1() {       
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Calc> userdetails=sqlSession.selectList("Calc.getAll1");
		sqlSession.close();
		return userdetails;
	}
		
		
		
		
		
	 public List<Map<String, Object>> getYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getYears");
	    return list;
	  }
	 
	 
	 public List<Map<String, Object>> getCaders()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getCaders");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getGrades()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getGrades");
	    return list;
	  }
	
}
