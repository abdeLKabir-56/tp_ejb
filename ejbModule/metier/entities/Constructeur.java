package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
public class Constructeur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Code;
	@Column(name = "Nom")
	private String Nom;
	@Column(name = "Adresse")
	private String Adresse;
	private static final long serialVersionUID = 1L;
	
	
	@OneToMany(mappedBy = "constructeur")
	private List<Avion> avions;
	
	@OneToOne(mappedBy = "constructeur")
	private Local local;
	
	public Constructeur() {
		super();
	}   
	public int getCode() {
		return this.Code;
	}

	public void setCode(int Code) {
		this.Code = Code;
	}   
	public String getNom() {
		return this.Nom;
	}

	public void setNom(String Nom) {
		this.Nom = Nom;
	}   
	public String getAdresse() {
		return this.Adresse;
	}

	public void setAdresse(String Adresse) {
		this.Adresse = Adresse;
	}
   
}
