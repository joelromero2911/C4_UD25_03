package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IAlmacenDAO;
import mainApp.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacenes() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(int codigo) {
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacen actualizarAlmacenes(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacenes(int codigo) {
		iAlmacenDAO.deleteById(codigo);
	}

}
