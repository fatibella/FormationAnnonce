package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.Module;

@Repository
public interface ModuleDao extends JpaRepository<Module, Long> {

	public Module findByReference(String reference);

}
