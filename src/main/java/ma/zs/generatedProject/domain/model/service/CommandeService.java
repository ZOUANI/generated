package ma.zs.generatedProject.domain.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import ma.zs.generatedProject.bean.Commande;
public interface CommandeService {

public Commande save(Commande commande); 
public Commande  saveWithCommandeItems (Commande commande);public List<Commande> findAll();
public Commande findById(Long id);
public Commande  findByReference(String  reference);
public int delete(Commande commande);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(Commande commande,Commande commandeClone);
public Commande clone(Commande commande);
public List<Commande> clone(List<Commande>commandes); public List<Commande>  findByCriteria(String reference,Long idMin,Long idMax,BigDecimal totalMin,BigDecimal totalMax);

}
