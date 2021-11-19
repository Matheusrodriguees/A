package Heranca_01;

public class Funcionario {
	// Atributos
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
	}
	public Funcionario(String nome,String cpf,double salario) {
			this.nome = nome;
			this.cpf = cpf;
			this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome1(String nome) {
		if (!(nome.isBlank() && nome.isEmpty()))
			this.nome = nome;
		else 
			System.out.println("Nome deve ser preenchido!"); 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";	
	}
	
}
