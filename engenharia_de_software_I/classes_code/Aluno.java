public class Aluno {
    private String turma;
    private String nomeAluno;
    private int RA;

    public Aluno(String turma, String nomeAluno, int RA) {
        this.turma = turma;
        this.nomeAluno = nomeAluno;
        this.RA = RA;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNomeAluno() {
         return nomeAluno;
    }

    public void Imprimir() {
        System.out.println("Turma: " +  turma);
        System.out.println("Nome do Aluno: " +  nomeAluno);
        System.out.println("RA: " +  RA);
    }
}
