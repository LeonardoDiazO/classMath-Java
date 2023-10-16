package ClaseMath;

public class Ejercicio_4 {

	public static void main(String[] args) {
//		Generar 2 números con decimales aleatorios entre 1 y 50, que serán
//		almacenados en dos variables.
//		- Redondear las dos variables anteriormente creadas por medio del método
//		Math.round, Math.floor o Math.ceil.
//		- Calcular el número mayor por medio de Math.max.
//		- Mostrar el número mayor entre ambas variables.
		
		double n1 = Math.random() * 50;
		double n2 = Math.random() * 50;
		
		n1 = Math.round(n1);
		n2 = Math.round(n2);
		
//		n1 = Math.floor(n1);
//		n2 = Math.floor(n2);
		
//		n1 = Math.ceil(n1);
//		n2 = Math.ceil(n2);
		
		double numeroMayor = Math.max(n1, n2);
		
		System.out.println("numero 1 es: " + n1);
		System.out.println("numero 2 es: " + n2);
		System.out.println("El numero mayor de entre n1 y n2 es: " + numeroMayor);
	}

}
