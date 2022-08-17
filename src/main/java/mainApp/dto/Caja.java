package mainApp.dto;

import javax.persistence.*;

@Entity
@Table(name="cajas")
public class Caja {

	@Id
	@Column(name = "num_referencia")
	private String num_referencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="almacen")
	Almacen almacen;

	/**
	 * 
	 */
	public Caja() {
	}

	/**
	 * @param num_referencia
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(String num_referencia, String contenido, int valor, Almacen almacen) {
		super();
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the num_referencia
	 */
	public String getNum_referencia() {
		return num_referencia;
	}

	/**
	 * @param num_referencia the num_referencia to set
	 */
	public void setNum_referencia(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}
	
	
}
