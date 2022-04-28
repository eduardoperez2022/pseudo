
// 107- En una playa de estacionamiento cobran $500 la primera hora y $350 
// a partir de la segunda hora en adelante. Diseñe un algoritmo que determine 
// cuánto debe pagar un cliente por el estacionamiento de su vehículo, conociendo 
// el tiempo de estacionamiento en horas.

Algoritmo Estacionamiento
	
	Escribir "Ingresar cantidad de horas:"
	Leer nhoras
	
	primerahora = 500
	segundaomas = 350
	importe = 0
	
	Si nhoras = 1 Entonces
		importe = primerahora
	SiNo
		importe = primerahora
		importe = importe + (segundaomas * (nhoras -1))
	Fin Si
	
	Escribir "Ud debe pagar: ", importe
	
	
FinAlgoritmo

