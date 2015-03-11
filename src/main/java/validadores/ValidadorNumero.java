package validadores;

import java.text.MessageFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validadorNumero")
public class ValidadorNumero implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent componente, Object valorObjeto)
			throws ValidatorException {
		
		HtmlInputText input = (HtmlInputText)componente;
		String valor = (String)valorObjeto;
		
		if (valor!=null) {
			for (int i = 0; i < valor.length(); i++) {
				if (!Character.isDigit(valor.charAt(i))) {
					throw new ValidatorException(
							new FacesMessage(MessageFormat.format(
									"O número informado para o campo" + " \"{0}\" não é válido",
									input.getLabel())));
				}
			}
		}

	}

}
