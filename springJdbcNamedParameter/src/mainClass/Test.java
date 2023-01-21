package mainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import employee.DAO.EmployeeDao;
import employee.Model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao empDao=(EmployeeDao) ac.getBean("edao");
		empDao.save(new Employee(106, "ash", 42500));

	}

}
