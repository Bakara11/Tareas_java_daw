package testing;

import modelo.dao.FacturaDao;
import modelo.dao.FacturaDaoImplMy8;

public class TestModeloDao {

	public static void main(String[] args) {
		
		FacturaDao fdao = new FacturaDaoImplMy8();
		System.out.println(fdao.buscarTodas());
		System.out.println(fdao.buscarUna("idfactura"));
	}

}
