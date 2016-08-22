package test;

import java.sql.SQLException;
import java.util.List;

public class sample_DAO {
	//全件操作
	public List<sample1_beans> findAll() {
		String sql = "SELECT * FROM bihin";

		try {
			return DBManager3.simpleFind(sql,new sampleBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
	public int update(String numb) {
		String sql = "UPDATE bihin SET status = 1 WHERE id = ";
		try {
			return DBManager3.simpleUpdate(sql+numb);
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
