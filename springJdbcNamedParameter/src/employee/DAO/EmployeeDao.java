package employee.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import employee.Model.Employee;

public class EmployeeDao {
	NamedParameterJdbcTemplate npJdbcTemplate;

	public EmployeeDao(NamedParameterJdbcTemplate npJdbcTemplate) {
		super();
		this.npJdbcTemplate = npJdbcTemplate;
	}

	public void save(Employee e) {
		String query = "insert into employee values (:id,:name,:salary)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", e.getId());
		map.put("name", e.getName());
		map.put("salary", e.getSalary());

		npJdbcTemplate.execute(query, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
		System.out.println(e);
	}

}
