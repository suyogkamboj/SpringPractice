package jdbcTemplateTestMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbcTemplate.Employee.DAO.EmployeeDao;
import jdbcTemplate.Employee.Model.Employee;

public class Test {
	public static void main(String[] args) throws Exception {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      System.out.println("hi");
//	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao"); 
//	    int status=dao.saveEmployee(new Employee(104,"Suyog",35000));  
//	    System.out.println(status);  
//	          
//	    int status=dao.updateEmployee(new Employee(102,"Suraj",15000)); 
//	    System.out.println(status); 
	      
	          
//	    Employee e=new Employee(); 
//	    e.setId(108); 
//	    int status=dao.deleteEmployee(e); 
//	    System.out.println(status);
	      
	}  
}
