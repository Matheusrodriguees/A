package exer1;

public class Cavalo extends Mamifero implements AnimalDomesticado{
	Cavalo(){
	}
	
	@Override
	public void amamentar() {
		System.out.println("Amamentando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Relinchando...");
	}

	@Override
	public void levarVeteriano() {
		System.out.println("Estou doente. Minha pata esta doendo... Indo ao m�dico...");
	}

	@Override
	public void alimentar() {
		System.out.println("Hora do rango...");
	}
}