package ma.zs.generatedProject.domain.model.dao;
import ma.zs.generatedProject.bean.Commande;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface CommandeDao extends JpaRepository<Commande,Long> {
	 public Commande findByReference(String reference);
	 public int deleteByReference(String reference);




}
