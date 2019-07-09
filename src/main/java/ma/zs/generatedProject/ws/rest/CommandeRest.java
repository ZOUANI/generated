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
import ma.zs.generatedProject.domain.model.service.CommandeService;
import ma.zs.generatedProject.bean.Commande;
import ma.zs.generatedProject.ws.rest.vo.CommandeVo;
import ma.zs.generatedProject.ws.rest.converter.CommandeConverter;
import ma.zs.generatedProject.commun.util.* ;
@RestController
@RequestMapping("/easy-faculte/Commande")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CommandeRest {

 @Autowired 
 private CommandeService commandeService;

 @Autowired 
private CommandeConverter commandeConverter ;

@PostMapping("/")
public CommandeVo save(@RequestBody CommandeVo commandeVo){
Commande commande= commandeConverter.toItem(commandeVo);
return commandeConverter.toVo(commandeService.save(commande));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
commandeService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
commandeService.deleteByReference(reference);
}
@GetMapping("/")
public List<CommandeVo> findAll(){
return commandeConverter.toVo(commandeService.findAll());
}

 public CommandeConverter getCommandeConverter(){
return commandeConverter;
}
 
 public void setCommandeConverter(CommandeConverter commandeConverter){
this.commandeConverter=commandeConverter;
}

 public CommandeService getCommandeService(){
return commandeService;
}
 
 public void setCommandeService(CommandeService commandeService){
this.commandeService=commandeService;
}

}