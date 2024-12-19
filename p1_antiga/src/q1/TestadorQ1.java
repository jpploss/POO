package q1;

/**
 * Questão 1 (4 pontos).
 * 
 * Crie classes para representar dados sobre uma empresa com suas unidades organizacionais 
 * (departamentos estruturados em setores) e seus funcionários (lotados em setores). 
 * 
 * Siga o diagrama UML fornecido (diagrama-q1.png). (O diagrama mostra alguns atributos e 
 * algumas operações, mas não é exaustivo quanto aos atributos e operações. 
 * Adicione aqueles que foram necessários.)
 * 
 * Implemente funcionalidade nas suas classes para calcular o salário médio de uma 
 * unidade organizacional, assim como para consultar os funcionários nela lotados 
 * (direta ou indiretamente).
 * 
 * Atenção às indicações de navegabilidade e às cardinalidades.
 * 
 * Sua implementação deve permitir a transferência de um funcionário para outro setor.
 * 
 * Crie um testador para suas classes. 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		Empresa ufes = new Empresa("UFES");

		Departamento ct = new Departamento("CT");
		Setor ct1 = new Setor("CT1");
		Setor ct2 = new Setor("CT2");

		Departamento cce = new Departamento("CCE");
		Setor cce1 = new Setor("CCE1");
		Setor cce2 = new Setor("CCE2");

		Funcionario joao = new Funcionario("Joao", 8000);
		Funcionario pedro = new Funcionario("Pedro", 10500);
		Funcionario ana = new Funcionario("Ana", 9000.5);
		Funcionario tiago = new Funcionario("Tiago", 11500.5);

		ufes.addDepartamento(ct);
		ufes.addDepartamento(cce);

		ct.addSetor(ct1);
		ct.addSetor(ct2);
		ct1.transfereFuncionario(joao);
		ct2.transfereFuncionario(tiago);

		cce.addSetor(cce1);
		cce.addSetor(cce2);
		cce1.transfereFuncionario(pedro);
		cce2.transfereFuncionario(ana);

		System.out.println(ufes);
		cce1.transfereFuncionario(tiago);
		System.out.println(ufes);
	}

}
