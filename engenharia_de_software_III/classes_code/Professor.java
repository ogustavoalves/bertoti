public class Professor {
    private String nomeProfessor;
    private String disciplinaLecionada;

    public Professor(String nomeProfessor, String disciplinaLecionada) {
        this.nomeProfessor = nomeProfessor;
        this.disciplinaLecionada = disciplinaLecionada;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setDisciplinaLecionada(String disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }

    public void Imprimir() {
        System.out.println("Nome: " + nomeProfessor);
        System.out.println("Disciplina: " + disciplinaLecionada);
    }
}
