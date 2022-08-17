package mainApp.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name="almacen")
	private List<Caja> caja;

	/**
	 * 
	 */
	public Almacen() {
	}

	/**
	 * @param codigo
	 * @param lugar
	 * @param capacidad
	 * @param caja
	 */
	public Almacen(int codigo, String lugar, int capacidad, List<Caja> caja) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the caja
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja() {
		return caja;
	}

	/**
	 * @param caja the caja to set
	 */
	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
	
	
}
