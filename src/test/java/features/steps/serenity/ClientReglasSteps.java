package features.steps.serenity;

import net.thucydides.core.annotations.Step;
import pages.BienvenidaPage;
import pages.ReglasComercialesPage;
import utilitario.Resource;

public class ClientReglasSteps {
	
	BienvenidaPage bienvenidaPage;
	ReglasComercialesPage reglasComercialesPage;
	
	Resource resource;
	
	@Step
	public void optionClients() {
		bienvenidaPage.navegateToCliente();
	}
	
	@Step
	public void filterClient(String term) {
		bienvenidaPage.setTextSearchValue(term);
	}
	
	@Step
	public void search() {
		bienvenidaPage.searchValue();
	}
	
	@Step
	public void selectClient() {
		bienvenidaPage.selectClientList();
	}
	
	@Step
	public void openWindowReglaComercial() {		
		bienvenidaPage.openReglasComercial();
	}
	
	@Step
	public void searchClient(boolean newRegla) {
		bienvenidaPage.setTextSearchValue("PROMOCARD COBRA PERU");
		bienvenidaPage.searchValue();
		resource.waitSeconds(5);
		bienvenidaPage.selectClientList();
		resource.waitSeconds(5);
		bienvenidaPage.openReglasComercial();
		resource.waitSeconds(5);
		resource.selectWindow();
		if(newRegla) {
			resource.waitSeconds(5);
			reglasComercialesPage.clickNewRegla();
			resource.waitSeconds(5);
			resource.selectWindow();
		}
	}
	
	@Step
	public void ingresarNombreDesripcion() {
		reglasComercialesPage.setTextNombreRegla("Regla-000026");
		reglasComercialesPage.setTextDescripcion("Testing Automatic");
	}
	
	@Step
	public void checkUnDiaRangoHoras() {
		reglasComercialesPage.checkDias(true, false, false, false, false, false, false);
		reglasComercialesPage.setTextDesde("09:00");
		reglasComercialesPage.setTextHasta("14:00");
	}
	
	@Step
	public void checkDiasRangoHoras() {
		reglasComercialesPage.checkDias(true, false, true, false, false, true, true);
		reglasComercialesPage.setTextDesde("07:00");
		reglasComercialesPage.setTextHasta("15:00");
	}
	
	@Step
	public void allCheckDiasRangoHoras() {
		reglasComercialesPage.checkDias(true, true, true, true, true, true, true);
		reglasComercialesPage.setTextDesde("08:00");
		reglasComercialesPage.setTextHasta("17:00");
	}
	
	@Step
	public void ingresarFrecuencia() {
		reglasComercialesPage.setTextFrecuencia("6");
	}
	
	@Step
	public void saveRegla() {
		reglasComercialesPage.clickCrear();
		resource.waitSeconds(5);
		resource.alertAccept();
		
	}
	
	/**********************************************/
	
	@Step
	public void checkOne() {
		reglasComercialesPage.checkOne();
	}
	
	@Step
	public void checkRandom() {
		reglasComercialesPage.checkRandom();
	}
	
	@Step
	public void checkAllReglas() {
		reglasComercialesPage.checkAll();
	}	
	
	@Step
	public void saveEstadoReglas() {
		reglasComercialesPage.changeEstado();
		reglasComercialesPage.clickAplicarCambios();
		resource.alertAccept();
		resource.waitSeconds(5);
		resource.alertAccept();
	}
	
	@Step 
	public void clickModificarRegla() {
		reglasComercialesPage.clickModificar();
		resource.waitSeconds(5);
		resource.selectWindow();
	}
	
	@Step
	public void editDatos(int cant) {
		
		if(cant==1 || cant==2 || cant==3)reglasComercialesPage.setTextNombreRegla("Regla-00128");
		if(cant==2 || cant==3)reglasComercialesPage.setTextDescripcion("actualizar descripcion");
		if(cant==2 || cant==3)reglasComercialesPage.checkDias(true, true, true, true, true, true, true);
		if(cant==3)reglasComercialesPage.setTextDesde("11:00");
		if(cant==3)reglasComercialesPage.setTextHasta("19:00");
		if(cant==3)reglasComercialesPage.setTextFrecuencia("6");
		
	}
	
}
