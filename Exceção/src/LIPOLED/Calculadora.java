package LIPOLED;

public class Calculadora {

	public float divisao(float num, float den) throws Exception {

		if (num == 0 && den == 0) {
			System.out.println("Indeterminação");
		}
		
		if (den == 0) {
			System.out.println("tentativa de divisão por 0!");
		}
		
		return num/den;

	}

}
