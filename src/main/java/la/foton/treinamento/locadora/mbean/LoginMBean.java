package la.foton.treinamento.locadora.mbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 * @author John
 * Managed Bean responsavel pela realização do login
 * do usuario.
 */
@ManagedBean
@SessionScoped
public class LoginMBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String login(){
		return "/acessorestrito/home.xhtml";
	}

}
