package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.Model.POList; 

  
@Repository
public class POListDAO extends BaseDAO {
	@Autowired        
	private SqlSessionFactory sqlSessionFactory;
	
	 public List<Map<String, Object>> getAll()
	  {
		 /* List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("POList.getAll");
		 if (POList.getStatus().equals(1))
			{
			 return list;
			}
			else //if (VendorService.getStatus().equals("1"))
			{
				 return list;
			}*/
		 
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("POList.getAll");
	    return list;
	  }
	 public List<Map<String, Object>> getAll1()
	  {
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("POList.getAll1");
	    return list;
	  }
	 public List<Map<String, Object>> getAll3()
	  {   
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorData.getAll3");
	    return list;
	  }
	 
}  