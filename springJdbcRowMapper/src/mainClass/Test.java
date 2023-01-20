package mainClass;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Employee.DAO.EmployeeDao;
import Employee.Model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    List<Employee> list=dao.getAllEmployeeRowMapper();  
	          
	    for(Employee e:list)  
	        System.out.println(e); 

	}

}
