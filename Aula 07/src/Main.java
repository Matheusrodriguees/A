
public class Main {

	public static void main(String[] args) {
	Data d01 = new Data();
	Data d02 = new Data(8, 9, 2021);
	System.out.println(d01);
	System.out.println(d02);	
		
	Pessoa p01 = new Pessoa("Pim","456789123-45", new Data(12,25,1999));
	System.out.println(p01);
	
	Professor prof01 = new Professor("ana","456123789-85",new Data(12, 9 ,1985),"1212-10");
	System.out.println(prof01);
	
	Aluno aluno01 = new Aluno("Mar","741528963-36", new Data(18,01,2000),"789456-45", 5);
	System.out.println(aluno01);
	
	Funcionario func01 = new Funcionario("bu","963852741-41", new Data(29,06,1988), new Data(19,04,2020), 1800.00f);
	System.out.println(func01);
	
	Gerente ger01 = new Gerente("Maria","121217-44",new Data(3,9,1982), new Data(7,4,2017), 15543.55f, "TI", new Data(1, 1, 2021));
	System.out.println(ger01);
	}
}
