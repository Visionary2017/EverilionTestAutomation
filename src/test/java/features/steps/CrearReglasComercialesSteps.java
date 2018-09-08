package features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.ClientReglasSteps;
import features.steps.serenity.UserLoginSteps;
import net.thucydides.core.annotations.Steps;
import utilitario.Resource;

public class CrearReglasComercialesSteps {

	Resource resource;
	
	@Steps
	UserLoginSteps userLoginSteps;
	
	@Steps
	ClientReglasSteps clientReglasSteps;
	
	@Given("^que ingresamos a la Pagina de Mantenimiento para agregar una nueva Regla Comercial$")
	public void que_ingresamos_a_la_Pagina_de_Mantenimiento_para_agregar_una_nueva_Regla_Comercial() {
	    
	    userLoginSteps.loadEverilion();
	    resource.waitSeconds(5);
	    userLoginSteps.autenticacion("48676537", "everis");
	    resource.waitSeconds(5);
	    clientReglasSteps.optionClients();
	    resource.waitSeconds(5);
	    clientReglasSteps.searchClient(true);
	}

	@When("^el Gestor de Flotas ingresa los datos requeridos: Digitara Nombre de la Regla, Descripcion$")
	public void el_Gestor_de_Flotas_ingresa_los_datos_requeridos_Digitara_Nombre_de_la_Regla_Descripcion() {
	    
		resource.waitSeconds(5);
		clientReglasSteps.ingresarNombreDesripcion();
	}
	
	@When("^Escoge un dia en los que abastecera, Rango Horas de Abastecimiento\\(Desde - Hasta\\)$")
	public void escoge_un_dia_en_los_que_abastecera_Rango_Horas_de_Abastecimiento_Desde_Hasta() {
		
	    clientReglasSteps.checkUnDiaRangoHoras();
	}

	@When("^Escoge dos dias a mas en los que abastecera, Rango Horas de Abastecimiento\\(Desde - Hasta\\)$")
	public void escoge_dos_dias_a_mas_en_los_que_abastecera_Rango_Horas_de_Abastecimiento_Desde_Hasta() {
	    
		clientReglasSteps.checkDiasRangoHoras();
	}
	
	@When("^Escoge todos los dias en los que abastecera, Rango Horas de Abastecimiento\\(Desde - Hasta\\)$")
	public void escoge_todos_los_dias_en_los_que_abastecera_Rango_Horas_de_Abastecimiento_Desde_Hasta() {
	    
		clientReglasSteps.allCheckDiasRangoHoras();
	}

	@When("^Frecuencia de consumo al dia$")
	public void frecuencia_de_consumo_al_dia() {
	    
	    clientReglasSteps.ingresarFrecuencia();
	}

	@Then("^Seleccionara al opcion Grabar$")
	public void seleccionara_al_opcion_Grabar() {
	    
	    clientReglasSteps.saveRegla();
	}

	@Then("^redireccionara a la Pagina Listado de Reglas Comerciales$")
	public void redireccionara_a_la_Pagina_Listado_de_Reglas_Comerciales() {
	    
	    resource.waitSeconds(5);
	    System.out.println("Se realizo el flujo de crear reglas comerciales correctamente");
	}
	
	/************************/
	@Given("^que el Gestor de Flotas quiere aplicar Estado\\(Activo o Desactivo\\) a las Reglas por Frecuencia$")
	public void que_el_Gestor_de_Flotas_quiere_aplicar_Estado_Activo_o_Desactivo_a_las_Reglas_por_Frecuencia() {

		userLoginSteps.loadEverilion();
	    resource.waitSeconds(5);
	    userLoginSteps.autenticacion("48676537", "everis");
	    resource.waitSeconds(5);
	    clientReglasSteps.optionClients();
	    resource.waitSeconds(5);
	    clientReglasSteps.searchClient(false);
	}
	
	@When("^seleccione un solo item de la grilla$")
	public void seleccione_un_solo_item_de_la_grilla() {

	    clientReglasSteps.checkOne();
	}

	@When("^seleccione aleatoriamente los items de la grilla$")
	public void seleccione_aleatoriamente_los_items_de_la_grilla() {

	    clientReglasSteps.checkRandom();
	}

	@When("^seleccione la opcion all\\(Todos\\) los items de la grilla$")
	public void seleccione_la_opcion_all_Todos_los_items_de_la_grilla() {

	    clientReglasSteps.checkAllReglas();
	}

	@When("^seleccione boton Aplicar estado\\(Activo o Desactivo\\) a los items seleccionados$")
	public void seleccione_boton_Aplicar_estado_Activo_o_Desactivo_a_los_items_seleccionados() {

		clientReglasSteps.saveEstadoReglas();
	}

	@Then("^mostrara el item actualizado\\(Activado o Desactivado\\) en la Grilla$")
	public void mostrara_el_item_actualizado_Activado_o_Desactivado_en_la_Grilla() {

		resource.waitSeconds(5);
		System.out.println("Se realizo correctamente los cambios de estados de las reglas");
	}
	
}
