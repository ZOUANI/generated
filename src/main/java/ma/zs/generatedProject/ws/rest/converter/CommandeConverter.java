package ma.zs.generatedProject.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generatedProject.commun.util.*;
import ma.zs.generatedProject.bean.Commande; 
import ma.zs.generatedProject.ws.rest.vo.CommandeVo; 

 @Component 
public class CommandeConverter extends AbstractConverter<Commande,CommandeVo>{ 

private boolean commandeItems; 

 @Autowired
 private CommandeItemConverter commandeItemConverter ; 

 @Override 
 public Commande toItem(CommandeVo vo) {
 if (vo == null) {
    return null;
      } else {
Commande item = new Commande();

 if (StringUtil.isNotEmpty(vo.getReference())) {
 item.setReference(vo.getReference());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getTotal() != null) {
 item.setTotal(NumberUtil.toBigDecimal(vo.getTotal()));
} 

 if (ListUtil.isNotEmpty(vo.getCommandeItemVos ()) && commandeItems) {
 item.setCommandeItems(commandeItemConverter.toItem(vo.getCommandeItemVos())); 
} 

return item;
 }
 }

  @Override 
 public CommandeVo toVo(Commande item) {
 if (item == null) {
    return null;
      } else {
CommandeVo vo = new CommandeVo();

 if (StringUtil.isNotEmpty(item.getReference())) {
 vo.setReference(item.getReference());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getTotal() != null) {
 vo.setTotal(NumberUtil.toString(item.getTotal()));
} 

 if(ListUtil.isNotEmpty(item.getCommandeItem()) && commandeItems) {
 vo.setCommandeItemVos(commandeItemConverter.toVo(item.getCommandeItems()));
} 

return vo;
 }
 }
public void init() { 

commandeItems = true; 
}
 } 
