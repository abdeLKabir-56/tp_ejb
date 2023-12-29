package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity

public class Pilote implements Serializable { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Numero;
	@Column(name = "Nom")
	private String Nom;
	@Column(name = "Ntel")
	private int Ntel;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<Avion> avions;

	public Pilote() {
		super();
	}   
	public int getNumero() {
		return this.Numero;
	}

	public void setNumero(int Numero) {
		this.Numero = Numero;
	}   
	public String getNom() {
		return this.Nom;
	}

	public void setNom(String Nom) {
		this.Nom = Nom;
	}   
	public int getNtel() {
		return this.Ntel;
	}

	public void setNtel(int Ntel) {
		this.Ntel = Ntel;
	}
   
}
