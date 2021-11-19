package Heranca_02;

public class Caminhão extends Veiculo {
	private int eixos;

	public Caminhão() {
	}
	
	public Caminhão(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}
	
	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public String toString() {
		return "Caminhão[eixos"+eixos+"]" + super.toString();
	}
}