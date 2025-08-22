import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();

        turma.adicionarAluno(new Aluno("Thayná", 1, 10.0, 10.0));
        turma.adicionarAluno(new Aluno("Adrielle", 2, 7.0, 6.0));
        turma.adicionarAluno(new Aluno("Herllan", 3, 5.0, 9.0));
        
        turma.ListarAlunos();

        System.out.println("===== Buscar Aluno =====");
        System.out.println("Digite a matrícula");

        int matricula = sc.nextInt();
        turma.buscarPorMatricula(matricula);
        sc.close();
    }
}