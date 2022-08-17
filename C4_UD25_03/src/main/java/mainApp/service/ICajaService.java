package mainApp.service;

import java.util.List;

import mainApp.dto.Caja;

public interface ICajaService {

	//Metodos del CRUD
	public List<Caja> listarCajas(); // Listar All 
	
	public Caja guardarCaja(Caja caja);	// CREATE
	
	public Caja cajaXID(String num_referencia); // READ
	
	public Caja actualizarCajas(Caja caja); // UPDATE
	
	public void eliminarCajas(String num_referencia); // DELETE
}
