package la.foton.treinamento.locadora.mbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import la.foton.treinamento.locadora.datasource.TituloDataSource;
import la.foton.treinamento.locadora.dto.TituloDTO;

@ManagedBean
@RequestScoped
public class ListagemTitulosMBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<TituloDTO> titulosCadastrados;
	
	public String apresentaPaginaTitulos(){
		return "/acessorestrito/titulos/listagem.xhtml";
	}
	
	public void preenchePagina(ActionEvent event){
		titulosCadastrados = TituloDataSource.constroiListaTitulos();
	}
	
	public List<TituloDTO> getTitulosCadastrados(){
		return titulosCadastrados;
	}

}
