package pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import utilitario.Resource;

@DefaultUrl("https://preproduccion.everilion.com/ilionp/acceso.asp")
public class LoginPage extends PageObject {
	
	Resource resource = new Resource();
	
	@FindBy(css="input[name='nombre']")
	private WebElementFacade txtUsuario;
	
	@FindBy(css="input[name='contrasenya']")
	private WebElementFacade txtPassword;
	
	@FindBy(css="div#button_enter")
	private WebElementFacade btnEntrar;
	
	public void setTextUsuario(String value) {
		resource.writeText(txtUsuario, value);
	}
	
	public void setTextPassword(String value) {
		resource.writeText(txtPassword, value);
	}
	
	public void clickEntrar() {
		resource.webElementClick(btnEntrar);
	}
	
}
