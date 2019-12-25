
package com.eis.dao;
 
import com.eis.model.Employee;

import java.util.List;

 
public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	boolean save(Employee employee);
	
	boolean delete(int id);
	
	boolean update(Employee employee);
}