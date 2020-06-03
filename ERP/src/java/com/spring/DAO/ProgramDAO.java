package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Model.Program;
import com.spring.Model.Sdeigroup;
import com.spring.Model.Employee;
import com.spring.Model.VendorService;
import com.spring.Service.ProgramService;



@Repository
public class ProgramDAO extends BaseDAO {  
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	
	 public List<Map<String, Object>> getDistricts()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Program.getDistricts");
	    return list;
	  }
	 public List<Map<String, Object>> getNames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Program.getNames");
	    return list;
	  }
	 public List<Map<String, Object>> getProjects()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Program.getProjects");
	    return list;
	  }
	 public List<Map<String, Object>> getSegments()
	  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Program.getSegments");
		    return list;
		  }
	 public List<Map<String, Object>> getSectors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Program.getSectors");
	    return list;
	  }
	 public List<Map<String, Object>> getGroups()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Program.getGroups");
	    return list;
	  }
	 public void add(Program programservice) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", programservice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Program.Insert", params);
			sqlSession.close();
		}  	
	 public Program getById(String program_name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Program singleuserdetails=sqlSession.selectOne("Program.getById",program_name);
			sqlSession.close();
			return singleuserdetails;
			
		}
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Program.getAll");
	    return list;
	  }
	
	
	 
	 public void remove(String program_name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.delete("Program.deleteData",program_name);
			sqlSession.close();
		}

	
	 public void updateData(Program programservice)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", programservice);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Program.updateData",params);
			sqlSession.close();
		}
	
}
