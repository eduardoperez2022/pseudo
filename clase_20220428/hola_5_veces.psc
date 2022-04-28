
// 101. Crear un algoritmo en pseudocódigo que escriba "Hola" cinco veces. Implementar el algoritmo usando al menos 
// 3 formas distintas de codificación, usando solo print, usando un cliclo for (repetir), y usando un ciclo while (mientras).

Algoritmo hola_5_veces
	
	linea = "--------------------"
	
	// forma 1
	Escribir "hola"
	Escribir "hola"
	Escribir "hola"
	Escribir "hola"
	Escribir "hola"
	
	Escribir linea
	
	// forma 2 usando for (para)
	Para cuenta = 1 hasta 5 Con Paso 1 Hacer
		Escribir "hola"
	Fin Para
	
	Escribir linea
	
	// forma 3 usando fwhile (mientras)
	cuenta = 1
	Mientras cuenta < 6 Hacer
		Escribir "hola"
		cuenta = cuenta + 1
	Fin Mientras
	
	
FinAlgoritmo
