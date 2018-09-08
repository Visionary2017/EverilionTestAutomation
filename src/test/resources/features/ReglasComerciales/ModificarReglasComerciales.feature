Feature: Modificar Reglas Comerciales
	Test Automatizada
	
	Scenario: Modificar Registro_Un Dato
		Given que el Gestor de Flotas quiere modificar el registro seleccionado
		When se muestre los datos del item seleccionado a la pagina de Mantenimiento de Reglas Comerciales
		And se procedera a modificacion de un dato(Nombre de Regla, Descripcion, Dias en los que abastece, Hora, Frecuencia)
		Then se guardara el dato modificado en el boton Crear nueva Regla Comercial
		And se visualizara los datos modificados en la pagina Lista Reglas Comerciales
		
	Scenario: Modificar Registro_Dos a más datos
		Given que el Gestor de Flotas quiere modificar el registro seleccionado
		When se muestre los datos del item seleccionado a la pagina de Mantenimiento de Reglas Comerciales
		And se procedera a modificacion de dos datos a mas(Nombre de Regla, Descripcion, Dias en los que abastece, Hora, Frecuencia)
		Then se guardara los datos modificados en el boton Crear nueva Regla Comercial
		And se visualizara los datos modificados en la pagina Lista Reglas Comerciales
		
	Scenario: Modificar Registro_Todos
		Given que el Gestor de Flotas quiere modificar el registro seleccionado
		When se muestre los datos del item seleccionado a la pagina de Mantenimiento de Reglas Comerciales
		Then se procedera a modificacion de todos los datos en la pantalla de Mantenimiento
		And se guardara los datos modificados en el boton Crear nueva Regla Comercial
		And se visualizara los datos modificados en la pagina Lista Reglas Comerciales
		