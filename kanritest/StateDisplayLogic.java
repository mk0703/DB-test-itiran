package ateam.logic;

import java.util.List;

import ateam.model.Bihin;

public class StateDisplayLogic {
	public static List<Bihin> myBihin(String id) {
		ateam.dao.sample_DAO dao = new ateam.dao.sample_DAO();
		List <Bihin> list = dao.myFindAll(id);
		/*List<Bihin> list = new ArrayList<Bihin>();
sample_DAO dao = new sample_DAO()
		// 適当な備品を追加
		Bihin bihin = new Bihin();
		bihin.setBihinID("T001");
		bihin.setBihinKana("ツクエ");
		bihin.setBihinName("机");
		bihin.setReturnDay(Date.valueOf("2016-8-30"));
		bihin.setStatus(2);
		bihin.setUserID("00001");
		list.add(bihin);

		Bihin bihin2 = new Bihin();
		bihin2.setBihinID("W001");
		bihin2.setBihinKana("ホワイトボード");
		bihin2.setBihinName("ホワイトボード");
		bihin2.setReturnDay(Date.valueOf("2016-9-10"));
		bihin2.setStatus(2);
		bihin2.setUserID("00002");
		list.add(bihin2);*/

		return list;
	}
}
