package la.foton.treinamento.locadora.dto;

import java.util.Date;

public class TituloDTO 
{

	private String nome;
	private Double preco;
	private Date dataCadastro;
	
	public TituloDTO(String nome, Double preco, Date dataCadastro) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.dataCadastro = dataCadastro;
	}
	
	
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	
	
	
}
