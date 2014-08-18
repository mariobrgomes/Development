package business;

import java.util.Date;

public class Contato {
	
	private String nome,email,endereco,telefoneR,telefoneC,cidade, estado;
	private int id;
	private Date dataNascimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefoneR() {
		return telefoneR;
	}

	public void setTelefoneR(String telefoneR) {
		this.telefoneR = telefoneR;
	}

	public String getTelefoneC() {
		return telefoneC;
	}

	public void setTelefoneC(String telefoneC) {
		this.telefoneC = telefoneC;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
