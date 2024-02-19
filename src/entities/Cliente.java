package entities;

public class Cliente {

	// Atributos (campos)
	private Integer idCliente;
	private String nome;
	private String telefone;
	private String email;
	private String cpf;

	// Encapsulamento (set/get)
	// Para cada atributo da classe iremos criar uma função
	// de entrada de dados e saída de dados
	// set -> nome da função para entrada de dados
	// get -> nome da função para saída de dados

	// Função para preenchimento do campo idCliente
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	// Função para saída (retorno) do campo idCliente
	public Integer getIdCliente() {
		return idCliente;
	}

	// Função para preenchimento do campo nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Função para saída (retorno) do campo nome
	public String getNome() {
		return nome;
	}

	// Função para preenchimento do campo telefone
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// Função para saída (retorno) do campo telefone
	public String getTelefone() {
		return telefone;
	}

	// Função para preenchimento do campo email
	public void setEmail(String email) {
		this.email = email;
	}

	// Função para saída (retorno) do campo email
	public String getEmail() {
		return email;
	}

	// Função para preenchimento do campo cpf
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Função para saída (retorno) do campo cpf
	public String getCpf() {
		return cpf;
	}

}
