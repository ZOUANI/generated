package ma.zs.generatedProject.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.OneToMany;
@Entity
public class Commande implements Serializable{

@GeneratedValue(strategy = GenerationType.AUTO)

@Id
private Long id ;
private String reference ;
private BigDecimal total ;
@OneToMany(mappedBy ="commande")
private List<CommandeItem> commandeItems ;

public Commande() {
    }

public Long getId() {
 return id ;
}
public String getReference() {
 return reference ;
}
public BigDecimal getTotal() {
 return total ;
}
public void setId(Long id) {
 this.id = id;
 }
public void setReference(String reference) {
 this.reference = reference;
 }
public void setTotal(BigDecimal total) {
 this.total = total;
 }
public List<CommandeItem> getCommandeItems() {
 return commandeItems ;
}
public void setCommandeItems(List<CommandeItem> commandeItems) {
 this.commandeItems = commandeItems;
 }
 @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


}