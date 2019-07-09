package ma.zs.generatedProject.domain.model.dao;
import ma.zs.generatedProject.bean.Produit;
import ma.zs.generatedProject.bean.Commande;
import ma.zs.generatedProject.bean.CommandeItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface CommandeItemDao extends JpaRepository<CommandeItem,Long> {

	 public CommandeItem findByProduit(Produit produit);
	 public int deleteByProduit(Produit produit);
	 public CommandeItem findByCommande(Commande commande);
	 public int deleteByCommande(Commande commande);



}
