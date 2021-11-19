import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		
		//System.out.println("Hello World!!! Java!!!");
		//System.out.print(" Mensagem 2\n");
        //System.out.print(" Mensagem 3\n");
        
        // Declarando variaveis no Java
        String nome = "José";
        int idade = 10;
        double altura = 1.58;
        float peso = 52.5f;
        
        Scanner meuScanner = new Scanner(System.in);
        System.out.print("Entre com o nome: ");
        nome = meuScanner.nextLine();
        
        System.out.print("Entre com a idade: ");
        idade = meuScanner.nextInt();
        
        System.out.print("Entre com a Altura: ");
        altura = meuScanner.nextDouble();
        
        System.out.print("Entre com o Peso: ");
        peso = meuScanner.nextFloat();
        
        System.out.println("Nome.: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("peso: "+ peso);
	}

}
