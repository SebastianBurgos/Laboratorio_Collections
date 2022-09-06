package co.edu.uniquindio.prestamoobjetos.model;

import java.util.Iterator;

import javafx.scene.image.Image;

public class Objeto implements Comparable<Objeto> {

	private String codigo;
	private String nombre;
	private int unidadesDisponibles;
	private String descripcion;
	private double peso;
	private String estado;
	private String tipo;
	private double valorUnitario;
	private double valorTotal;
	private double precioAlquiler;
	private Image foto;

	/**
	 * Metodo constructor de la clase Objeto
	 * @param codigo
	 * @param nombre
	 * @param unidadesDisponibles
	 * @param descripcion
	 * @param peso
	 * @param estado
	 * @param tipo
	 * @param valorUnitario
	 * @param valorTotal
	 * @param precioAlquiler
	 */
	public Objeto(String codigo, String nombre, int unidadesDisponibles, String descripcion, double peso, String estado,
			String tipo, double valorUnitario, double valorTotal, double precioAlquiler, Image foto) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidadesDisponibles = unidadesDisponibles;
		this.descripcion = descripcion;
		this.peso = peso;
		this.estado = estado;
		this.tipo = tipo;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.precioAlquiler = precioAlquiler;
		this.foto = foto;
	}

	public Objeto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Setters y Getters de la clase Objeto
	 * @return
	 */


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public double getValorUnitario() {
		return valorUnitario;
	}



	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}



	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public double getPrecioAlquiler() {
		return precioAlquiler;
	}



	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Objeto [codigo=" + codigo + ", nombre=" + nombre + ", unidadesDisponibles=" + unidadesDisponibles
				+ ", descripcion=" + descripcion + ", peso=" + peso + ", estado=" + estado + ", tipo=" + tipo
				+ ", valorUnitario=" + valorUnitario + ", valorTotal=" + valorTotal + ", precioAlquiler="
				+ precioAlquiler + "]";
	}

	/**
	 * Metodo para disminuir la existencia de un objeto en caso de alterar las unidades disponibles
	 * @param unidadesPrestadas
	 */
	public void disminuirExistencias(int unidadesPrestadas) {
		int nuevasUnidades = 0;
		nuevasUnidades = getUnidadesDisponibles() - unidadesPrestadas;
		setUnidadesDisponibles(nuevasUnidades);
		if(getUnidadesDisponibles()==0){
			setEstado("No disponible");
		}
	}

	/**
	 * Metodo para aumentar las existencias de un objeto en caso de alterar las unidades disponibles
	 * @param unidadesEntregadas
	 */
	public void aumentarExistencias(int unidadesEntregadas) {
		int nuevasUnidades = 0;
		nuevasUnidades = getUnidadesDisponibles() + unidadesEntregadas;
		setUnidadesDisponibles(nuevasUnidades);
		if(getUnidadesDisponibles() > 0){
			setEstado("Disponible");
		}
	}
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Objeto other = (Objeto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}*/

	public int compareTo(String nombreOtro) {
		int resultado = 0;
		if(nombre.hashCode() < nombreOtro.hashCode()){
			resultado = -1;
		}
		if(nombre.hashCode() == nombreOtro.hashCode()){
			resultado = 0;
		}
		if(nombre.hashCode() > nombreOtro.hashCode()){
			resultado = -1;
		}
		return resultado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Objeto other = (Objeto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Objeto arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
