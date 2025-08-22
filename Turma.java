public class Turma { 
    
    private Aluno[] alunos = new Aluno[5]; // Cria um vetor de Aluno com capacidade para 5 alunos
    int quantidade = 0; // Variável que armazena a quantidade atual de alunos cadastrados

    public void adicionarAluno(Aluno aluno) { // Método para adicionar um novo aluno ao vetor
        if (quantidade < alunos.length) { // Verifica se ainda há espaço no vetor
            alunos[quantidade] = aluno; // Adiciona o aluno na próxima posição disponível
            quantidade++; // Adiciona +1 a quantidade de alunos cadastrados
        }
    }

    public void ListarAlunos() { // Método para exibir informações de todos os alunos cadastrados
        System.out.println("====== Lista ======");
        for (int i = 0; i < quantidade; i++) { // Percorre apenas as posições preenchidas do vetor
            alunos[i].exibirInfo(); // Método para exibir as informações
        }
    }

    public Aluno buscarPorMatricula(int matricula) { // Método para buscar um aluno pela matrícula
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].getMatricula() == matricula) { // Verifica se a matrícula bate com a procurada
                alunos[i].exibirInfo(); // Retorna as info do aluno encontrado
            }else{
                System.out.println("Aluno não encontrado.");
            }   
        }
        return null; // Retorna null se não encontrar nenhum aluno com a matrícula informada
    }
}