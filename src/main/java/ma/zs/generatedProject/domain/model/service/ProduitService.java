package ma.zs.generatedProject.domain.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import ma.zs.generatedProject.bean.Produit;
public interface ProduitService {

public Produit save(Produit produit); 
public List<Produit> findAll();
public Produit findById(Long id);
public int delete(Produit produit);
public void  deleteById(Long id);
public void clone(Produit produit,Produit produitClone);
public Produit clone(Produit produit);
public List<Produit> clone(List<Produit>produits); public List<Produit>  findByCriteria(String libelle,Long idMin,Long idMax);

}
