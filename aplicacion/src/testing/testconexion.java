package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Factura;

public class testconexion {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/casaPrueba?serverTimezone=UTC";
		String username = "root";
		String pwd = "Pablo6364";
		Connection conn = null;
		try {
			 conn = DriverManager.getConnection(url,username,pwd);
			System.out.println("Conexion establecida");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Conexion NOOO establecida");
		}
		String sql = null;
		PreparedStatement ps = null;
	    ResultSet rs = null; 
	    sql = "select * from facturas";
	    List<Factura> lista = new ArrayList<>();
	    try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Factura factura = new Factura();
				factura.setIdfactura(rs.getString("id_factura"));
				factura.setDescripcion(rs.getString("descripcion"));
				factura.setIdproyecto(rs.getString("id_proyecto"));
				
				lista.add(factura);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    for(Factura ele: lista) {
	    	System.out.println(ele);
	    }
	    
	
	}

}
