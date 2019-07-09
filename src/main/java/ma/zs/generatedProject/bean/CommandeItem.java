package ma.zs.generatedProject.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CommandeItem implements Serializable{

@GeneratedValue(strategy = GenerationType.AUTO)

@Id
private Long id ;
private BigDecimal prix ;
private BigDecimal qte ;
@ManyToOne
private Produit produit ;
@ManyToOne
private Commande commande ;

public CommandeItem() {
    }

public Long getId() {
 return id ;
}
public BigDecimal getPrix() {
 return prix ;
}
public BigDecimal getQte() {
 return qte ;
}
public void setId(Long id) {
 this.id = id;
 }
public void setPrix(BigDecimal prix) {
 this.prix = prix;
 }
public void setQte(BigDecimal qte) {
 this.qte = qte;
 }
public Produit getProduit() {
 return produit ;
}
public Commande getCommande() {
 return commande ;
}
public void setProduit(Produit produit) {
 this.produit = produit;
 }
public void setCommande(Commande commande) {
 this.commande = commande;
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
        if (!(object instanceof CommandeItem)) {
            return false;
        }
        CommandeItem other = (CommandeItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


}