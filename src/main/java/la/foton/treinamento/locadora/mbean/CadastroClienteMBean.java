package la.foton.treinamento.locadora.mbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class CadastroClienteMBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String sobrenome;
	private Integer idade;
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void salvar(){
		
	}
	
	public List<SelectItem> opcoesFilme(){
		List<SelectItem> itens = new ArrayList<SelectItem>();
		itens.add(new SelectItem(1, "Terror"));
		itens.add(new SelectItem(2, "Humor"));
		itens.add(new SelectItem(3, "Suspense"));
		itens.add(new SelectItem(4, "Drama"));
		
		return itens;
	}
	
	

}
