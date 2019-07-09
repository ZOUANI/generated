package ma.zs.generatedProject.domain.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import ma.zs.generatedProject.bean.CommandeItem;
import ma.zs.generatedProject.bean.Produit; 
import ma.zs.generatedProject.bean.Commande; 
public interface CommandeItemService {

public CommandeItem save(CommandeItem commandeitem); 
public List<CommandeItem> findAll();
public CommandeItem findById(Long id);
public int delete(CommandeItem commandeitem);
public void  deleteById(Long id);
public void clone(CommandeItem commandeitem,CommandeItem commandeitemClone);
public CommandeItem clone(CommandeItem commandeitem);
public List<CommandeItem> clone(List<CommandeItem>commandeitems); public List<CommandeItem>  findByCriteria(Long idMin,Long idMax,BigDecimal prixMin,BigDecimal prixMax,BigDecimal qteMin,BigDecimal qteMax);

}
