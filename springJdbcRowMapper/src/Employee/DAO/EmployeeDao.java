package Employee.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Employee.Model.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmployeeRowMapper(){
		String query="select * from employee";
		
		return jdbcTemplate.query(query, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNumber) throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setSalary(rs.getInt(3));  
		        return e;
			}	
		});
	}
}
