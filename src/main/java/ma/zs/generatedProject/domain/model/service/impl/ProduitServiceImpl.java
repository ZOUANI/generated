
package ma.zs.generatedProject.domain.model.service.impl ;
import ma.zs.generatedProject.domain.model.service.ProduitService ; 
import ma.zs.generatedProject.domain.model.dao.ProduitDao ;
import ma.zs.generatedProject.commun.util.SearchUtil;
import ma.zs.generatedProject.bean.Produit;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class ProduitServiceImpl implements ProduitService  {


 @Autowired 

 private ProduitDao produitDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public Produit  save (Produit produit){

if(produit== null){ 
 return null; 
}else {
 produitDao.save(produit);
return produit;
}
}

 @Override 
public List< Produit>  findAll(){
 return produitDao.findAll();
}

 @Override 
public Produit findById(Long id){
 return produitDao.getOne(id);
}

 @Override 
public int delete(Produit produit){
if(produit== null){ 
  return -1; 
}else {
 produitDao.delete(produit);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       produitDao.deleteById(id);
}
public void clone(Produit produit,Produit produitClone){
if(produit!= null && produitClone != null){
produitClone.setId(produit.getId());
produitClone.setLibelle(produit.getLibelle());
}
}
public Produit clone(Produit produit){
if(produit== null){       return null ;
}else{Produit produitClone= new Produit();
produitClone.setId(produit.getId());
produitClone.setLibelle(produit.getLibelle());
return produitClone;
}
}
public List<Produit> clone(List<Produit>produits){
if(produits== null){
       return null ;
}else{List<Produit> produitsClone = new ArrayList();
	 	 	 produits.forEach((produit)->{produitsClone.add(clone(produit));
});return produitsClone;
}
}
 @Override 
 public List< Produit>  findByCriteria(String libelle,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,Long idMin,Long idMax){
String query = "SELECT p FROM Produit p where 1=1 ";
query += SearchUtil.addConstraint( "p", "libelle","=",libelle);
query += SearchUtil.addConstraintMinMax("p", "id", idMin, idMax);

  return query; 
}
}
