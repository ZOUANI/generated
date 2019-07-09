package ma.zs.generatedProject.domain.model.dao;
import ma.zs.generatedProject.bean.Produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface ProduitDao extends JpaRepository<Produit,Long> {




}
