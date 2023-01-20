package mainClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Employee.DAO.EmployeeDAO;
import Employee.Model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao=(EmployeeDAO)ac.getBean("edao");  
	    dao.saveEmployeeByPreparedStatement(new Employee(101,"Suyog",25000)); 
	}

}
