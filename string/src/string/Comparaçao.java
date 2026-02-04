package string;

public class Comparaçao {
	public static void main(String[] args) {
		String str = new String("teste equals");

		String str2 = new String("teste equals");

		if(str == str2)

		System.out.println("iguais (==)");

		else

		System.out.println("diferentes (==)");

		if(str.equals(str2))

		System.out.println("iguais (equals)");

		else

		System.out.println("diferentes (equals)");
	}

}
