Algoritmo Ejercicio12
	Definir hombres, mujeres, sumAlH, sumAlM, sumaEdad, Altura, contador Como Entero
	Definir promAlH, promAltM, promEdad Como Real
	Repetir
		Escribir  "Datos de persona ",(contador+1)
		Escribir  "ingrese la altura (cm)"
		leer Altura
		Si Altura > 0 Entonces
			Escribir "ingrese la edad: "
			leer edad
			Escribir "ingrese el sexo (M/F)"
			leer sexo
			sumaEdad <- sumaEdad + edad
			contador <- contador + 1
			Si sexo ="M" O sexo = "m" Entonces
				sumAlH <- sumAlH + Altura
				hombres <- hombres +1
			Fin Si
			Si sexo ="F" O sexo = "f" Entonces
				sumAlM <- sumAlM + Altura
				mujeres <- mujeres + 1
			Fin Si
		SiNo
			Escribir "No existen alturas negativas "
		Fin Si
	Hasta Que Altura < 0
	promAlH <- sumAlH/hombres
	promAltM <- sumAlM/mujeres
	promEdad <- sumaEdad/ contador
	Escribir "Promedio de altura de mujeres es: ", promAltM
	Escribir "Promedio de altura de los hombres es: ", promAlH
	Escribir "Promedio de edad de los participantes; ", promEdad
	
FinAlgoritmo
