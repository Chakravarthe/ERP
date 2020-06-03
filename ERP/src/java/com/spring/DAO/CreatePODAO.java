package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Model.CreatePO;
import com.spring.Model.VendorService;
import com.spring.Service.CreatePOService;



@Repository
public class CreatePODAO extends BaseDAO {  
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	 public List<Map<String, Object>> getYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getYears");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getMonths()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getMonths");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getPurchaseOrderType()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPurchaseOrderType");
	    return list;
	  }
	 public List<Map<String, Object>> getPurchaseType()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPurchaseType");
	    return list;
	  }
	 public List<Map<String, Object>> getServices()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getServices");
	    return list;
	  }
	 public List<Map<String, Object>> getPrograms()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPrograms");
	    return list;
	  }
	 public List<Map<String, Object>> getSectors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getSectors");
	    return list;
	  }
	 public List<Map<String, Object>> getVendors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getVendors");
	    return list;
	  }
	 public List<Map<String, Object>> getAssets()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getAssets");
	    return list;
	  }
	 public List<Map<String, Object>> getLocations()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getLocations");
	    return list;
	  }
	
	 public void add(CreatePO createposervice) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("CreatePo.Insert", params);
			sqlSession.close();
		}  
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getAll");
	    return list;
	  }
	 
	 
	 public CreatePO getById(String asset_name)
		{ 
			
		 CreatePO createposervice = sqlSessionTemplate.selectOne("CreatePo.getById",asset_name);
			return createposervice;             
			        
		}
	 
	 public List<Map<String, Object>> getGroups()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getGroups");
	    return list;
	  }
	 
	 public void submit(CreatePO createposervice) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("CreatePo.Insert1", params);
			sqlSession.close();
		}  
	
	 public void updateData(CreatePO createposervice)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("CreatePo.updateData",params);
			sqlSession.close();
		}
	 
	 /* Required Position In Candidate Registration */
	 
	 public List<Map<String, Object>> getPositions()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPositions");
	    return list;
	  }
	  
}
