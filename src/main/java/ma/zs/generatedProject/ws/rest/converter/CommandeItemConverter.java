package ma.zs.generatedProject.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generatedProject.commun.util.*;
import ma.zs.generatedProject.bean.CommandeItem; 
import ma.zs.generatedProject.ws.rest.vo.CommandeItemVo; 

 @Component 
public class CommandeItemConverter extends AbstractConverter<CommandeItem,CommandeItemVo>{ 

private boolean produit; 

 @Autowired
 private ProduitConverter produitConverter ; 
private boolean commande; 

 @Autowired
 private CommandeConverter commandeConverter ; 

 @Override 
 public CommandeItem toItem(CommandeItemVo vo) {
 if (vo == null) {
    return null;
      } else {
CommandeItem item = new CommandeItem();

 if(produit&& vo.getProduitVo() != null) {
 item.setProduit(produitConverter.toItem(vo.getProduitVo()));
} 
 
 if(commande&& vo.getCommandeVo() != null) {
 item.setCommande(commandeConverter.toItem(vo.getCommandeVo()));
} 
 
 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getPrix() != null) {
 item.setPrix(NumberUtil.toBigDecimal(vo.getPrix()));
} 

 if (vo.getQte() != null) {
 item.setQte(NumberUtil.toBigDecimal(vo.getQte()));
} 

return item;
 }
 }

  @Override 
 public CommandeItemVo toVo(CommandeItem item) {
 if (item == null) {
    return null;
      } else {
CommandeItemVo vo = new CommandeItemVo();

 if(produit&& item.getProduit() != null) {
 vo.setProduitVo(produitConverter.toVo(item.getProduit()));
} 
 
 if(commande&& item.getCommande() != null) {
 vo.setCommandeVo(commandeConverter.toVo(item.getCommande()));
} 
 
 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getPrix() != null) {
 vo.setPrix(NumberUtil.toString(item.getPrix()));
} 

 if (item.getQte() != null) {
 vo.setQte(NumberUtil.toString(item.getQte()));
} 

return vo;
 }
 }
public void init() { 

produit = true; 

commande = true; 
}
 } 
