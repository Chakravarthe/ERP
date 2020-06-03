package com.spring.DAO;

import com.andromeda.commons.dao.BaseDAO;
import com.spring.Model.Attendance;
import com.spring.Model.EmployeeMaster;
import com.spring.Model.Login;





import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
@Repository
public class AttendanceDAO
  extends BaseDAO
{
  public String getVersion()   
  {
    String msg = (String)this.sqlSessionTemplate.selectOne("Attendance.getAppVersion");
    return msg;
  }
  
  
  /* getting detials to table in attendance sheet */
  
	
  public Map<String, Object> getDetails(Attendance attendance)
  {
  Map<String, Object> map = new HashMap<String, Object>();
  map.put("p", attendance);

  List<Map<String, Object>> districts =
  sqlSessionTemplate.selectList("Attendance.getDetails",map);
  map.put("dates", districts);
  return map;
  }
  
  
  
  private static final Logger logger = LoggerFactory.getLogger(AttendanceDAO.class);

  /*public List<DateWiseAttendance> searchAttendance(DateWiseAttendance dateWiseAttendance)
	{
		Map<String, Object> params = null;
		List<DateWiseAttendance> list = null;
		try
		{
			params = new HashMap<String, Object>();
			params.put("p", dateWiseAttendance);
			list = sqlSessionTemplate.selectList("Attendance.selectDateWise", params);
		}
		catch (Exception e)
		{
			logger.error("Error ", e);
		}
		return list;
	}*/   
  
  
  
	
  
  public boolean savePresentEmployees(Login login)
  {   
    SqlSession sqlSession = sqlSessionFactory.openSession();
    Login dbLogin = sqlSession.selectOne("Attendance.getLogin",login);
    
    if(dbLogin == null) {
		sqlSession.insert("Attendance.savePresentEmployees", login);
		return true;
	} else {
		return false;	   
	}
}
  
  public boolean updatePresentEmployees(Login login)
  { 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    Login dbLogin = sqlSession.selectOne("Attendance.getLogin",login);
    System.out.println(dbLogin);
    if(dbLogin != null && (dbLogin.getLogout_time() == null || dbLogin.getLogout_time().isEmpty())) {
    	sqlSession.update("Attendance.updatePresentEmployees", login);
    	return true;
    }
    
	return false;
}
  /*get attendance report */     
  public List<Map<String, Object>> getStaff()
  {
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getStaff");
    return list;
  }
/*get dashboard login time*/
 
  
 /* public Login getdashboard(Login login)
  {
    Login list  = this.sqlSessionTemplate.selectOne("Attendance.getdashboard",login);
    return list;
  }*/
  /*public Attendance getAttendance(String empid)
  {
    Attendance list  = this.sqlSessionTemplate.selectOne("Attendance.getAttendance", empid);
    return list;
  }
 */
  
  
/* Getting details from db to table in attendance summary graph */
  
  public Map<String, Object> getReport(Attendance attendance)
  {
  Map<String, Object> map = new HashMap<String, Object>();
  map.put("p", attendance);

  List<Map<String, Object>> districts =
  sqlSessionTemplate.selectList("Attendance.getReport",map);
  map.put("report", districts);
  return map;
  }
  
  /*get dashboard login time*/
 /* public List<Map<String, Object>> getdashboard()
  {
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getdashboard");
    return list;
  }*/
  
  public Login getdashboard(Login login)
  {
    Login list  = this.sqlSessionTemplate.selectOne("Attendance.getdashboard",login);
    return list;
  }
 
  /*Myleaves page report*/
  public List<Map<String, Object>> getLeavesDetails()
  {
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getLeavesDetails");
    return list;
  }
  
  
  /* getting myteam leaves details based on from date,to date*/
  
  public Map<String,Object> getMyTeamDetails(Attendance attendance)
  {
	   Map<String,Object> map=new HashMap<String,Object>();
	   map.put("p",attendance);
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getMyTeamDetails",map);
    map.put("dates",list);
    return map;
  }
  /* get years*/
  public List<Map<String, Object>> getyears()
 {
   List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getyears");
   return list;
 }
  
  
  
  public void addcal(Attendance employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		/*Integer id  =sqlSession.selectOne("EmployeeMaster.getCount");
		params.put("id",id);*/
		sqlSession.insert("Attendance.Insert", params);
		sqlSession.close();
	}
  
  
}
