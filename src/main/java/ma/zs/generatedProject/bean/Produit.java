package ma.zs.generatedProject.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Produit implements Serializable{

@GeneratedValue(strategy = GenerationType.AUTO)

@Id
private Long id ;
private String libelle ;

public Produit() {
    }

public Long getId() {
 return id ;
}
public String getLibelle() {
 return libelle ;
}
public void setId(Long id) {
 this.id = id;
 }
public void setLibelle(String libelle) {
 this.libelle = libelle;
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
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


}