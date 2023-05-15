import java.util.ArrayList;

public class Sala {
    private String turma;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private Professor professor;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();


    public Sala(String turma) {
        this.turma = turma;

    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setListaAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplinas(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void exibeListaAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).getNomeAluno());
        }
    }

    public void exibeDisciplinas() {
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(disciplinas.get(i).getNomeDisciplina());
        }
    }

}
