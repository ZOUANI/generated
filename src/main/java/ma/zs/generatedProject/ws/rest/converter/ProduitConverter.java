package ma.zs.generatedProject.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generatedProject.commun.util.*;
import ma.zs.generatedProject.bean.Produit; 
import ma.zs.generatedProject.ws.rest.vo.ProduitVo; 

 @Component 
public class ProduitConverter extends AbstractConverter<Produit,ProduitVo>{ 


 @Override 
 public Produit toItem(ProduitVo vo) {
 if (vo == null) {
    return null;
      } else {
Produit item = new Produit();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public ProduitVo toVo(Produit item) {
 if (item == null) {
    return null;
      } else {
ProduitVo vo = new ProduitVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
