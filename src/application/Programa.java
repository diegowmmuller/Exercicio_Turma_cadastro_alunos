package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;
import entities.Turma;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Turma turma = new Turma();
		
		int opcao;
		
		do {
			System.out.println("\n=== Programa Escolar ===");
			System.out.println("1. Adicionar Aluno");
			System.out.println("2. Listar Aluno");
			System.out.println("3. Calcular Média da turma");
			System.out.println("4. Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			
			case 1:
				System.out.print("Informe o nome do aluno: ");
				String aluno = sc.nextLine();
				System.out.print("Informe a idade: ");
				int idade = sc.nextInt();
				System.out.print("Informe a nota final: ");
				double notaFinal = sc.nextDouble();
				sc.nextLine();
				turma.adicionarAluno(new Aluno(aluno, idade, notaFinal));
				break;
				
			case 2:
				turma.listarAluno();
				break;
				
				
			case 3:
				double media = turma.calculoMediaTotal();
				if (media < 0) {
					System.out.println("Nenhum aluno cadastrado");
				} else {
					System.out.println("\nMédia da turma: " + media);
				}
				break;
			case 4:
				System.out.println("Saindo....");
				break;
				
			default:
				System.out.println("opção inválida, tente novamente.");
			} 
			
			
		} while (opcao != 4);
		
		
		sc.close();
	}

}
