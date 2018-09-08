package pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import utilitario.Resource;

public class BienvenidaPage extends PageObject {
	
	Resource resource = new Resource();
	
	@FindBy(id="data_user_right")
	private WebElementFacade lblMensaje;
	
	@FindBy(xpath="//*[@role='menuitem']//*[text()='Ventas']")
	private WebElementFacade mnuVentas;
	
	@FindBy(id="ui-menu-1-0")
	private WebElementFacade sbmnuFormularios;
	
	@FindBy(css="#ui-menu-1-5")
	private WebElementFacade sbmnuClientesNuevoPeru;
	
	@FindBy(css="input#KeySearch.IN_S")
	private WebElementFacade txtSearchValue;
	
	@FindBy(xpath="//*[@id='FILTERS_MASTER_ASP']/a/img")
	private WebElementFacade btnSearch;
	
	@FindBy(id="ui-menu-1-3")
	private WebElementFacade sbmnuFormulariosP;
	
	@FindBy(css="#ui-menu-1-39")
	private WebElementFacade sbmnuClientes;
	
	@FindBy(xpath="/html/body/form/div/table/tbody/tr[2]/td[1]/div/a")
	private WebElementFacade selectClient;
	
	@FindBy(xpath="/html/body/form/table[3]/tbody/tr/td/div[14]/div[1]/a")
	private WebElementFacade btnOpenTarjetas;
	
	/*Ruta del Modal de Reglas Comercial*/
	@FindBy(xpath="/html/body/form/table[3]/tbody/tr/td/div[16]/div[1]/a")
	private WebElementFacade mdlReglasComerciales;
		
	public String getMensaje() {
		waitFor(lblMensaje);
		return lblMensaje.getText();
	}
	
	public void navegateToCliente() {
		//getDriver().switchTo().defaultContent();
		waitFor(mnuVentas).click();
		waitFor(sbmnuFormularios);
		withAction().moveToElement(sbmnuFormularios).build().perform();
		waitFor(sbmnuClientesNuevoPeru).click();
	}
	
	public void setTextSearchValue(String term) {
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("main").switchTo().frame("botones");
		//getDriver().findElement(By.xpath("//*[@id='KeySearch']")).sendKeys(term);
		//typeInto(txtSearchValue, term);
		resource.writeText(txtSearchValue, term);
	}
	
	public void searchValue() {
		resource.webElementClick(btnSearch);
	}
	
	public void selectClientList() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("left");
		//getDriver().findElement(By.xpath("/html/body/form/div/table/tbody/tr[2]/td[1]/div/a")).click();
		resource.webElementClick(selectClient);
	}
	
	public void openModalTarjetas() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("main").switchTo().frame("pantalla");
		//getDriver().findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/div[14]/div[1]/a")).click();
		resource.webElementClick(btnOpenTarjetas);							  
	}
	
	public void openReglasComercial() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("main").switchTo().frame("pantalla").switchTo().frame("main").switchTo().frame("pantalla");
		resource.webElementClick(mdlReglasComerciales);
	}
	
}
