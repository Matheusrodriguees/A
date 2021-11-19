package Heranca_02;

public class Main1 {

	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[4];
		
		veiculos[0] = new Veiculo("ABC-4561",2020);
		veiculos[1] = new Onibus("DEF-4500",2021, 60);
		veiculos[2] = new Onibus("GJI-4710",2018, 40);
		veiculos[3] = new Caminhão("KLM-1265",2022, 80);
		
		for(Veiculo veic: veiculos) {
			System.out.println(veic);
		}
	}

}
