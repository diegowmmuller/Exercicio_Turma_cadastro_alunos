package entities;

import java.util.ArrayList;
public class Turma {
	
	private ArrayList<Aluno> alunos;
		
	public Turma() {
		this.alunos = new ArrayList<>();
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		System.out.printf("Aluno %s adicionado com sucesso.", aluno);
	}
	
	public void listarAluno() {
		if (alunos.isEmpty()) {
			System.out.println("A turma está vazia");
		}
		else {
			for (Aluno aluno: alunos) {
				System.out.println(aluno);
			}
		}
	}
	
	public double calculoMediaTotal() {
		if (alunos.isEmpty()) {
			return (double)0;
		} else {
			double soma = 0;
			for (Aluno aluno : alunos) {
				soma = soma + aluno.getNotaFinal();				 
			} return  soma / alunos.size();
		} 
	}
}
