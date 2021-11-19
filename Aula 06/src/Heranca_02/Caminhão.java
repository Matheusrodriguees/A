package Heranca_02;

public class Caminh�o extends Veiculo {
	private int eixos;

	public Caminh�o() {
	}
	
	public Caminh�o(String placa, int ano, int eixos) {
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
		return "Caminh�o[eixos"+eixos+"]" + super.toString();
	}
}