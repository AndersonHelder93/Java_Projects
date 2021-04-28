import java.util.List;

public class Test {

	public static void main(String[] args) {
		/*Aluno a1 = new Aluno ();
		a1.setNome("João Silva");
		a1.setEmail("teste@teste.com");
		a1.setMatricula("123456");
		a1.setSenha("123");
		a1.setConfirmacaosenha("123");
		
		Aluno a2 = new Aluno ();
		a2.setNome("Pedro");
		a2.setEmail("teste@teste2.com");
		a2.setMatricula("246810");
		a2.setSenha("1234");
		a2.setConfirmacaosenha("1234");
		
		Aluno a3 = new Aluno ();
		a3.setNome("Cascudo");
		a3.setEmail("teste2@teste.com");
		a3.setMatricula("654321");
		a3.setSenha("12345");
		a3.setConfirmacaosenha("12345");*/
		
		AlunoController con = new AlunoController();
		
		List<Aluno> alunos = (List<Aluno>) con.listar();
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Nome: "+alunos.get(i).getNome() + " - Idade: "+alunos.get(i).getEmail()+ " - Matricula "+alunos.get(i).getMatricula());
		}
		
			/*con.salvar(a1);
			con.salvar(a2);
			con.salvar(a3);
			con.remover(a1);*/
		
	}

}
