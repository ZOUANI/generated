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
import ma.zs.generatedProject.domain.model.service.CommandeItemService;
import ma.zs.generatedProject.bean.CommandeItem;
import ma.zs.generatedProject.ws.rest.vo.CommandeItemVo;
import ma.zs.generatedProject.ws.rest.converter.CommandeItemConverter;
import ma.zs.generatedProject.commun.util.* ;
@RestController
@RequestMapping("/easy-faculte/CommandeItem")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CommandeItemRest {

 @Autowired 
 private CommandeItemService commandeItemService;

 @Autowired 
private CommandeItemConverter commandeItemConverter ;

@PostMapping("/")
public CommandeItemVo save(@RequestBody CommandeItemVo commandeItemVo){
CommandeItem commandeItem= commandeItemConverter.toItem(commandeItemVo);
return commandeItemConverter.toVo(commandeItemService.save(commandeItem));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
commandeItemService.deleteById(id);
}
@GetMapping("/")
public List<CommandeItemVo> findAll(){
return commandeItemConverter.toVo(commandeItemService.findAll());
}

 public CommandeItemConverter getCommandeItemConverter(){
return commandeItemConverter;
}
 
 public void setCommandeItemConverter(CommandeItemConverter commandeItemConverter){
this.commandeItemConverter=commandeItemConverter;
}

 public CommandeItemService getCommandeItemService(){
return commandeItemService;
}
 
 public void setCommandeItemService(CommandeItemService commandeItemService){
this.commandeItemService=commandeItemService;
}

}