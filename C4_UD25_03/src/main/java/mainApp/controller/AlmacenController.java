package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Almacen;
import mainApp.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen almacenXID(@PathVariable(name="codigo") int codigo) {
		
		Almacen almacen_xid= new Almacen();
		almacen_xid=almacenServiceImpl.almacenXID(codigo);
		System.out.println("Almacen XID: "+almacen_xid);
		return almacen_xid;
	}

	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacenes(@PathVariable(name="codigo")int codigo,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		
		almacen_seleccionado= almacenServiceImpl.almacenXID(codigo);
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		almacen_actualizado = almacenServiceImpl.actualizarAlmacenes(almacen_seleccionado);
		
		System.out.println("El almacen actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacenes(@PathVariable(name="codigo")int codigo) {
		almacenServiceImpl.eliminarAlmacenes(codigo);
	}
}
