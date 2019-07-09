package ma.zs.generatedProject.ws.rest ;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import ma.zs.generatedProject.domain.model.service.ProduitService;
import ma.zs.generatedProject.bean.Produit;
import ma.zs.generatedProject.ws.rest.vo.ProduitVo;
import ma.zs.generatedProject.ws.rest.converter.ProduitConverter;
import ma.zs.generatedProject.commun.util.* ;
@RestController
@RequestMapping("/easy-faculte/Produit")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ProduitRest {

 @Autowired 
 private ProduitService produitService;

 @Autowired 
private ProduitConverter produitConverter ;

@PostMapping("/")
public ProduitVo save(@RequestBody ProduitVo produitVo){
Produit produit= produitConverter.toItem(produitVo);
return produitConverter.toVo(produitService.save(produit));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
produitService.deleteById(id);
}
@GetMapping("/")
public List<ProduitVo> findAll(){
return produitConverter.toVo(produitService.findAll());
}

 public ProduitConverter getProduitConverter(){
return produitConverter;
}
 
 public void setProduitConverter(ProduitConverter produitConverter){
this.produitConverter=produitConverter;
}

 public ProduitService getProduitService(){
return produitService;
}
 
 public void setProduitService(ProduitService produitService){
this.produitService=produitService;
}

}