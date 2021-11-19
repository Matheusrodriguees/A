
public class Funcionario extends Pessoa {
	//Atributos
	private Data dfAdmissao;
	private float salario;
	
	//construdor
	public Funcionario() {
	}
	public Funcionario(String nome, String identidade, Data dtNascimento, Data dfAdmissao, float salario) {
		super(nome, identidade, dtNascimento);
		this.dfAdmissao = dfAdmissao;
		this.salario = salario;
	}
	public Data getDfAdmissao() {
		return dfAdmissao;
	}
	public void setDfAdmissao(Data dfAdmissao) {
		this.dfAdmissao = dfAdmissao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [dfAdmissao=" + dfAdmissao + ", salario=" + salario + "] "+ super.toString();
	}
	
	
}
