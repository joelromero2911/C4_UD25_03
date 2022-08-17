package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Caja;
import mainApp.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajaServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{num_referencia}")
	public Caja cajaXID(@PathVariable(name="num_referencia") String num_referencia) {
		
		Caja caja_xid= new Caja();
		caja_xid=cajaServiceImpl.cajaXID(num_referencia);
		System.out.println("Caja XID: "+caja_xid);
		return caja_xid;
	}

	@PutMapping("/cajas/{num_referencia}")
	public Caja actualizarCajas(@PathVariable(name="num_referencia")String num_referencia,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaServiceImpl.cajaXID(num_referencia);
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		caja_actualizado = cajaServiceImpl.actualizarCajas(caja_seleccionado);
		
		System.out.println("La caja actualizada es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{num_referencia}")
	public void eliminarCajas(@PathVariable(name="num_referencia")String num_referencia) {
		cajaServiceImpl.eliminarCajas(num_referencia);
	}
}
