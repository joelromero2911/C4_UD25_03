package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Caja;

public interface ICajaDAO extends JpaRepository<Caja, String>{

}
