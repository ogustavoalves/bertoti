public class main {
    public static void main (String [] args) {
        Professor professor1 = new Professor("Augusto", "Geografia");
        Professor professor2 = new Professor("Marco", "Matemática");

        Disciplina disciplina1 = new Disciplina("Geografia", 80);
        Disciplina disciplina2 = new Disciplina("Matemática", 50);

        Aluno aluno1 = new Aluno("2B", "Joao", 00001);
        Aluno aluno2 = new Aluno("2B", "Maria", 00002);
        Aluno aluno3 = new Aluno("2B", "Julia", 00003);
        Aluno aluno4 = new Aluno("2A", "Muller", 00004);
        Aluno aluno5 = new Aluno("2A", "Thomas", 00005);
        Aluno aluno6 = new Aluno("2A", "Kroos", 00006);

        Sala sala1 = new Sala("2B");
        Sala sala2 = new Sala("2A");

//        professor1.Imprimir();
//        professor2.Imprimir();

//        disciplina1.Imprimir();
//        disciplina2.Imprimir();

        sala1.setListaAlunos(aluno1);
        sala1.setListaAlunos(aluno2);
        sala1.setListaAlunos(aluno3);

        sala1.setDisciplinas(disciplina1);
        sala1.setDisciplinas(disciplina2);


//        sala1.exibeListaAlunos();
//        aluno3.getNomeAluno();
        sala1.exibeDisciplinas();
    }
}
