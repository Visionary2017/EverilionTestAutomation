package features.steps.serenity;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;
import utilitario.Resource;

public class UserLoginSteps {
	
	LoginPage loginPage;
	Resource resource;
	
	@Step
	public void loadEverilion() {
		loginPage.open();
	}
	
	@Step
	public void autenticacion(String usuario, String password) {
		loginPage.setTextUsuario(usuario);
		loginPage.setTextPassword(password);
		loginPage.clickEntrar();
		resource.waitSeconds(5);
		if (resource.getCurrent().equalsIgnoreCase(resource.P_BIENVENIDA)) {
			//assertThat(bienvenidaPage.getMensaje()).contains("Angel Jhonatan Mamani");
			System.out.println("Inicio sesion correctamente");
		}else if(resource.getCurrent().equalsIgnoreCase(resource.p_desactivado(usuario))){
			resource.desactivarUser();
			resource.alertAccept();
			resource.waitSeconds(5);
			autenticacion(usuario,password);
			System.out.println("La sesion existe del usuario - " + usuario);
		}else {
			resource.closeWindow();
			System.out.println("Cerrar la ventana de manera forzada");
		}
	}
	
}
