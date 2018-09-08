package pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import utilitario.Resource;

public class ReglasComercialesPage extends PageObject {

	Resource resource = new Resource();
	
	/*Elementos de la ventana de la Lista de Reglas Comerciales*/
	@FindBy(id="ctl00_wfInterface_cboCambiarEstado_selection")
	private WebElementFacade selectCambiarEstados;
	
	@FindBy(id="btnAplicarCampos")
	private WebElementFacade btnAplicarCampos;
	
	@FindBy(id="chkSelAllRows")
	private WebElementFacade chkSelAllRows;
	
	@FindBy(xpath="//*[@id=\"ctl00_wfInterface_grdReglas\"]/tbody/tr[2]/td[1]/input")
	private WebElementFacade chkFirts;
	
	@FindBy(xpath="//*[@id=\"ctl00_wfInterface_grdReglas\"]/tbody/tr[4]/td[1]/input")
	private WebElementFacade chkRandonOne;
	
	@FindBy(xpath="//*[@id=\"ctl00_wfInterface_grdReglas\"]/tbody/tr[6]/td[1]/input")
	private WebElementFacade chkRandonTwo;
	
	@FindBy(xpath="//*[@id=\"ctl00_wfInterface_grdReglas\"]/tbody/tr[8]/td[1]/input")
	private WebElementFacade chkRandonTree;
	
	@FindBy(id="ctl00_wfInterface_grdReglas_ctl02_imbExportButton")
	private WebElementFacade btnModificarFirts;
	
	/*Elementos de la ventana de Crear Reglas Comerciales*/
	
	@FindBy(id="ctl00_wfInterface_btnAgregar")
	private WebElementFacade btnNewRegla;
	
	@FindBy(id="ctl00_wfInterface_txtNombreRegla")
	private WebElementFacade txtNombreRegla;
	
	@FindBy(id="ctl00_wfInterface_txtDescripcion")
	private WebElementFacade txtDescripcion;
	
	/*Dias de la Semana*/
	@FindBy(id="btnLunes")
	private WebElementFacade btnLunes;
	
	@FindBy(id="btnMartes")
	private WebElementFacade btnMartes;
	
	@FindBy(id="btnMiercoles")
	private WebElementFacade btnMiercoles;
	
	@FindBy(id="btnJueves")
	private WebElementFacade btnJueves;
	
	@FindBy(id="btnViernes")
	private WebElementFacade btnViernes;
	
	@FindBy(id="btnSabado")
	private WebElementFacade btnSabado;
	
	@FindBy(id="btnDomingo")
	private WebElementFacade btnDomingo;
	
	@FindBy(id="ctl00_wfInterface_txtDesde")
	private WebElementFacade txtDesde;
	
	@FindBy(id="ctl00_wfInterface_txtHasta")
	private WebElementFacade txtHasta;
	
	@FindBy(id="ctl00_wfInterface_txtFrecuencia")
	private WebElementFacade txtFrecuencia;
	
	@FindBy(id="ctl00_wfInterface_btnCrear")
	private WebElementFacade btnCrear;
	
	/*Metodos*/
	
	public void changeEstado() {
		resource.selectText(selectCambiarEstados, "Activo");
	}
	
	public void clickAplicarCambios() {
		resource.webElementClick(btnAplicarCampos);
	}
	
	public void checkOne() {
		resource.webElementClick(chkFirts);
	}
	
	public void checkRandom() {
		resource.webElementClick(chkRandonOne);
		resource.webElementClick(chkRandonTwo);
		resource.webElementClick(chkRandonTree);
	}
	
	public void checkAll() {
		resource.webElementClick(chkSelAllRows);
	}
	
	public void clickModificar() {
		resource.webElementClick(btnModificarFirts);
	}
	
	/****************************************/
	
	public void clickNewRegla() {
		resource.webElementClick(btnNewRegla);
	}
	
	public void setTextNombreRegla(String value) {
		resource.writeText(txtNombreRegla, value);
	}
	
	public void setTextDescripcion(String value) {
		resource.writeText(txtDescripcion, value);
	}
	
	public void checkDias(boolean dia1, boolean dia2, boolean dia3, boolean dia4, boolean dia5, boolean dia6, boolean dia7) {
		if(dia1)resource.webElementClick(btnLunes);
		if(dia2)resource.webElementClick(btnMartes);
		if(dia3)resource.webElementClick(btnMiercoles);
		if(dia4)resource.webElementClick(btnJueves);
		if(dia5)resource.webElementClick(btnViernes);
		if(dia6)resource.webElementClick(btnSabado);
		if(dia7)resource.webElementClick(btnDomingo);
	}
	
	public void setTextDesde(String value) {
		resource.writeText(txtDesde, value);
	}
	
	public void setTextHasta(String value) {
		resource.writeText(txtHasta, value);
	}
	
	public void setTextFrecuencia(String value) {
		resource.writeText(txtFrecuencia, value);
	}
	
	public void clickCrear() {
		resource.webElementClick(btnCrear);
	}
	
	
}
