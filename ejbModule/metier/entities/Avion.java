package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Avion
 *
 */
@Entity

public class Avion implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Immatricule;
	@Column(name = "Nom")
	private String Nom;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(mappedBy = "avions")
	private List<Pilote> pilotes;
	
	@ManyToOne
	private Constructeur constructeur;
	
	public Avion() {
		super();
	}   
	public int getImmatricule() {
		return this.Immatricule;
	}

	public void setImmatricule(int Immatricule) {
		this.Immatricule = Immatricule;
	}   
	public String getNom() {
		return this.Nom;
	}

	public void setNom(String Nom) {
		this.Nom = Nom;
	}
   
}
