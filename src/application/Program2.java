package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 
{
	public static void main(String[] args) 
	{
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===Test 1: department findById===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n===Test 2: department findAll===");
		List<Department> list = departmentDao.findAll();
		for(Department d: list)
		{
			System.out.println(d);
		}
	}
}
