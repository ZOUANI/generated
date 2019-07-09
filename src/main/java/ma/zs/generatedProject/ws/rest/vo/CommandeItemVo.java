package ma.zs.generatedProject.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class CommandeItemVo{

private String id ;
private String prix;
private String prixMin ;
private String prixMax ;
private String qte;
private String qteMin ;
private String qteMax ;
private ProduitVo produitVo ;
private CommandeVo commandeVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getPrix(){
    return prix;
}

public void setPrix(String  prix){
     this.prix = prix;
}

public String  getPrixMin(){
    return prixMin;
}

public void setPrixMin(String  prixMin){
     this.prixMin = prixMin;
}

public String  getPrixMax(){
    return prixMax;
}

public void setPrixMax(String  prixMax){
     this.prixMax = prixMax;
}

public String  getQte(){
    return qte;
}

public void setQte(String  qte){
     this.qte = qte;
}

public String  getQteMin(){
    return qteMin;
}

public void setQteMin(String  qteMin){
     this.qteMin = qteMin;
}

public String  getQteMax(){
    return qteMax;
}

public void setQteMax(String  qteMax){
     this.qteMax = qteMax;
}

public ProduitVo  getProduitVo (){
    return produitVo ;
}

public void setProduitVo (ProduitVo  produitVo ){
     this.produitVo  = produitVo ;
}

public CommandeVo  getCommandeVo (){
    return commandeVo ;
}

public void setCommandeVo (CommandeVo  commandeVo ){
     this.commandeVo  = commandeVo ;
}




}