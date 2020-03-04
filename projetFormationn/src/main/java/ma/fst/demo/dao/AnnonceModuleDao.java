package ma.fst.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.demo.bean.AnnonceModule;
import ma.fst.demo.bean.Module;

@Repository
public interface AnnonceModuleDao extends JpaRepository<AnnonceModule, Long> {

	public AnnonceModule findByModule(Module module);

}
