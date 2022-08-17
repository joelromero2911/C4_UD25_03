package mainApp.service;

import java.util.List;

import mainApp.dto.Almacen;

public interface IAlmacenService {

	//Metodos del CRUD
	public List<Almacen> listarAlmacenes(); // Listar All 
	
	public Almacen guardarAlmacen(Almacen almacen);	// CREATE
	
	public Almacen almacenXID(int codigo); // READ
	
	public Almacen actualizarAlmacenes(Almacen almacen); // UPDATE
	
	public void eliminarAlmacenes(int codigo); // DELETE
}
