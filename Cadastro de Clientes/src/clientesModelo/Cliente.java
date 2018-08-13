package clientesModelo;

import java.io.Serializable;
import java.util.GregorianCalendar;

import utilitarios.LtpLib;

public class Cliente implements Serializable{
	// Atributos
	private int codigo;
	private String nome;
	private String telefone;
	private GregorianCalendar nascimento;
	private String endereco;
	private String tags;
	private String email;
	public Cliente(int codigo, String nome, String telefone,
			GregorianCalendar nascimento, String email, String endereco, String tags) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.email = email;
		this.endereco = endereco;
		this.tags = tags;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public GregorianCalendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(GregorianCalendar nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTags() {
		return tags;
	}
	public void setTags (String tags) {
		this.tags = tags;
	}
	public String getEndereco() {
		return endereco; 
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String toString() {
		return
			"Código     : " + codigo + "\n" +
			"Nome       : " + nome + "\n" +
			"Telefone   : " + telefone + "\n" +
			"Endereço   : " + endereco + "\n" +
			"Etiqueta   : " + tags + "\n" +
			"Nascimento : " + (nascimento==null ? "" : LtpLib.formatarData(nascimento, "dd/MM/yyyy")) + "\n" +
			"Email      : " + email + "\n";
			
	}
	public Cliente clone() {
		return new Cliente(codigo,nome,telefone,nascimento,email,endereco,tags);
	}
	public boolean equals(Cliente objCliente) {
		return nome.equalsIgnoreCase(objCliente.getNome())&&
			   telefone.equals(objCliente.telefone) &&
			   endereco.equals(objCliente.endereco) &&
			   tags.equals(objCliente.tags)&& 
			   email.equals(objCliente.email) &&
			   nascimento.equals(objCliente.nascimento);
			  
		
	}
	
}





