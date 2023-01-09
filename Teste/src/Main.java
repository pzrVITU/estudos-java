import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y=32; /*Declaração de variavel*/
		double x=10.35784; /*Declaração de variavel*/
		
		System.out.println ("Olá mundo!"); /* Println, LN significa quebra de linha */

		System.out.println("Bom dia"); /* Print sem LN, significa que nao tem quebra de linha */
		
		System.out.println(y); /* Escrita de variaveis declaradas e iniciadas */
		
		System.out.println(x); /* Escrita de variavel de ponto flutuante */
		
		System.out.printf("%.2f%n", x); /* Controle de casas declaradas do ponto flutuante */
		
		System.out.printf("%.4f%n", x); /* Controle de casas declaradas do ponto flutuante */
		
		Locale.setDefault(Locale.US); /* Configuração de localidade que o programa vai definir */
		
		System.out.printf("%.4f%n", x); /* Demonstração que agora o separador está como se fosse da localidade 'US(Estados Unidos)'*/
		
		System.out.println("Resultado = " + x + " Metros"); /* Println concatenado com varios elementos em um mesmo comando*/
		
		System.out.printf("Resultado = %.2f Metros%n", x); /* Printf concatenado com varios elementos em um memso comando*/
		
		String nome = "Danylo"; /*Declaração de variavel*/
		int idade = 26; /*Declaração de variavel*/
		double renda = 5482.45; /*Declaração de variavel*/
		
		System.out.printf("%s tem %d anos e recebe atualmente R$ %.2f%n", nome, idade, renda); /*Escrita de varios valores interpolados em um mesmo comando*/
		
		
	}

}
