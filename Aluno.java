public class Aluno{
    //Atributos
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    //Construtor
    public Aluno(String nome, int matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Métodos
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String situacao(){
        if(calcularMedia() >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
   public String toString(){   
        return String.format("Aluno: " + nome +
         " Matrícula: " + matricula +
         " Nota 1: " + nota1 + 
         " Nota 2: " + nota2 + 
         " Média: " + calcularMedia() +
         " Situação: " + situacao());
    }

    public void exibirInfo() {
        System.out.println(toString());
      
    }

    public int getMatricula() {
        return matricula;
    }

}


