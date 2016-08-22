package ateam.dao;

import java.sql.SQLException;
import java.util.List;

import ateam.model.Bihin;

public class sample_DAO {
	//全件操作
	public List<Bihin> findAll() {
		String sql = "SELECT * FROM bihin ";

		try {
			return DBManager3.simpleFind(sql,new sampleBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	//自身の借りているものを表示
	public List<Bihin> myFindAll(String userID) {
		String sql = "SELECT * FROM bihin WHERE id = ";
		sql = sql + userID;

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
