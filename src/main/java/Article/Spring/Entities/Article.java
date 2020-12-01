package Article.Spring.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

import com.sun.istack.NotNull;

@Entity
@Table(name="article")
public class Article implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Article [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", quantite=" + quantite + ", etat="
				+ etat + "]";
	}
	@Id
	@GeneratedValue
	@Column(name="article_id")
	private long id ;
	
	@NotNull
	@Column(name = "libellé")
	//@NotEmpty(message = "SVP donner le nom de l'article")
	private String libelle;
	
	
	@Column(name = "Prix")
	//@NotEmpty(message = "SVP donner le prix")
	private float prix;
	
	@NotNull
	@Range(min = 1, max = 20)
	@Column(name = "Quantité",columnDefinition = "INTEGER default 1")
	//@NotEmpty(message = "SVP donner la quantité en stock")
	private int quantite=1;
	
	@Column(name = "Etat")
	//@NotEmpty(message = "SVP l'état de l'article")
	private String etat;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String libelle, float prix, @Range(min = 1, max = 20) int quantite, String etat) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.quantite = quantite;
		this.etat = etat;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}
