package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory 
{
	//metodo retorna um tipo interface, mas intermente instancia uma implementação
	//é um macete para não precisar expor a implementação, deixando apenas a interface
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
