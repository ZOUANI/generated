
package ma.zs.generatedProject.domain.model.service.impl ;
import ma.zs.generatedProject.domain.model.service.CommandeItemService ; 
import ma.zs.generatedProject.domain.model.dao.CommandeItemDao ;
import ma.zs.generatedProject.commun.util.SearchUtil;
import ma.zs.generatedProject.bean.CommandeItem;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import ma.zs.generatedProject.bean.Produit; 
import ma.zs.generatedProject.domain.model.service.ProduitService ; 
import ma.zs.generatedProject.bean.Commande; 
import ma.zs.generatedProject.domain.model.service.CommandeService ; 

 @Service  

 public class CommandeItemServiceImpl implements CommandeItemService  {


 @Autowired 

 private CommandeItemDao commandeitemDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private ProduitService produitService; 

 @Autowired 

 private CommandeService commandeService; 

 @Override 
public CommandeItem  save (CommandeItem commandeitem){

if(commandeitem== null){ 
 return null; 
}else {
 commandeitemDao.save(commandeitem);
return commandeitem;
}
}

 @Override 
public List< CommandeItem>  findAll(){
 return commandeitemDao.findAll();
}

 @Override 
public CommandeItem findById(Long id){
 return commandeitemDao.getOne(id);
}

 @Override 
public int delete(CommandeItem commandeitem){
if(commandeitem== null){ 
  return -1; 
}else {
 commandeitemDao.delete(commandeitem);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       commandeitemDao.deleteById(id);
}
public void clone(CommandeItem commandeitem,CommandeItem commandeitemClone){
if(commandeitem!= null && commandeitemClone != null){
commandeitemClone.setId(commandeitem.getId());
commandeitemClone.setPrix(commandeitem.getPrix());
commandeitemClone.setQte(commandeitem.getQte());
commandeitemClone.setProduit(produitService.clone(commandeitem.getProduit()));
commandeitemClone.setCommande(commandeService.clone(commandeitem.getCommande()));
}
}
public CommandeItem clone(CommandeItem commandeitem){
if(commandeitem== null){       return null ;
}else{CommandeItem commandeitemClone= new CommandeItem();
commandeitemClone.setId(commandeitem.getId());
commandeitemClone.setPrix(commandeitem.getPrix());
commandeitemClone.setQte(commandeitem.getQte());
commandeitemClone.setProduit(produitService.clone(commandeitem.getProduit()));
commandeitemClone.setCommande(commandeService.clone(commandeitem.getCommande()));
return commandeitemClone;
}
}
public List<CommandeItem> clone(List<CommandeItem>commandeitems){
if(commandeitems== null){
       return null ;
}else{List<CommandeItem> commandeitemsClone = new ArrayList();
	 	 	 commandeitems.forEach((commandeitem)->{commandeitemsClone.add(clone(commandeitem));
});return commandeitemsClone;
}
}
 @Override 
 public List< CommandeItem>  findByCriteria(Long idMin,Long idMax,BigDecimal prixMin,BigDecimal prixMax,BigDecimal qteMin,BigDecimal qteMax){
 return entityManager.createQuery(constructQuery(idMin,idMax,prixMin,prixMax,qteMin,qteMax)).getResultList(); 
 }
private String constructQuery(Long idMin,Long idMax,BigDecimal prixMin,BigDecimal prixMax,BigDecimal qteMin,BigDecimal qteMax){
String query = "SELECT c FROM CommandeItem c where 1=1 ";
query += SearchUtil.addConstraintMinMax("c", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("c", "prix", prixMin, prixMax);
query += SearchUtil.addConstraintMinMax("c", "qte", qteMin, qteMax);

  return query; 
}
}
