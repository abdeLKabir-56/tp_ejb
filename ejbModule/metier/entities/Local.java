package metier.entities;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import javax.persistence.*;

@Entity

public class Local implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_local;
	@Column(name = "Adresse")
	private String Adresse;
	@Column(name = "Superficie")
	private Double Superficie;
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Constructeur constructeur;

	public Local() {
		super();
	}   
	public int getId_local() {
		return this.Id_local;
	}

	public void setId_local(int Id_local) {
		this.Id_local = Id_local;
	}   
	public String getAdresse() {
		return this.Adresse;
	}

	public void setAdresse(String Adresse) {
		this.Adresse = Adresse;
	}   
	public Double getSuperficie() {
		return this.Superficie;
	}

	public void setSuperficie(Double Superficie) {
		this.Superficie = Superficie;
	}
   
}
