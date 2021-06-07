Algoritmo pares_impares
	Escribir "Ingrese un número entero"
	Leer N
	i=0
	par=0
	impar=0
	Mientras i<N Hacer
		i=i+1
		num=Aleatorio(1,100)
		Si num Mod 2=0
			par=par+1
			Escribir num " Es Par"
		SiNo
			impar=impar+1
			Escribir num " Es impar"
		FinSi
	FinMientras
	Escribir "Total Pares " par
	Escribir "Total Impar " impar
FinAlgoritmo
