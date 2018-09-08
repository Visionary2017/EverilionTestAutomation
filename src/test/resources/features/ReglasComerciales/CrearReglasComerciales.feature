Feature: Crear Reglas Comerciales
	Test Automatizado
	
	Scenario: Validar Registro Regla Comercial_Un día
		Given que ingresamos a la Pagina de Mantenimiento para agregar una nueva Regla Comercial
		When el Gestor de Flotas ingresa los datos requeridos: Digitara Nombre de la Regla, Descripcion
		And Escoge un dia en los que abastecera, Rango Horas de Abastecimiento(Desde - Hasta)
		And Frecuencia de consumo al dia
		Then Seleccionara al opcion Grabar
		And redireccionara a la Pagina Listado de Reglas Comerciales
	
	Scenario: Validar Registro Regla Comercial_Dos a más
		Given que ingresamos a la Pagina de Mantenimiento para agregar una nueva Regla Comercial
		When el Gestor de Flotas ingresa los datos requeridos: Digitara Nombre de la Regla, Descripcion
		And Escoge dos dias a mas en los que abastecera, Rango Horas de Abastecimiento(Desde - Hasta)
		And Frecuencia de consumo al dia
		Then Seleccionara al opcion Grabar
		And redireccionara a la Pagina Listado de Reglas Comerciales
		
	Scenario: Validar Registro Regla Comercial_Todos
		Given que ingresamos a la Pagina de Mantenimiento para agregar una nueva Regla Comercial
		When el Gestor de Flotas ingresa los datos requeridos: Digitara Nombre de la Regla, Descripcion
		And Escoge todos los dias en los que abastecera, Rango Horas de Abastecimiento(Desde - Hasta)
		And Frecuencia de consumo al dia
		Then Seleccionara al opcion Grabar
		And redireccionara a la Pagina Listado de Reglas Comerciales
	
	
	
	
	Scenario: Validar Aplicación de campos seleccionados_Un Item
		Given que el Gestor de Flotas quiere aplicar Estado(Activo o Desactivo) a las Reglas por Frecuencia
		When seleccione un solo item de la grilla
		And seleccione boton Aplicar estado(Activo o Desactivo) a los items seleccionados
		Then mostrara el item actualizado(Activado o Desactivado) en la Grilla
	
	Scenario: Validar Aplicación de campos seleccionados_Más Item
		Given que el Gestor de Flotas quiere aplicar Estado(Activo o Desactivo) a las Reglas por Frecuencia
		When seleccione aleatoriamente los items de la grilla
		And seleccione boton Aplicar estado(Activo o Desactivo) a los items seleccionados
		Then mostrara el item actualizado(Activado o Desactivado) en la Grilla
	
 	Scenario: Validar Aplicación Masiva
		Given que el Gestor de Flotas quiere aplicar Estado(Activo o Desactivo) a las Reglas por Frecuencia
		When seleccione la opcion all(Todos) los items de la grilla
		And seleccione boton Aplicar estado(Activo o Desactivo) a los items seleccionados
		Then mostrara el item actualizado(Activado o Desactivado) en la Grilla
	 
	 
		