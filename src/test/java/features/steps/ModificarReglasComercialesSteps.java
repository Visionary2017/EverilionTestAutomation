package features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.ClientReglasSteps;
import features.steps.serenity.UserLoginSteps;
import net.thucydides.core.annotations.Steps;
import utilitario.Resource;

public class ModificarReglasComercialesSteps {
	
	Resource resource;
	
	@Steps
	UserLoginSteps userLoginSteps;
	
	@Steps
	ClientReglasSteps clientReglasSteps;
	
	/********/
	
	@Given("^que el Gestor de Flotas quiere modificar el registro seleccionado$")
	public void que_el_Gestor_de_Flotas_quiere_modificar_el_registro_seleccionado() {
		userLoginSteps.loadEverilion();
	    resource.waitSeconds(5);
	    userLoginSteps.autenticacion("48676537", "everis");
	    resource.waitSeconds(5);
	    clientReglasSteps.optionClients();
	    resource.waitSeconds(5);
	    clientReglasSteps.searchClient(false);
	}

	@When("^se muestre los datos del item seleccionado a la pagina de Mantenimiento de Reglas Comerciales$")
	public void se_muestre_los_datos_del_item_seleccionado_a_la_pagina_de_Mantenimiento_de_Reglas_Comerciales() {
		clientReglasSteps.clickModificarRegla();
	}

	@When("^se procedera a modificacion de un dato\\(Nombre de Regla, Descripcion, Dias en los que abastece, Hora, Frecuencia\\)$")
	public void se_procedera_a_modificacion_de_un_dato_Nombre_de_Regla_Descripcion_Dias_en_los_que_abastece_Hora_Frecuencia() {
		clientReglasSteps.editDatos(1);
	}

	@Then("^se guardara el dato modificado en el boton Crear nueva Regla Comercial$")
	public void se_guardara_el_dato_modificado_en_el_boton_Crear_nueva_Regla_Comercial() {
		clientReglasSteps.saveRegla();
	}

	@When("^se procedera a modificacion de dos datos a mas\\(Nombre de Regla, Descripcion, Dias en los que abastece, Hora, Frecuencia\\)$")
	public void se_procedera_a_modificacion_de_dos_datos_a_m_s_Nombre_de_Regla_Descripcion_Dias_en_los_que_abastece_Hora_Frecuencia() {
		clientReglasSteps.editDatos(2);
	}

	@Then("^se guardara los datos modificados en el boton Crear nueva Regla Comercial$")
	public void se_guardara_los_datos_modificados_en_el_boton_Crear_nueva_Regla_Comercial() {
		clientReglasSteps.saveRegla();
	}

	@Then("^se procedera a modificacion de todos los datos en la pantalla de Mantenimiento$")
	public void se_procedera_a_modificacion_de_todos_los_datos_en_la_pantalla_de_Mantenimiento() {
		clientReglasSteps.editDatos(3);
	}
	
	@Then("^se visualizara los datos modificados en la pagina Lista Reglas Comerciales$")
	public void se_visualizara_los_datos_modificados_en_la_pagina_Lista_Reglas_Comerciales() {

	    resource.waitSeconds(5);
	    System.out.println("Se modifico correctamente");
	}
	
}
