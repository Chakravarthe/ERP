package com.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Model.Employee;
import com.spring.Model.EmployeeMaster;

@Repository
public class EmployeeMasterDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public List<EmployeeMaster> getNameWiseData(EmployeeMaster table) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		String empid = table.empid;
		List<EmployeeMaster> nameWiseData = sqlSession.selectList("EmployeeMaster.getNameWiseData", empid);
		sqlSession.close();
		return nameWiseData;
	}

	public List<Map<String, Object>> search(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.search", params);
		return list;
	}

	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll");
		return list;
	}
	
/* update data based on empid in employee master */
	
	public EmployeeMaster getById(String empid)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		EmployeeMaster singleuserdetails=sqlSession.selectOne("EmployeeMaster.getById",empid);
		sqlSession.close();
		return singleuserdetails;
		
	}

	public void updateData(EmployeeMaster employee)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("EmployeeMaster.updateData",params);
		sqlSession.close();
	}
	
	
	public List<Map<String, Object>> getsearch(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getsearch", params);
		return list;
	}

	public List<Map<String, Object>> getCaders() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getCaders");
		return list;
	}

	public List<Map<String, Object>> getGrades() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getGrades");
		return list;
	}

	public List<Map<String, Object>> getDepartment() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getDepartment");
		return list;
	}

	public List<Map<String, Object>> getDesignation() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getDesignation");
		return list;
	}

	/* create hiring request add method */

	public void add(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer id = sqlSession.selectOne("EmployeeMaster.getCount1");
		params.put("id", id);
		sqlSession.insert("EmployeeMaster.Insert", params);
		sqlSession.close();
	}

	
	/* candidate Registration add1 method */

	/*
	 * public void add1(EmployeeMaster employee) { Map<String, Object> params = new
	 * HashMap<String, Object>(); params.put("p", employee); SqlSession sqlSession =
	 * sqlSessionFactory.openSession();
	 * 
	 * Integer id =sqlSession.selectOne("EmployeeMaster.getCount1");
	 * params.put("id",id);
	 * 
	 * sqlSession.insert("EmployeeMaster.Insert0", params); sqlSession.close(); }
	 */
	
	public void add1(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("EmployeeMaster.Insert0", params);
		sqlSession.close();
	}

	/* getting details in table for hiring request */

	public List<Map<String, Object>> hiringRequest() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.hiringRequest");
		return list;
	}

	/* Education and branches in candidate registration */

	public List<Map<String, Object>> getEducations() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getEducations");
		return list;
	}

	public List<EmployeeMaster> getBranches(Integer branch_id) {
		List<EmployeeMaster> branches = this.sqlSessionTemplate.selectList("EmployeeMaster.getBranches", branch_id);
		return branches;
	}
	
	/* Getting details to front end Select Candidate */
	
	public List<Map<String, Object>> getCandidates() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getCandidates");
		return list;
	}
	
	/* getting data in table for Others in payslip */
	
	public Map<String, Object> getdetails(EmployeeMaster employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);

	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeMaster.getdetails",map);
	  map.put("dates", districts);
	  return map;
	  }

	/* Getting Employee type for attendance sheet */
	 
	 public List<Map<String, Object>> getStaff()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getStaff");
	    return list;
	  }
	
	/* search bar in hiring request */

	/*
	 * public List<Map<String, Object>> getHiringsearch(EmployeeMaster employee) {
	 * Map<String, Object> params = new HashMap<String, Object>(); params.put("p",
	 * employee); List<Map<String, Object>> list =
	 * this.sqlSessionTemplate.selectList("EmployeeMaster.getHiringsearch",params);
	 * return list; }
	 */

/* Getting Data in My timesheet Page */
	 
	 public Map<String, Object> getdata(EmployeeMaster employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeMaster.getdata",map);
	  map.put("dates", districts);
	  return map;
	  }
	 
	 /* Getting data based on empid in my timesheet view and edit button */
		/*
		 * public EmployeeMaster getByIddata(String empid) { SqlSession sqlSession =
		 * sqlSessionFactory.openSession(); EmployeeMaster
		 * singleuserdetails=sqlSession.selectOne("EmployeeMaster.getByIddata",empid);
		 * sqlSession.close(); return singleuserdetails; }
		 */
		  
		  public EmployeeMaster getByIddata(String task)
			{
				SqlSession sqlSession = sqlSessionFactory.openSession();
				EmployeeMaster singleuserdetails=sqlSession.selectOne("EmployeeMaster.getByIddata",task);
				sqlSession.close();
				return singleuserdetails;		
			}
		  
		  /* Removing data based on task in my timesheet page */
		  
		  public void remove(String task)
			{
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.delete("EmployeeMaster.deletedata",task);
				sqlSession.close();
			}
		  
		  /* updating data based on task in my timesheet page */
		  
		  public void updatedata(EmployeeMaster employee)
			{
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.update("EmployeeMaster.updatedata",params);
				sqlSession.close();
			}
		  
		  /*getting Leavetype*/
			 public List<Map<String, Object>> getLeavetype()
			  {
			    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getLeavetype");
			    return list;
			  }
			 /*getting reporting*/
			
			 public EmployeeMaster getReporting(String empid)
			  {
			    EmployeeMaster list  = this.sqlSessionTemplate.selectOne("EmployeeMaster.getReporting", empid);
			    return list;
			  }
			 
			 /*create apply leave*/
			  public void addEmp(EmployeeMaster employee) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("p", employee);
					SqlSession sqlSession = sqlSessionFactory.openSession();
					/*Integer id  =sqlSession.selectOne("EmployeeMaster.getCount");
					params.put("id",id);*/
					sqlSession.insert("EmployeeMaster.Insert1", params);
					sqlSession.close();
				}
			
	 
}
