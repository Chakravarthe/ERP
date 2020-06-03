package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.Model.Employee;



@Repository
public class EmployeeDao extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;   

	
	/*public Employee getDetails(String empid)
	  {
		//System.out.println("empoid DAO: " + empid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empid", empid); 
	    Employee list = this.sqlSessionTemplate.selectOne("EmployeeData.getDetails",empid);
	    return list;
	  }
	*/
	                                                                       

	  public Employee getDetails(String empid)
	  {
	    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.getDetails", empid);
	    return list;
	  }
	  
	  /* hr profile details */
	  
	  public Employee gethrDetails(String empid)    
	  {
	    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.gethrDetails", empid);
	    return list;
	  }
                           
	/*
	 public List<Map<String, Object>> getDetails(String empid)   
	  {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empsid", empid); 
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDetails",empid);
	    return list;
	  }
	*/
	
	 public List<Map<String, Object>> getCaders()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCaders");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getEmp()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getEmp");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getRelations()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getRelations");
	    return list;
	  }
	 public List<Map<String, Object>> getDistricts()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDistricts");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getGrades()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getGrades");
	    return list;
	  }
	 public List<Map<String, Object>> getDepartment()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDepartment");
	    return list;
	  }
	 public List<Map<String, Object>> getDivision()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDivision");
	    return list;
	  }
	 public List<Map<String, Object>> getCost_center()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCost_center");
	    return list;
	  }
	 public List<Map<String, Object>> getCost_center1()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCost_center1");
	    return list;
	  }
	 public List<Map<String, Object>> getDesignation()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDesignation");
	    return list;
	  }    

	public void add(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi2");
		sqlSession.update("EmployeeData.Update", params);
		sqlSession.insert("EmployeeData.Insert1", params);
		sqlSession.update("EmployeeData.Update1", params);
		/* sqlSession.insert("EmployeeData.Insert3", params); */
		sqlSession.insert("EmployeeData.Insert4", params);  
		sqlSession.insert("EmployeeData.Insert5", params);
		
		
		sqlSession.close();
	}       
	
	/* HR profile update */
	
	public void add3(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hihr");
		sqlSession.update("EmployeeData.Updatehr", params);
		sqlSession.insert("EmployeeData.Inserthr1", params);
		sqlSession.update("EmployeeData.Updatehr1", params);
		/* sqlSession.insert("EmployeeData.Insert3", params); */
		sqlSession.insert("EmployeeData.Inserthr2", params);  
		sqlSession.insert("EmployeeData.Inserthr3", params);
		
		
		sqlSession.close();
	}
	  
	public void add1(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi2");
		Integer currentYear  =sqlSession.selectOne("EmployeeData.getYear");
		Integer id  =sqlSession.selectOne("EmployeeData.getCount");
		params.put("year",currentYear);        
		params.put("id",id);
		/*sqlSession.insert("EmployeeData.Insert6", params);
		String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
		params.put("empid",employeeid);*/
		sqlSession.insert("EmployeeData.Insert9", params);
		sqlSession.insert("EmployeeData.Insert8", params);    
		String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
		params.put("empid",employeeid);
		sqlSession.insert("EmployeeData.Insert7", params);
		
		sqlSession.close();                        
	}  
	
	/* Inserting employee education details */
	
	public void data(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi2"); 
		sqlSession.insert("EmployeeData.Inserteducation", params);
		
		
		sqlSession.close();
	}
	
	/* Getting table data in education tab in employee profile */
	public Employee getById6(String empid)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Employee singleuserdetails=sqlSession.selectOne("EmployeeData.getById6",empid);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	public List<Employee> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Employee> userdetails=sqlSession.selectList("EmployeeData.getAll");
		sqlSession.close();
		return userdetails;
	}
	
	
	/* Scheme, project and sector */
	
	public List<Map<String, Object>> getSchemes()  
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getSchemes");
	    return list;
	  }
	
	public List<Employee> getProjects(String project_id)  
	  {
	    List<Employee> projects = this.sqlSessionTemplate.selectList("EmployeeData.getProjects", project_id);
	    return projects;
	  }
	
	public List<Map<String, Object>> getSectors()  
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getSectors");
	    return list;
	  }
	
	/*
	 * public List<Map<String, Object>> getSectors() { List<Map<String, Object>>
	 * list = this.sqlSessionTemplate.selectList("EmployeeData.getSectors"); return
	 * list; }
	 */
	
	/*
	 * public List<Map<String, Object>> getProjects() { List<Map<String, Object>>
	 * list = this.sqlSessionTemplate.selectList("EmployeeData.getProjects"); return
	 * list; }
	 */
	
	/*
	 * public List<Employee> getSectors(Integer sector_id) { List<Employee> sectors
	 * = this.sqlSessionTemplate.selectList("EmployeeData.getSectors", sector_id);
	 * return sectors; }
	 */
	
	
	/* Institute and qualification in update employee education tab(Employee login) */
	
	public List<Map<String, Object>> getInstitutes()  
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getInstitutes");
	    return list;
	  }
	
	public List<Employee> getQualifications(Integer qualification_id)
	  {
	    List<Employee> qualifications = this.sqlSessionTemplate.selectList("EmployeeData.getQualifications", qualification_id);
	    return qualifications;
	  } 
	
	
	/*public void save(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi3");
		sqlSession.insert("EmployeeData.Insert2", params);
		sqlSession.close();
	}   */ 
	
	/* Inserting task in time and attendance sheet */
	
	public void add8(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("EmployeeData.Insertdata", params);
		sqlSession.close();
	}
	
	/* Getting Locations in Employee project mapping */
	
	 public List<Map<String, Object>> getLocations()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getLocations");
	    return list;
	  }
	
	 /* Getting projects in employee project mapping */
	 
	 public List<Map<String, Object>> getprojects()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getprojects");
	    return list;
	  }
	 
	 /* Getting reporting to in employee project mapping */
	 
	 public List<Map<String, Object>> getReporting()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getReporting");
	    return list;
	  }
	      
	 /* Getting data in project employee mapping */
	 
	 public Map<String, Object> getprojectdata(Employee employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);    
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeData.getprojectdata",map);
	  map.put("dates", districts);
	  return map;
	  }   
	 
	 /* Getting all employees of given location */
	 
	 public Map<String, Object> getallemployees(Employee employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);  
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeData.getallemployees",map);
	  map.put("alldata", districts);
	  return map;
	  }
	 
/* Getting data in employee project mapping */
	 
	 public Map<String, Object> getempprojectdata(Employee employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);  
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeData.getempprojectdata",map);
	  map.put("dates", districts);
	  return map;
	  }
	 
	 /* getting data in pop up based on project name */
	 
	 public Employee getByproject(String project_name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Employee singleuserdetails=sqlSession.selectOne("EmployeeData.getByproject",project_name);
			sqlSession.close();
			return singleuserdetails;
			
		}
	 
	 /* update data based on project_name employee project mapping */
	 
	 public void updateprojectdata(Employee employee)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("EmployeeData.updateprojectdata1",params);
			sqlSession.close();
		}
	
	
}  
