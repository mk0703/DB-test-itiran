package test;

import java.sql.SQLException;
import java.util.List;

public class sample_DAO {
	//全件操作
	public List<sample1_beans> findAll() {
		String sql = "SELECT * FROM bihin ";

		try {
			return DBManager3.simpleFind(sql,new sampleBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	//自身の借りているものを表示
	public List<sample1_beans> myFindAll(String id) {
		String sql = "SELECT * FROM bihin WHERE id = ";
		sql = sql + id;

		try {
			return DBManager3.simpleFind(sql,new sampleBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
	//ステータス変更
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
