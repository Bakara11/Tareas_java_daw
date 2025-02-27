package javabeans;

import java.util.Objects;

public class Clientes {

	private String cif;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private float facturacionAnual;
	private int numeroEmpleados;
	
	
	public Clientes() {
		super();
	}


	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public float getFacturacionAnual() {
		return facturacionAnual;
	}


	public void setFacturacionAnual(float facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}


	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}


	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cif);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(cif, other.cif);
	}


	@Override
	public String toString() {
		return "Clientes [cif=" + cif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio
				+ ", facturacionAnual=" + facturacionAnual + ", numeroEmpleados=" + numeroEmpleados + "]";
	}
	
	
	
	
	
}
