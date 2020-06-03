
package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Model.LeavesReport;
import com.spring.Model.Sdeigroup;



@Repository
public class LeavesReportDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	
	public List<Map<String, Object>> getLeaves()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getLeaves");
	    return list;
	  }
	


    public Map<String, Object>getleavesDetailedReport(LeavesReport report)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.getleavesDetailedReport",params);
	     params.put("centers",list);
	    return params;
	  }
	 
    public Map<String, Object>getSummary1(LeavesReport report1)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report1);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.getSummary1",params);
	     params.put("centers",list);
	    return params;
	  }
	 
	 
}
