package Exemplos_modificados_Static;

public class Main {

	public static void main(String[] args) {

		System.out.println(Funcaomatematicas.exponencial(5, 2));
		System.out.println(Funcaomatematicas.fatorial(5));
		System.out.println(Funcaomatematicas.soma(5, 7));
		System.out.println(Funcaomatematicas.subtra��o(5, 7));
	
		System.out.println("Total de Pessoas="+Pessoa.getTotalPessoas());
		Pessoa p01 = new Pessoa(1, "Pedro");
		System.out.println(p01);
		System.out.println("Total de Pessoas="+Pessoa.getTotalPessoas());
		
		Pessoa p02 = new Pessoa(2, "Andr�");
		System.out.println(p02);
		System.out.println("Total de Pessoas="+Pessoa.getTotalPessoas());
		
		Pessoa p03 = new Pessoa(3, "Ana");
		System.out.println(p03);
		System.out.println("Total de Pessoas="+Pessoa.getTotalPessoas());
		
		Pessoa p04 = new Pessoa(77, "Maria");
		System.out.println(p04);
		System.out.println("Total de Pessoas="+Pessoa.getTotalPessoas());
	}

}
