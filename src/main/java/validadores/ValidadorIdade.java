package validadores;

import java.text.MessageFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validadorIdade")
public class ValidadorIdade implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent componente,
			Object valorObjeto) throws ValidatorException {

		HtmlInputText input = (HtmlInputText) componente;
		Integer valor = (Integer) valorObjeto;

		if (valor < 18) {
			throw new ValidatorException(new FacesMessage(
					MessageFormat.format("A idade informada para o campo"
							+ " \"{0}\" não é válido, idade tem que ser maior ou igual a 18", input.getLabel())));
		}
	}

}
