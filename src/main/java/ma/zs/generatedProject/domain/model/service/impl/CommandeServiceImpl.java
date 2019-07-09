
package ma.zs.generatedProject.domain.model.service.impl ;
import ma.zs.generatedProject.domain.model.service.CommandeService ; 
import ma.zs.generatedProject.domain.model.dao.CommandeDao ;
import ma.zs.generatedProject.commun.util.SearchUtil;
import ma.zs.generatedProject.bean.Commande;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import ma.zs.generatedProject.domain.model.service.CommandeItemService ; 
import ma.zs.generatedProject.bean.CommandeItem ; 

 @Service  

 public class CommandeServiceImpl implements CommandeService  {


 @Autowired 

 private CommandeDao commandeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private CommandeItemService commandeitemService; 

 @Override 
public Commande  save (Commande commande){

if(commande== null){ 
 return null; 
}else {
 commandeDao.save(commande);
return commande;
}
}

 @Override 
public Commande  saveWithCommandeItems (Commande commande){

if(commande== null){ 
        return null; 
}else {
   if(commande.getCommandeItems().isEmpty()){
            return null;
        }else{
            for (CommandeItem commandeitem : commande.getCommandeItems()) {
commandeitem.setCommande(commande);
 commandeitemService.save(  commandeitem);          
            }
            }
commandeDao.save(commande);
return commande;
}
}

 @Override 
public List< Commande>  findAll(){
 return commandeDao.findAll();
}

 @Override 
public Commande findById(Long id){
 return commandeDao.getOne(id);
}

 @Override 
public Commande  findByReference(String  reference){
 return commandeDao.findByReference(reference);
}

 @Override 
public int delete(Commande commande){
if(commande== null){ 
  return -1; 
}else {
 commandeDao.delete(commande);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       commandeDao.deleteById(id);
}

 @Override 
public void  deleteByReference(String  reference){
  commandeDao.deleteByReference(reference);
}
public void clone(Commande commande,Commande commandeClone){
if(commande!= null && commandeClone != null){
commandeClone.setId(commande.getId());
commandeClone.setReference(commande.getReference());
commandeClone.setTotal(commande.getTotal());
commandeClone.setCommandeItems(commandeitemService.clone(commande.getCommandeItems()));
}
}
public Commande clone(Commande commande){
if(commande== null){       return null ;
}else{Commande commandeClone= new Commande();
commandeClone.setId(commande.getId());
commandeClone.setReference(commande.getReference());
commandeClone.setTotal(commande.getTotal());
commandeClone.setCommandeItems(commandeitemService.clone(commande.getCommandeItems()));
return commandeClone;
}
}
public List<Commande> clone(List<Commande>commandes){
if(commandes== null){
       return null ;
}else{List<Commande> commandesClone = new ArrayList();
	 	 	 commandes.forEach((commande)->{commandesClone.add(clone(commande));
});return commandesClone;
}
}
 @Override 
 public List< Commande>  findByCriteria(String reference,Long idMin,Long idMax,BigDecimal totalMin,BigDecimal totalMax){
 return entityManager.createQuery(constructQuery(reference,idMin,idMax,totalMin,totalMax)).getResultList(); 
 }
private String constructQuery(String reference,Long idMin,Long idMax,BigDecimal totalMin,BigDecimal totalMax){
String query = "SELECT c FROM Commande c where 1=1 ";
query += SearchUtil.addConstraint( "c", "reference","=",reference);
query += SearchUtil.addConstraintMinMax("c", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("c", "total", totalMin, totalMax);

  return query; 
}
}
