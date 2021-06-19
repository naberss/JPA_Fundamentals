package Classes;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 6315121226851356350L;
	private int ID;
	private String nome;
	private String email;

	public Pessoa(int iD, String nome, String email) {
		ID = iD;
		this.nome = nome;
		this.email = email;
	}

	public Pessoa() {
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [ID=" + ID + ", nome=" + nome + ", email=" + email + "]";
	}

}
