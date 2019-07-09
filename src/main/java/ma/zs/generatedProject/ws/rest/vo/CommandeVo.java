package ma.zs.generatedProject.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class CommandeVo{

private String id ;
private String reference ;
private String total;
private String totalMin ;
private String totalMax ;
private List<CommandeItemVo>commandeItemsVo;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getReference(){
    return reference;
}

public void setReference(String  reference){
     this.reference = reference;
}

public String  getTotal(){
    return total;
}

public void setTotal(String  total){
     this.total = total;
}

public String  getTotalMin(){
    return totalMin;
}

public void setTotalMin(String  totalMin){
     this.totalMin = totalMin;
}

public String  getTotalMax(){
    return totalMax;
}

public void setTotalMax(String  totalMax){
     this.totalMax = totalMax;
}

public List<CommandeItemVo> getCommandeItemsVo(){
    return commandeItemsVo;
}

public void setCommandeItemVo(List<CommandeItemVo> CommandeItemsVo){
     this.commandeItemsVo = commandeItemsVo;
}




}