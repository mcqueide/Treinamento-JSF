package la.foton.treinamento.locadora.mbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class CadastroTituloMBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double preco;
	private Double precoGourmet;
	private Integer quantidade;
	private String emailFornecedor;
	private Integer categoria;
	
	public Integer getCategoria() {
		return categoria;
	}
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPrecoGourmet() {
		return precoGourmet;
	}
	public void setPrecoGourmet(Double precoGourmet) {
		this.precoGourmet = precoGourmet;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getEmailFornecedor() {
		return emailFornecedor;
	}
	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}
	
	public void salvar(){
		
	}
	
	public void calculaGourmet(){
		precoGourmet = preco * 1.5;
	}
	
	public List<SelectItem> opcoesCategoria(){
		List<SelectItem> itens = new ArrayList<SelectItem>();
		itens.add(new SelectItem(1, "Terror"));
		itens.add(new SelectItem(2, "Humor"));
		itens.add(new SelectItem(3, "Suspense"));
		itens.add(new SelectItem(4, "Drama"));
		
		return itens;
	}

}
