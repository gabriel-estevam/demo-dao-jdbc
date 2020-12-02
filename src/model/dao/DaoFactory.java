package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory 
{
	//metodo retorna um tipo interface, mas intermente instancia uma implementa��o
	//� um macete para n�o precisar expor a implementa��o, deixando apenas a interface
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
