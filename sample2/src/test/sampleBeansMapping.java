package test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class sampleBeansMapping implements ResultSetBeanMapping<sample1_beans> {
	public sample1_beans createFromResultSet(ResultSet rs) throws SQLException {
		sample1_beans bean = new sample1_beans();
		bean.setId(rs.getInt("ID"));
		bean.setName(rs.getString("NAME"));
		bean.setStatus(rs.getInt("STATUS"));

		return bean;
	}
}
