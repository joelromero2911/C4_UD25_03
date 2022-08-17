package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ICajaDAO;
import mainApp.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listarCajas() {
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String num_referencia) {
		return iCajaDAO.findById(num_referencia).get();
	}

	@Override
	public Caja actualizarCajas(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCajas(String num_referencia) {
		iCajaDAO.deleteById(num_referencia);
	}

}
