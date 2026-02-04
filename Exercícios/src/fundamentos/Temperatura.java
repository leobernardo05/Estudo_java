package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F-32) x 5/9 = °C
		final double ajuste = 32;
		final double fator = 5.0 / 9;

		double x = 86;
		double temperatura = (x - ajuste) * fator;
		System.out.println("temperatura em °C = " + temperatura);
		
		double y = 150;
		double celsius = (y	 - ajuste) * fator;

		System.out.println("temperatura em °C = " + celsius);

		
	}
}
