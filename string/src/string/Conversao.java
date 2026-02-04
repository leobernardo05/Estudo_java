package string;

public class Conversao {
	public static void main(String[] args) {
		/*Exercício de Strings:
         1)inicialize uma string e 
         a)imprima o seu tamanho
         b)imprima a string com todos os caracteres maiúsculos e com todos os caracteres minúsculos
         c)capitalize a string (caracteres iniciais das palavras devem ser convertidos para maiúsculo). 
         obs: teste sua solução com strings diferentes e com último caracter em branco.*/
		
		   
		  String s1 = "aula de LPOOED testando com string diferente da inicial";

	       System.out.println("tamanho: "+s1.length());

	       System.out.println("Conversão maiúsculas: "+s1.toUpperCase());

	       System.out.println("Conversão minúsculas: "+s1.toLowerCase());

	       

	       char arr[] = s1.toCharArray();

	       

	       arr[0] = Character.toUpperCase(arr[0]);

	       for(int i = 0; i < arr.length-1; i++) {

	           if(arr[i] == ' ')

	               arr[i+1] = Character.toUpperCase(arr[i+1]);

	       }

	    System.out.println("Conversão das iniciais:");

	       System.out.println(arr);

	}

}
