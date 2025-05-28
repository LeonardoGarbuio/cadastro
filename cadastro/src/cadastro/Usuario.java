package cadastro;

import java.sql.DatabaseMetaData;

public class Usuario {
	
	private String nome;
	private int id;
	private String cpf;
	private String email;
	private String telefone;
	private String dataNasc;
	private String ano;
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, int id, String cpf, String email, String telefone, String dataNasc, String ano) {
		super();
		this.nome = nome;
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.ano = ano;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	

}
