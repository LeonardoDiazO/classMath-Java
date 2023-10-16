package ClaseMath;

public class Ejercicio_3 {

	public static void main(String[] args) {
//		Generar 5 números aleatorios entre 0 y 10, que serán almacenados en 5
//		variables llamadas, “nota1”, “nota2” …, utilizar el método Math.random.
//		- Calcular el promedio de las 5 notas.
//		- Mostrar el resultado del promedio en pantalla.
		
//		Con el double los valores son decimales que no estan contemplados en las notas.
//		double nota1 =  (Math.random() * 10);
//		double nota2 =  (Math.random() * 10);
//		double nota3 =  (Math.random() * 10);
//		double nota4 =  (Math.random() * 10);
//		double nota5 =  (Math.random() * 10);
		
//		Con el casteo a entero (int) el valor se convierte en valores redondeados
		int nota1 = (int) (Math.random() * 10);
		int nota2 = (int) (Math.random() * 10);
		int nota3 = (int) (Math.random() * 10);
		int nota4 = (int) (Math.random() * 10);
		int nota5 = (int) (Math.random() * 10);
		
		double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) /5;
		
		System.out.println("El promedio de las notas es: " + promedio);
		
	}

}
