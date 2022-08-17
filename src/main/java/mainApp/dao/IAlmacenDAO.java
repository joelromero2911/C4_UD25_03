package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer>{

}
