
// 102. Crear un algoritmo en pseudoc�digo que pueda resolver la siguiente l�gica, usando como datos de entrada seis 
// variables: nombre de candidato, estado civil, disposici�n a viajar si o no, cantidad de hijos, posee titulo universitario si o no, 
// cantidad de a�os de experiencia.
// El candidato ser� tenido en cuenta para el puesto si cumple lo siguiente:
// 1 - si es soltero, y tiene titulo universitario o posee 4 a�os de experiencia
// 2 - si es casado, y tiene titulo universitario o posee 4 a�os de experiencia, y no tiene hijos.
// 3 - solo se aceptan candidatos con disposici�n a viajar

Algoritmo Postulantes
	
	Escribir "Ingrese los datos:"
	
	Escribir "Nombre:"
	Leer nombre
	
	Escribir "Estado Civil, 0-soltero 1-casado:"
	Leer estado_civil
	
	Escribir "Disposicion a viajar, 0-No 1-Si:"
	Leer disp_viaje
	
	Escribir "Numero de hijos:"
	Leer numero_hijos
	
	Escribir "Posee titulo universitario,  0-No 1-Si:"
	Leer titulo
	
	Escribir "A�os de experiencia:"
	Leer experiencia
	
	
	escribir "  " , nombre, ", ", estado_civil, ", ", disp_viaje, ", ", numero_hijos, ", ", titulo, ", ", experiencia
	
	resultado = "No puede aplicar"
	
	Si disp_viaje = 1 Entonces
		Si estado_civil = 0 Entonces
			Si titulo = 1 O experiencia > 4 Entonces  // es verdadera si al menos uno es verdadero
				resultado = "Si puede aplicar"
			Fin Si
		SiNo
			Si titulo = 1 O experiencia > 4 Entonces
				Si numero_hijos = 0 Entonces
					resultado = "Si puede aplicar"
				FinSi
			Fin Si
		Fin Si
	Fin Si
	
	Escribir "El candidato ", nombre , ": " , resultado
	
FinAlgoritmo