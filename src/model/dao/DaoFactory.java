package model.dao;

import db.DBConnection;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DBConnection.getConnection());
	}
}
