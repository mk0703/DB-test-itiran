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
	public int update() {
		String sql = "UPDATE bihin SET status = 2";
		try {
			return DBManager3.simpleUpdate(sql);
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
