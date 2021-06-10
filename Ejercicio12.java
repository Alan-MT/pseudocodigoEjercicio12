import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int contador = 0;
		int hombres = 0;
		int mujeres = 0;
		int sumaedad = 0;
		int sumalh = 0;
		int sumalm = 0;
		int altura = 0;
		do {
			System.out.println("Datos de persona "+(contador+1));
			System.out.println("ingrese la altura (cm)");
			altura = sca.nextInt();
			if (altura>0) {
				System.out.println("ingrese la edad: ");
				int edad = sca.nextInt();
				System.out.println("ingrese el sexo (M/F)");
				String sexo = sca.next();
				sumaedad = sumaedad+edad;
				contador += 1;
				if (sexo.equals("M") || sexo.equals("m")) {
					sumalh = sumalh+altura;
					hombres = hombres+1;
				}
				if (sexo.equals("F") || sexo.equals("f")) {
					sumalm += sumalm +altura;
					mujeres += mujeres+1;
				}
			} else {
				System.out.println("No existen alturas negativas ");
			}
		} while(altura<0);

		double promalh = sumalh/hombres;
		double promaltm = sumalm/mujeres;
		double promedad = sumaedad/contador;
		System.out.println("Promedio de altura de mujeres es: "+promaltm);
		System.out.println("Promedio de altura de los hombres es: "+promalh);
		System.out.println("Promedio de edad de los participantes; "+promedad);
	}


}

