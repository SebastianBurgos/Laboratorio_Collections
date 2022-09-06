package co.edu.uniquindio.prestamoobjetos.model;

import java.util.TreeSet;

public class Cliente  implements Comparable<Cliente> {

	private String numeroDocumento;
	private TipoDocumento tipoDocumento;
	private String nombre;
	private String telefonoResidencia;
	private String telefonoCelular;
	private String direccion;
	private String ciudadResidencia;
	private String departamento;
	private String pais;
	private String profesion;
	private String email;
	private TreeSet<Objeto> objetosPrestados;             //7 PUNTO LABORATORIO

	/**
	 * Metodo constructor de la clase Cliente
	 * @param nombre
	 * @param tipoDocumento
	 * @param numeroDocumento
	 * @param direccion
	 * @param ciudadResidencia
	 * @param departamento
	 * @param pais
	 * @param profesion
	 * @param email
	 * @param telefonoCelular
	 * @param telefonoResidencia
	 */
	public Cliente(String nombre, TipoDocumento tipoDocumento, String numeroDocumento, String direccion, String ciudadResidencia,
			String departamento, String pais, String profesion, String email, String telefonoCelular, String telefonoResidencia) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.nombre = nombre;
		this.telefonoResidencia = telefonoResidencia;
		this.telefonoCelular = telefonoCelular;
		this.direccion = direccion;
		this.ciudadResidencia = ciudadResidencia;
		this.departamento = departamento;
		this.pais = pais;
		this.profesion = profesion;
		this.email = email;
	}

	/**
	 * Metodo constructor solo para setear uno por uno los datos
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefonoResidencia() {
		return telefonoResidencia;
	}


	public void setTelefonoResidencia(String telefonoResidencia) {
		this.telefonoResidencia = telefonoResidencia;
	}


	public String getTelefonoCelular() {
		return telefonoCelular;
	}


	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudadResidencia() {
		return ciudadResidencia;
	}


	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public TreeSet<Objeto> getObjetosPrestados() {
		return objetosPrestados;
	}

	public void setObjetosPrestados(TreeSet<Objeto> objetosPrestados) {
		this.objetosPrestados = objetosPrestados;
	}

	@Override
	public String toString() {
		return "Cliente [numeroDocumento=" + numeroDocumento + ", tipoDocumento=" + tipoDocumento
				+ ", nombre=" + nombre + ", telefonoResidencia=" + telefonoResidencia + ", telefonoCelular="
				+ telefonoCelular + ", direccion=" + direccion + ", ciudadResidencia=" + ciudadResidencia
				+ ", departamento=" + departamento + ", pais=" + pais + ", profesion=" + profesion + ", email=" + email
				+ "]";
	}

	/**
	 * No permitirá repetir objetos
	 * @param ObjetoAux
	 * @return
	 */

	public int compareTo(String documentoLlegada) {               //9 PUNTO LABORATORIO

		int documento = this.numeroDocumento.hashCode();
		int documentoAux = documentoLlegada.hashCode();

		if(documento<documentoAux){
			return -1;
		}else{
			if(documento>documentoAux){
				return 1;
			}else{
				return 0;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return 0;
	}




}
